package com.pb.strybailo.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int leftOperand = in.nextInt();

        System.out.println("Input second number: ");
        int rightOperand = in.nextInt();

        System.out.println("Operator: ");
        String operator = in.next();
    }
}