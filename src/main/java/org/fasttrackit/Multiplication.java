package org.fasttrackit;

import java.util.Scanner;

public class Multiplication {

    public double multiply(double firstNumber, double secondNumber, double multiplication){
        System.out.println("Hi. I'll multiply two numbers for you");

        firstNumber = getFirstNumberInput();

        secondNumber = getSecondNumberInput();

        multiplication = firstNumber * secondNumber;

        System.out.println("The result is: " + multiplication);

        return multiplication;

    }
    public int multiply(int firstNumber, int secondNumber, int multiplication){
        System.out.println("Hi. I'll multiply two numbers for you");

        firstNumber = getFirstNumberInputInt();

        secondNumber = getSecondNumberInputInt();

        multiplication = firstNumber * secondNumber;

        System.out.println("The result is: " + multiplication);

        return multiplication;

    }

    private double getFirstNumberInput(){
        System.out.println("Please enter the first number:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private double getSecondNumberInput(){
        System.out.println("Please enter the second number.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private int getFirstNumberInputInt(){
        System.out.println("Please enter the second number.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int getSecondNumberInputInt(){
        System.out.println("Please enter the second number.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}
