package org.fasttrackit;

import java.util.Scanner;

public class Substraction {

    public void calculate(){
        System.out.println("Hi. I'll substract two numbers for you");

        double firstNumber = getFirstNumberInputDouble();

        double secondNumber = getSecondNumberInputDouble();

        double addition = firstNumber - secondNumber;

        System.out.println("The result is: " + addition);

    }

    public void calculate(){
        System.out.println("Hi. I'll substract two numbers for you");

        int firstNumber = getFirstNumberInputInt();

        int secondNumber = getSecondNumberInputInt();

        int addition = firstNumber - secondNumber;

        System.out.println("The result is: " + addition);

    }

    private double getFirstNumberInputDouble(){
        System.out.println("Please enter the first number:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private double getSecondNumberInputDouble(){
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
