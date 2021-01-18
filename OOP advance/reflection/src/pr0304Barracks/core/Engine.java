package pr0304Barracks.core;

import jdk.jshell.spi.ExecutionControl;
import pr0304Barracks.contracts.Executable;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.Runnable;
import pr0304Barracks.contracts.UnitFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidKeyException;

public class Engine implements Runnable {
    private static final String COMMAND_ROOT_PATTERN = "pr0304Barracks.core.commands.";

    private Repository repository;
    private UnitFactory unitFactory;

    public Engine(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        while (true) {
            try {
                String input = reader.readLine();
                String[] data = input.split("\\s+");
                String commandName = data[0];
                String result = interpredCommand(data, commandName);
                if (result.equals("fight")) {
                    break;
                }
                System.out.println(result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (IOException | ExecutionControl.NotImplementedException | InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private String interpredCommand(String[] data, String commandName) throws ExecutionControl.NotImplementedException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        try {
            String commandClassName = commandName.toUpperCase().charAt(0) + commandName.substring(1);

            Class<?> clazz = Class.forName(COMMAND_ROOT_PATTERN + commandClassName);

            Constructor<?> constructor = clazz
                    .getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);

            constructor.setAccessible(true);
            Executable desiredClass = (Executable) constructor.newInstance(data, this.repository,
                    this.unitFactory);

            return desiredClass.execute();

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | ExecutionControl.NotImplementedException | InvalidKeyException exception) {
            return exception.getMessage();
        }
    }
}
