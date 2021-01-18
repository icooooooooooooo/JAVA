package pr02PrivateClassFiddling;

import pr02PrivateClassFiddling.com.BlackBoxInt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Engine {
    private Class<?> clazz;
    private Object clazzObject;

    public Engine() throws IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchMethodException {
        this.clazz = Class.forName("pr02PrivateClassFiddling.com." + "BlackBoxInt");
        Constructor<?> constructor = this.clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        this.clazzObject = (BlackBoxInt) constructor.newInstance();


    }

    public void calculate(String command, int value) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = this.clazzObject.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals(command)) {
                method.setAccessible(true);
                method.invoke(this.clazzObject, value);
                Field[] fields = this.clazzObject.getClass().getDeclaredFields();
                Field finalField = fields[1];
                finalField.setAccessible(true);
                System.out.println(finalField.get(this.clazzObject));
            }
        }
    }
}
