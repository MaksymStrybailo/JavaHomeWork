package com.pb.strybailo.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x ;
        int y ;
        String sign = "+";// + - * /
        System.out.println("Введите значение x:");
        x = scan.nextInt();
        System.out.println("Введите значение y:");
        y = scan.nextInt();
        switch (sign) {
            case "+":
                System.out.println( + (x + y));
                break;
            case "-":
                System.out.println( + (x - y));
                break;
            case "*":
                System.out.println( + (x * y));
                break;
            case "/":
                System.out.println( + (x / y));
              if (y == 0) {
                  System.out.println("Ошибка.На ноль делить нельзя");
                  break;
              }
            default:
                System.out.println("Неверная операция");

        }
    }
    }

