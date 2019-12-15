package org.fasttrackit;

import java.util.Scanner;

public class LogicalOP {

    private int getNumberFromUser() {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int getNumber2FromUser() {
        System.out.println("Please enter another number ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void countUp() {
        int number = getNumberFromUser();
        int i;
        for (i = number; i <= 100; i++) {
            System.out.println("Counting up from " + i + " to " + 100);
            System.out.println(i);
        }
    }

    public void countDown() {
        int number = getNumberFromUser();
        int i;
        for (i = number; i >= -100; i--) {
            System.out.println("Counting down from " + i + " to " + -100);
            System.out.println(i);
        }
    }

    public void countFromTo() {
        int number = getNumberFromUser();
        int number2 = getNumber2FromUser();
        int x;
        int y = number2;
        for (x = number; x <= y; x++) {
            System.out.println("Counting from " + x + " to " + y);
            System.out.println(x);
        }
    }

    public void countFromToByComparison() {
        int number = getNumberFromUser();
        int number2 = getNumber2FromUser();
        int x = number;
        int y = number2;

        if (x < y) {
            System.out.println("First number is smaller, so counting from " + x + " to " + y);
            for (x = number; x <= y; x++) {
                System.out.println(x);
            }
        } else if (x > y){
            System.out.println("Second number is smaller, so counting from " + y + " to " + x);
            for (y = number2; y <= x; y++) {
                System.out.println(y);
            }
        }
    }

    public void showAllEvenNumbers(){
        System.out.println("The even numbers are:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 1) {
                System.out.print(i + " ");
            }
        }
    }

    public void showAllOddNumbers(){
        System.out.println("The odd numbers are:");
        for (int i = 1; i<=100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void addAllNumbers(){
        int i;
        int sum = 0;
        for (i = getNumberFromUser(); i <= 100; i++){
            sum = sum + i;
        }
        System.out.println("Adding numbers from " + i + " to " + 100);
        System.out.println("The result is: " + sum);
    }
}


