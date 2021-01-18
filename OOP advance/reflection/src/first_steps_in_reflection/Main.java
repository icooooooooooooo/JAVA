package first_steps_in_reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Ref;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class testClass = Reflection.class;

        Method[] methods = testClass.getDeclaredMethods();
        List<Method> setMethods = new ArrayList<>();
        List<Method> getMethods = new ArrayList<>();
        for (Method method : methods) {
            if (method.getName().startsWith("set")) {
                if (method.getReturnType().getSimpleName() == "void") {
                    if (method.getParameterTypes().length > 0) {
                        setMethods.add(method);
                    }
                }
            } else if (method.getName().startsWith("get")) {
                if (method.getReturnType().getSimpleName() != "void") {
                    if (method.getParameterTypes().length == 0) {
                        getMethods.add(method);
                    }
                }
            }
        }

        getMethods.sort((m1, m2) -> m1.getName().compareTo(m2.getName()));
        setMethods.sort((m1, m2) -> m1.getName().compareTo(m2.getName()));

        for (Method getMethod : getMethods) {
            System.out.println(
                    String.format(
                            "%s will return %s", getMethod.getName(), getMethod.getReturnType().getSimpleName()
                    ));
        }
        for (Method setMethod : setMethods) {
            System.out.println(
                    String.format(
                            "%s and will set field of %s", setMethod.getName(), setMethod.getParameterTypes()[0].getSimpleName()
                    ));
        }



/* homework task 1
        Class classType = Reflection.class;

        System.out.println(classType.getTypeName());
        System.out.println(classType.getSuperclass());

        Class[] interfaces = classType.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }

        Reflection newReflection = (Reflection) classType.getDeclaredConstructor().newInstance();
        System.out.println(newReflection);
 */


    }
}
