package org.fasttrackit;

import java.util.Scanner;

public class Sum {

    public double add(double firstNumber, double secondNumber, double addition){
        System.out.println("Hi. I'm your calculator. I'll add two numbers for you");

        firstNumber = getFirstNumberInput();

        secondNumber = getSecondNumberInput();

        addition = firstNumber + secondNumber;

        System.out.println("The result is: " + addition);

        return addition;
    }

    public  int add (int firstNumber, int secondNumber, int addition){
        firstNumber = getFirstNumberInputInt();

        secondNumber = getSecondNumberInputInt();

        addition = firstNumber + secondNumber;

        return  addition;
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
        System.out.println("Please enter the second number:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}


