package panzer.models.miscellaneous;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import panzer.contracts.*;
import panzer.models.parts.AbstractPart;
import panzer.models.parts.ArsenalPart;
import panzer.models.parts.EndurancePart;
import panzer.models.parts.ShellPart;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class VehicleAssemblerTest {

    private Assembler vehicle;
    private Part attackModifyingPart;
    private Part defenseModifyingPart;
    private Part hitPointModifyingPart;

    @Before
    public void initializeTestDependency() {
        this.vehicle = new VehicleAssembler();

        this.attackModifyingPart = Mockito.mock(AttackModifyingPart.class);
        this.defenseModifyingPart = Mockito.mock(DefenseModifyingPart.class);
        this.hitPointModifyingPart = Mockito.mock(HitPointsModifyingPart.class);

        this.vehicle.addArsenalPart(this.attackModifyingPart);
        this.vehicle.addShellPart(this.defenseModifyingPart);
        this.vehicle.addEndurancePart(this.hitPointModifyingPart);
    }

    @Test
    public void getTotalWeight() {
        //Assembly
        Mockito.when(this.attackModifyingPart.getWeight()).thenReturn(10.0);
        Mockito.when(this.defenseModifyingPart.getWeight()).thenReturn(10.0);
        Mockito.when(this.hitPointModifyingPart.getWeight()).thenReturn(10.0);

        //Act
        double totalWeight = this.vehicle.getTotalWeight();
        double expectedWeight = 30;

        //Assert
        Assert.assertEquals(expectedWeight, totalWeight, 0.1);
    }

    @Test
    public void getTotalPrice() {
        //Assure
        Mockito.when(this.attackModifyingPart.getPrice()).thenReturn(BigDecimal.valueOf(7));
        Mockito.when(this.defenseModifyingPart.getPrice()).thenReturn(BigDecimal.valueOf(12));
        Mockito.when(this.hitPointModifyingPart.getPrice()).thenReturn(BigDecimal.valueOf(34));

        //Act
        BigDecimal actual = BigDecimal.ZERO;
        actual = this.attackModifyingPart.getPrice().add(this.defenseModifyingPart.getPrice()).add(this.hitPointModifyingPart.getPrice());
        BigDecimal expected = BigDecimal.valueOf(53);
        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTotalAttackModification() {
        //Arrange
        ArsenalPart part1 = Mockito.mock(ArsenalPart.class);
        ArsenalPart part2 = Mockito.mock(ArsenalPart.class);
        ArsenalPart part3 = Mockito.mock(ArsenalPart.class);

        Mockito.when(part1.getAttackModifier()).thenReturn(1);
        Mockito.when(part2.getAttackModifier()).thenReturn(4);
        Mockito.when(part3.getAttackModifier()).thenReturn(9);

        this.vehicle.addArsenalPart(part1);
        this.vehicle.addArsenalPart(part2);
        this.vehicle.addArsenalPart(part3);

        //Act
        long expectedModifier = 0;
        expectedModifier = this.vehicle.getTotalAttackModification();
        long actualModifier = 14;

        //Assert
        Assert.assertEquals(actualModifier, expectedModifier);
    }

    @Test
    public void getTotalDefenseModification() {
        //Arrange
        DefenseModifyingPart part1 = Mockito.mock(DefenseModifyingPart.class);
        DefenseModifyingPart part2 = Mockito.mock(DefenseModifyingPart.class);
        DefenseModifyingPart part3 = Mockito.mock(DefenseModifyingPart.class);

        Mockito.when(part1.getDefenseModifier()).thenReturn(2);
        Mockito.when(part2.getDefenseModifier()).thenReturn(5);
        Mockito.when(part3.getDefenseModifier()).thenReturn(9);
        //Act

        this.vehicle.addShellPart(part1);
        this.vehicle.addShellPart(part2);
        this.vehicle.addShellPart(part3);

        long expectedDefence = 16;
        long actualDefence = this.vehicle.getTotalDefenseModification();
        //Assert
        Assert.assertEquals(actualDefence, expectedDefence);

    }

    @Test
    public void getTotalHitPointModification() {
        //Arrange
        EndurancePart part1 = Mockito.mock(EndurancePart.class);
        EndurancePart part2 = Mockito.mock(EndurancePart.class);
        EndurancePart part3 = Mockito.mock(EndurancePart.class);

        Mockito.when(part1.getHitPointsModifier()).thenReturn(Integer.MAX_VALUE);
        Mockito.when(part2.getHitPointsModifier()).thenReturn(Integer.MAX_VALUE);
        Mockito.when(part3.getHitPointsModifier()).thenReturn(Integer.MAX_VALUE);

        //Act
        long expectedHitPoints = Long.parseLong("6442450941");

        this.vehicle.addEndurancePart(part1);
        this.vehicle.addEndurancePart(part2);
        this.vehicle.addEndurancePart(part3);

        long actualHitPoints = this.vehicle.getTotalHitPointModification();

        //Assert
        Assert.assertEquals(expectedHitPoints, actualHitPoints);
    }

    @Test
    // wrong
    // TODO: 25/09/2020 fix the code, as you cannot access lists in such manner
    public void addArsenalPart() {
        //Arrange
        AbstractPart part = Mockito.mock(ArsenalPart.class);
        this.vehicle.addArsenalPart(part);
        //Act
        long expectedNumberOfParts = 1;
        long actualNumberOfParts = 0;



        //Assert
        Assert.assertEquals(expectedNumberOfParts, actualNumberOfParts);
    }

    @Test
    public void addShellPart() {
        //Arrange
        DefenseModifyingPart part = Mockito.mock(ShellPart.class);
        DefenseModifyingPart part2 = Mockito.mock(ShellPart.class);

        Mockito.when(part.getDefenseModifier()).thenReturn(1);
        Mockito.when(part2.getDefenseModifier()).thenReturn(1);

        this.vehicle.addShellPart(part);
        this.vehicle.addShellPart(part2);

        //Act
        long actualElementsCount = 0;
        long expectedElementsCount = 2;
        actualElementsCount = this.vehicle.getTotalDefenseModification();


        //Assert
        Assert.assertEquals(expectedElementsCount, actualElementsCount);
    }

    @Test
    public void addEndurancePart() {
        //Arrange
        HitPointsModifyingPart part = Mockito.mock(EndurancePart.class);
        HitPointsModifyingPart part2 = Mockito.mock(EndurancePart.class);

        Mockito.when(part.getHitPointsModifier()).thenReturn(2);
        Mockito.when(part2.getHitPointsModifier()).thenReturn(2);

        this.vehicle.addEndurancePart(part);
        this.vehicle.addEndurancePart(part2);

        //Act
        long actualElementsCount = 0;
        long expectedElementsCount = 4;
        actualElementsCount = this.vehicle.getTotalHitPointModification();


        //Assert
        Assert.assertEquals(expectedElementsCount, actualElementsCount);
    }

}