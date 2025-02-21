package edu.usarb.oop.dataType.user;

import java.util.Scanner;

public class UserDataApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        double result = 0;
        char ap = ' ';
        boolean flag = true;
        while (true) {
            System.out.print("Enter number 1: ");
            if (scanner.hasNextDouble()) {
                number1 = scanner.nextDouble();
                break;
            } else {
                System.out.print("Ivalid number ! please try again: ");
                scanner.next();
            }

        }
        while (true) {
            System.out.print("Enter number 2: ");
            if (scanner.hasNextDouble()) {
                number2 = scanner.nextDouble();
                break;
            } else {
                System.out.print("Ivalid number ! please try again: ");
                scanner.next();
            }
        }

        while (flag) {
            System.out.print("Enter operation: ");
            ap = scanner.next().charAt(0);
            switch (ap) {
                case '+':
                    result = (number1 + number2);
                    flag = false;
                    break;
                case '-':
                    result = (number1 - number2);
                    flag = false;
                    break;
                case '*':
                    result = (number1 * number2);
                    flag = false;
                    break;
                case '/':
                    result = (number1 / number2);
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid input operation");
                    break;
            }
        }

            System.out.println(number1 + " " + ap + " " + number2 + " = " + result);
    }
}
