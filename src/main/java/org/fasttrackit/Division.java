package org.fasttrackit;

import java.util.Scanner;

public class Division {

    public double divide(double firstNumber, double secondNumber, double division){
        System.out.println("Hi. I'll divide two numbers for you");

        firstNumber = getFirstNumberInput();

        secondNumber = getSecondNumberInput();

        division = firstNumber / secondNumber;

        System.out.println("The result is: " + division);

        return division;

    }
    public int divide(int firstNumber, int secondNumber, int division){
        System.out.println("Hi. I'll divide two numbers for you");

        firstNumber = getFirstNumberInputInt();

        secondNumber = getSecondNumberInputInt();

        division = firstNumber / secondNumber;

        System.out.println("The result is: " + division);

        return division;

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
        System.out.println("Please enter the first number:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int getSecondNumberInputInt(){
        System.out.println("Please enter the second number.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
