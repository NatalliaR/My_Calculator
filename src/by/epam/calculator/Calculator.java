package by.epam.calculator;

/**
 * Created by natalynka on 10/25/15.
 */
public class Calculator {          //Создаем публичный класс Calculator

    public int calculate(int first, int second, Operator operator) {
        if (operator == null) {
            throw new IllegalArgumentException(Constants.ERROR_NULL_OPERATION);
        }
        return operator.apply(first, second);
    }
}




