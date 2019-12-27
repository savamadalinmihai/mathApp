package org.fasttrackit;

import java.util.Scanner;

public class Sum {

    public double add(double firstNumberDouble, double secondNumberDouble){
        double addition = firstNumberDouble + secondNumberDouble;

        System.out.println("The result of the addition with doubles is: " + addition);

        return addition;
    }

    public  int add (int firstNumberInt, int secondNumberInt){

        int addition = firstNumberInt + secondNumberInt;

        System.out.println("The result of the addition with integers is: " + addition);

        return addition;
    }
}


