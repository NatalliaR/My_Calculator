package by.epam.calculator;

/**
 * Created by natalynka on 10/25/15.
 */
public class Main { //Создаем публичный класс Main

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Console console = new Console();
        while (true) {

            console.printMessage(Constants.MESSAGE_FIRST_NUMBER);
            int firstNumber = console.readNumber();

            console.printMessage(Constants.MESSAGE_SECOND_NUMBER);
            int secondNumber = console.readNumber();

            console.printMessage(Constants.MESSAGE_OPERATOR);
            Operator operation = console.readOperator();


            int result = calculator.calculate(firstNumber, secondNumber, operation);
            console.printMessage(Constants.RESULT);
            console.printMessage(String.valueOf(result));

            console.printMessage(Constants.QUESTION_CONTINUE);
            String answer = console.readAnswer();
            if (!Constants.ANSWER_YES.equalsIgnoreCase(answer)) {
                break;
            }
        }
        
    }
}

