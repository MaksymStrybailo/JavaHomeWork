package com.pb.strybailo.hw2;

public class Calculator {
    public static void main(String[] args) {
        int x=9;
        int y=0;
        String sign="+";// + - * /
        System.out.println("Введите значение x");
        System.out.println("Введите значение y");
               switch (sign) {
                    case "+":
                        System.out.println("Выполните" + (x + y));
                        break;
                    case "-":
                        System.out.println("Выполните" + (x - y));
                        break;
                    case "*":
                        System.out.println("Выполните" + (x * y));
                        break;
                    case "/":
                        System.out.println("Выполните" + (x / y));
                        if (y == 0) {
                        System.out.println("Ошибка.На ноль делить нельзя");
                        break;
                        }
                    default:
                        System.out.println("Неверная операция");

                    }
                }
    }

