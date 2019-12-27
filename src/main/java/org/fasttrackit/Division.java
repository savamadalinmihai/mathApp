package org.fasttrackit;

import java.util.Scanner;

public class Division {

    public double divide(double firstNumberDouble, double secondNumberDouble){
        double divisionDouble = firstNumberDouble / secondNumberDouble;

        System.out.println("The result of the division with doubles is: " + divisionDouble);

        return divisionDouble;

    }
    public int divide(int firstNumberInt, int secondNumberInt){
        int divisionInt = firstNumberInt / secondNumberInt;

        System.out.println("The result of the division with integers is: " + divisionInt);

        return divisionInt;

    }

}
