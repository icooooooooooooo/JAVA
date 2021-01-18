package pr0304Barracks.core.factories;

import jdk.jshell.spi.ExecutionControl;
import pr0304Barracks.contracts.Unit;
import pr0304Barracks.contracts.UnitFactory;
import pr0304Barracks.models.units.AbstractUnit;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "pr0304Barracks.models.units.";

    @Override
    public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException, NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Unit unit = null;
        try {
            Class aClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor<?> unitConstructor = aClass.getDeclaredConstructor();

            unit = (Unit) unitConstructor.newInstance();
        } catch (IllegalAccessException | NoSuchMethodException exception) {

        }

        return unit;
    }
}
