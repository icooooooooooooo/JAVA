package pr02PrivateClassFiddling;


import java.lang.reflect.InvocationTargetException;

public class Dispatcher {
    private Engine engine;

    public Dispatcher() throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
        this.engine = new Engine();
    }

    public void engine(String[] arguments) throws InvocationTargetException, IllegalAccessException {
        String command = arguments[0];
        int value = Integer.parseInt(arguments[1]);

        engine.calculate(command, value);


    }
}
