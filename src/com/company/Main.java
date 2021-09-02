package com.company;

import java.util.Scanner;

public class Main {
    public static void Addition(int a, int b){
        System.out.println(a+b);
    }
    public static void Subtraction(int a,int b){
        System.out.println(a-b);
    }
    public static void Multiplication(int a,int b){
        System.out.println(a*b);
    }
    public static void Division(int a,int b){
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException ex){
            System.out.println("Can't Divide By zero");
        }
    }
    public static void Modulus(int a, int b){
        System.out.println(a%b);
    }

    public static void main(String[] args) {
        System.out.println("Enter Two Numbers");
        Scanner input= new Scanner(System.in);
        Integer a = input.nextInt();
        Integer b = input.nextInt();
        System.out.println("Choose Operation : + , -, * , / , % ");
        char operation = input.next().charAt(0);
        switch (operation) {
            case '+':
                Addition(a,b);
                break;
            case '-':
                Subtraction(a,b);
                break;
            case '*':
                Multiplication(a,b);
                break;
            case '/':
                Division(a,b);
                break;
            case '%':
                Modulus(a,b);
                break;
        }
    }

}
