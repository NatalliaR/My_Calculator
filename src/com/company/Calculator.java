package com.company;

/**
 * Created by natalynka on 10/25/15.
 */
public class Calculator { //Создаем публичный класс Calculator

    public int calculate(int first, int second, String operation) {//Объявляем метод с тремя параметрами

        if (operation == null) { //Проверяем введен ли оператор, если нет, то
            throw new IllegalArgumentException(Constants.ERROR_NULL_OPERATION);//Выводим в консоль Operation must not be null
        }

        operation = operation.trim();//Убираем пробелы

        if (operation.length() != 1) {//Проверяем, если оператор состоит из больше, чем один знак
            throw new IllegalArgumentException(Constants.ERROR_UNSUPPORTED_OPERATION);//Выводим в консоль Unsupported operation
        }

        switch (operation.charAt(0)) {//Проверяем переданный operator
            case '+':// если +, то производим сложение
                return first + second;
            case '-':// и т.д
                return first - second;
            case '/':
                return first / second;
            case '*':
                return first * second;
            default:// если оператор не соответствует ни одному из проверенных, то выводим ошибку
                throw new IllegalArgumentException(Constants.ERROR_UNSUPPORTED_OPERATION);
        }
    }
}
