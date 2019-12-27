package org.fasttrackit;

import java.util.Scanner;

public class Multiplication {

    public double multiply(double firstNumberDouble, double secondNumberDouble){
        double multiplicationDouble = firstNumberDouble * secondNumberDouble;

        System.out.println("The result of the multiplication with doubles is: " + multiplicationDouble);

        return multiplicationDouble;

    }
    public int multiply(int firstNumberInt, int secondNumberInt){
        int multiplicationDouble = firstNumberInt * secondNumberInt;

        System.out.println("The result of the multiplication with integers is: " + multiplicationDouble);

        return multiplicationDouble;

    }

}
