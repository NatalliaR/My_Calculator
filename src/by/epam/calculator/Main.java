package by.epam.calculator;

/**
 * Created by natalynka on 10/25/15.
 */
public class Main { //Создаем публичный класс Main

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Console console = new Console();

        console.printMessage(Constants.MESSAGE_FIRST_NUMBER);
        int firstNumber = console.readNumber();

        console.printMessage(Constants.MESSAGE_SECOND_NUMBER);
        int secondNumber = console.readNumber();

        console.printMessage(Constants.MESSAGE_OPERATOR);
        String operation = console.readOperation();




/**        while (true) {  Вечный цикл

 System.out.println(Constants.MESSAGE_FIRST_NUMBER);  Выводим в консоль Enter first number
 int first = scanner.nextInt(); Считываем первое число

 System.out.println(Constants.MESSAGE_SECOND_NUMBER); Выводим в консоль Enter second number
 int second = scanner.nextInt(); Считываем второе число

 scanner.nextLine(); Считываем строку

 System.out.println(Constants.MESSAGE_OPERATOR); Выводим в консоль Enter '+', '-', '/', '*'
 String operation = scanner.nextLine();  Считываем operation

 try {
 int result = calculator.calculate(first, second, operation);Вычисляем
 System.out.println(Constants.RESULT + result); Выводим в консоль The result is: полученное число
 } catch (Exception exception) { Если в блоке между try и catch происходит ошибка, то выполняем блок catch
 System.out.println(Constants.ERROR_MESSAGE + exception.getMessage()); Выводим Error:
 }

 System.out.println(Constants.QUESTION_CONTINUE); Выводим в консоль Do you want to continue? (y/n)
 String answer = scanner.nextLine();Считываем ответ
 if (!Constants.ANSWER_YES.equalsIgnoreCase(answer)) {Если ответ не y(Y), то выходим из программы
 break;
 }
 */}
}

