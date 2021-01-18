package dependency_inversion.strategies;

import dependency_inversion.annotations.CalculationOperand;

@CalculationOperand("/")
public class DivideStrategy implements CalculationStrategy {

    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand / secondOperand;
    }
}
