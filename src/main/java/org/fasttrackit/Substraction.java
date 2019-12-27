package org.fasttrackit;

import java.util.Scanner;

public class Substraction {

    public double subtract(double firstNumberDouble, double secondNumberDouble) {
        double subtractionDouble = firstNumberDouble - secondNumberDouble;

        System.out.println("The result of the subtraction with doubles is: " + subtractionDouble);

        return subtractionDouble;

    }

    public int subtract(int firstNumberInt, int secondNumberInt) {
        int subtractionDouble = firstNumberInt - secondNumberInt;

        System.out.println("The result of the subtraction with integers is: " + subtractionDouble);

        return subtractionDouble;
    }
}
