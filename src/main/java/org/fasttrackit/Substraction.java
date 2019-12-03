package org.fasttrackit;

import java.util.Scanner;

public class Substraction {

    public void calculate(){
        System.out.println("Hi. I'll substract two numbers for you");

        double firstNumber = getFirstNumberInput();

        double secondNumber = getSecondNumberInput();

        double addition = firstNumber - secondNumber;

        System.out.println("The result is: " + addition);

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
