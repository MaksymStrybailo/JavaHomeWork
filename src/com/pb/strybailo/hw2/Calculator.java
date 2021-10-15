package com.pb.strybailo.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x ;
        int y ;

        String symbol = "+";// + - * /

        System.out.println("Введите значение x:");
        x = scan.nextInt();

        System.out.println("Введите значение y:");
        y = scan.nextInt();

        System.out.println("Введите действие:");
        symbol = scan.next();

        switch (symbol) {
            case "+":
                System.out.println(+(x + y));
                break;
            case "-":
                System.out.println(+(x - y));
                break;
            case "*":
                System.out.println(+(x * y));
                break;
            case "/":
                if (y == 0) {
                    System.out.println("Ошибка.На ноль делить нельзя");
                } else if (y >0){
                    System.out.println(+(x / y));
                }
                break;

            default:
                System.out.println("Недопустимая операция");

        }
    }
    }

