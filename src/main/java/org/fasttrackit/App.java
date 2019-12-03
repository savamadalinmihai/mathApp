package org.fasttrackit;

import com.sun.org.apache.xpath.internal.operations.Div;

public class App
{
    public static void main( String[] args ) {

        Division division = new Division();
        division.calculate();

        System.out.println("    ");

        Multiplication multiplication = new Multiplication();
        multiplication.calculate();

        System.out.println("    ");

        Substraction substraction = new Substraction();
        substraction.calculate();

        System.out.println("    ");

        Sum sum = new Sum();
        sum.calculate();

    }
}
