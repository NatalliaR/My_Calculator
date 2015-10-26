package com.company;

/**
 * Created by natalynka on 10/25/15.
 */
public class Calculator { //������� ��������� ����� Calculator

    public int calculate(int first, int second, String operation) {//��������� ����� � ����� �����������

        if (operation == null) { //��������� ������ �� ��������, ���� ���, ��
            throw new IllegalArgumentException(Constants.ERROR_NULL_OPERATION);//������� � ������� Operation must not be null
        }

        operation = operation.trim();//������� �������

        if (operation.length() != 1) {//���������, ���� �������� ������� �� ������, ��� ���� ����
            throw new IllegalArgumentException(Constants.ERROR_UNSUPPORTED_OPERATION);//������� � ������� Unsupported operation
        }

        switch (operation.charAt(0)) {//��������� ���������� operator
            case '+':// ���� +, �� ���������� ��������
                return first + second;
            case '-':// � �.�
                return first - second;
            case '/':
                return first / second;
            case '*':
                return first * second;
            default:// ���� �������� �� ������������� �� ������ �� �����������, �� ������� ������
                throw new IllegalArgumentException(Constants.ERROR_UNSUPPORTED_OPERATION);
        }
    }
}
