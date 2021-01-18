package entities.miscellaneous;

import entities.miscellaneous.items.CommonItem;
import interfaces.Inventory;
import interfaces.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Map;

import static org.junit.Assert.*;

public class HeroInventoryTest {

    private Inventory inventory;
    public static final int VALUE = Integer.MAX_VALUE;
    public static final String STRENGTH_MESSAGE = "Expected strength is not correct";
    public static final String AGILITY_MESSAGE = "Expected strength is not correct";
    public static final String DAMAGE_MESSAGE = "Expected strength is not correct";
    public static final String HIT_POINTS_MESSAGE = "Expected strength is not correct";
    public static final String INTELLIGENCE_MESSAGE = "Expected strength is not correct";

    @Before
    public void setUp() throws Exception {
        this.inventory = new HeroInventory();
    }

    private Item createMockedCommonItem() {
        Item commonItem = Mockito.mock(Item.class);

        Mockito.when(commonItem.getName()).thenReturn(String.valueOf(Math.random()));

        Mockito.when(commonItem.getAgilityBonus()).thenReturn(VALUE);
        Mockito.when(commonItem.getDamageBonus()).thenReturn(VALUE);
        Mockito.when(commonItem.getHitPointsBonus()).thenReturn(VALUE);
        Mockito.when(commonItem.getIntelligenceBonus()).thenReturn(VALUE);
        Mockito.when(commonItem.getStrengthBonus()).thenReturn(VALUE);
        return commonItem;
    }

    private void seedCommonItems() {

        this.inventory.addCommonItem(createMockedCommonItem());
        this.inventory.addCommonItem(createMockedCommonItem());
        this.inventory.addCommonItem(createMockedCommonItem());
    }

    @Test
    public void getTotalStrengthBonus() {
        this.seedCommonItems();

        long actualTotalStrengthBonus = this.inventory.getTotalStrengthBonus();
        long expected = VALUE * 3L;

        Assert.assertEquals(STRENGTH_MESSAGE, expected, actualTotalStrengthBonus);
    }

    @Test
    public void getTotalAgilityBonus() {
        this.seedCommonItems();

        long actualTotalAgilityBonus = this.inventory.getTotalAgilityBonus();
        long expected = VALUE * 3L;

        Assert.assertEquals(AGILITY_MESSAGE, expected, actualTotalAgilityBonus);
    }

    @Test
    public void getTotalIntelligenceBonus() {
        this.seedCommonItems();

        long actualTotalIntelligenceBonus = this.inventory.getTotalIntelligenceBonus();
        long expected = VALUE * 3L;

        Assert.assertEquals(INTELLIGENCE_MESSAGE, expected, actualTotalIntelligenceBonus);
    }

    @Test
    public void getTotalHitPointsBonus() {
        this.seedCommonItems();

        long actualTotalHitPointsBonus = this.inventory.getTotalHitPointsBonus();
        long expected = VALUE * 3L;

        Assert.assertEquals(HIT_POINTS_MESSAGE, expected, actualTotalHitPointsBonus);
    }

    @Test
    public void getTotalDamageBonus() {
        this.seedCommonItems();

        long actualTotalDamageBonus = this.inventory.getTotalDamageBonus();
        long expected = VALUE * 3L;

        Assert.assertEquals(DAMAGE_MESSAGE, expected, actualTotalDamageBonus);
    }

    @Test
    public void addCommonItem() {
    }

    @Test
    public void addRecipeItem() {
    }
// note to self - do few more test
}