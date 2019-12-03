package org.fasttrackit;

import java.util.Scanner;

public class Sum {

    public void calculate(){
        System.out.println("Hi. I'm your calculator. I'll add two numbers for you");

        double firstNumber = getFirstNumberInput();

        double secondNumber = getSecondNumberInput();

        double addition = firstNumber + secondNumber;

        System.out.println("The sum will be: " + addition);

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

}


