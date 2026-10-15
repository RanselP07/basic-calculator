package com.pluralsight;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int result = firstNumber * secondNumber;

        System.out.println("Possible calculations:");
        System.out.println("  (A)dd");
        System.out.println("  (S)ubtract");
        System.out.println("  (M)ultiply");
        System.out.println("  (D)ivide");
        System.out.println("Please select an option: M");
        System.out.println();
        System.out.println(firstNumber + " * " + secondNumber + " = " + result);

    }

}
