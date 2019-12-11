package org.fasttrackit;

import com.sun.org.apache.xpath.internal.operations.Div;

public class App
{
    public static void main( String[] args ) {

        Division division = new Division();
        division.divide();

        System.out.println("    ");

        Multiplication multiplication = new Multiplication();
        multiplication.multiply();

        System.out.println("    ");

        Substraction substraction = new Substraction();
        substraction.substract();

        System.out.println("    ");

        Sum sum = new Sum();
        sum.add();

    }
}
