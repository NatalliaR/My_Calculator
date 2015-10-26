package com.company;

import java.util.Scanner; //Импортируем пакет java.util, который позволит нам работать со сканером

/**
 * Created by natalynka on 10/25/15.
 */
public class Main { //Создаем публичный класс Main

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Создаем экземпляр класса Scanner, который будет считывать вводимые данные

        Calculator calculator = new Calculator();

        while (true) {  //Вечный цикл

            System.out.println(Constants.FIRST_NUMBER);  //Выводим в консоль Enter first number
            int first = scanner.nextInt(); //Считываем первое число

            System.out.println(Constants.SECOND_NUMBER); //Выводим в консоль Enter second number
            int second = scanner.nextInt(); //Считываем второе число

            scanner.nextLine(); //Считываем строку

            System.out.println(Constants.OPERATOR); //Выводим в консоль Enter '+', '-', '/', '*'
            String operation = scanner.nextLine();  //Считываем operation

            try {
                int result = calculator.calculate(first, second, operation);//Вычисляем
                System.out.println(Constants.RESULT + result); //Выводим в консоль The result is: полученное число
            } catch (Exception exception) { //Если в блоке между try и catch происходит ошибка, то выполняем блок catch
                System.out.println(Constants.ERROR_MESSAGE + exception.getMessage()); //Выводим Error:
            }

            System.out.println(Constants.QUESTION_CONTINUE); //Выводим в консоль Do you want to continue? (y/n)
            String answer = scanner.nextLine();//Считываем ответ
            if (!Constants.ANSWER_YES.equalsIgnoreCase(answer)) {//Если ответ не y(Y), то выходим из программы
                break;
            }
        }
    }
}
