package dependency_inversion;

import dependency_inversion.annotations.CalculationOperand;
import dependency_inversion.strategies.CalculationStrategy;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrimitiveCalculator {

    private CalculationStrategy strategy;

    private static final String CALCULATION_MODULES = "C:\\Users\\uk14000494\\IdeaProjects\\08. Java-OOP-Advanced-Dip-Isp-Homework-Resources\\AdvancedCommunication\\src\\main\\java\\dependency_inversion\\strategies";
    private static final String CALCULATION_MODULES_REFERENCE = "dependency_inversion.strategies.";

    public PrimitiveCalculator(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(String operator) {
        File modulesDirectory = new File(CALCULATION_MODULES);

        if (modulesDirectory.isDirectory()) {
            File[] files = modulesDirectory.listFiles();
            for (File file : files) {
                try {
                    Class<?> fileClass = Class.forName(CALCULATION_MODULES_REFERENCE + file.getName().replace(".java", ""));
                    if (fileClass.isAnnotationPresent(CalculationOperand.class)) {
                        String annotationValue = fileClass.getAnnotation(CalculationOperand.class).value();

                        if (operator.equals(annotationValue)) {
                            Constructor<?> declaredConstructor = fileClass.getDeclaredConstructor();
                            declaredConstructor.setAccessible(true);
                            CalculationStrategy strategy = (CalculationStrategy) declaredConstructor.newInstance();

                            this.strategy = strategy;
                        }
                    }
                } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int calculate(int firstOperand, int secondOperand) {
        return strategy.calculate(firstOperand, secondOperand);
    }
}
