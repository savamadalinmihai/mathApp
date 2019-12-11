package org.fasttrackit;

import java.util.Scanner;

public class Substraction {

    public double substract(double firstNumber, double secondNumber, double substraction){
        System.out.println("Hi. I'll substract two numbers for you");

        firstNumber = getFirstNumberInputDouble();

        secondNumber = getSecondNumberInputDouble();

        substraction = firstNumber - secondNumber;

        System.out.println("The result is: " + substraction);
        return substraction;

    }

    public double substract(int firstNumber, int secondNumber, int substraction){
        System.out.println("Hi. I'll divide two numbers for you");

       firstNumber = getFirstNumberInputInt();

       secondNumber = getSecondNumberInputInt();

       substraction = firstNumber / secondNumber;

        System.out.println("The result is: " + substraction);

        return substraction;

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
