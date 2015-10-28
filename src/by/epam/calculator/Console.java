package by.epam.calculator;

import java.util.Scanner;

/**
 * Created by Natallia_Ramanchyk on 10/28/2015.
 */
public class Console {

    Scanner scanner = new Scanner(System.in); // —оздаем экземпл€р класса Scanner, который будет считывать вводимые данные

    public int readNumber() {
        return scanner.nextInt();
    }
    public String readOperation() {
        return scanner.nextLine();
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
