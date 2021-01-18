package high_quality_mistakes;

import first_steps_in_reflection.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String coaching = "Your code is full of bugs. You don’t understand encapsulation man";

        int totalMistakes = 0;
        Class testClass = Reflection.class;

        int nonPrivateFieldsCount = 0;
        int fieldsCount = 0;
        int gettersThatAreNotPublic = 0;
        int getters = 0;
        int settersThatAreNotPrivate = 0;
        int setters = 0;

        Field[] fields = testClass.getDeclaredFields();
        for (Field field : fields) {
            fieldsCount++;
            if (!Modifier.isPrivate(field.getModifiers())) {
                nonPrivateFieldsCount++;
            }
        }

        Method[] methods = testClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("set")
                    && method.getReturnType().equals(void.class)
                    && method.getParameterTypes().length > 0) {

                setters++;
                if (!Modifier.isPrivate(method.getModifiers())) {
                    settersThatAreNotPrivate++;
                }
            } else if (method.getName().startsWith("get")
                    && !method.getReturnType().equals(void.class)
                    && method.getParameterTypes().length == 0) {
                getters++;
                if (Modifier.isPrivate(method.getModifiers())) {
                    gettersThatAreNotPublic++;
                }
            }
        }

        int finalScore = fieldsCount - nonPrivateFieldsCount + setters - settersThatAreNotPrivate + getters - gettersThatAreNotPublic;

        if (finalScore > 3) {
            System.out.println(coaching);
        }
    }
}
