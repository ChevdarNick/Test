package Calc;

import java.util.Scanner;

public class Calc1 {
    public static void main(String[] args) {
        String operation;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число");
        int FirstNumber = scn.nextInt();
        while ( (FirstNumber < 0) || FirstNumber > 10)
         {
            System.out.println("Введите число от 1 до 10");
            FirstNumber = scn.nextInt();
        }
        System.out.println("Введите второе число");
        int SecondNumber = scn.nextInt();
        while ( (SecondNumber < 0) || SecondNumber > 10)
        {
            System.out.println("Введите число от 1 до 10");
            SecondNumber = scn.nextInt();
        }
        System.out.println("Введите действие");
        operation = scn.next();

        if (operation.equals("+")) {
            System.out.println(FirstNumber + SecondNumber);
        }

        if (operation.equals("-")) {
            System.out.println(FirstNumber - SecondNumber);
        }

        if (operation.equals("*")){
            System.out.println(FirstNumber * SecondNumber);
        }

        if (operation.equals("/")){
            System.out.println(FirstNumber / SecondNumber);
        }
        else {
            System.out.println("Введите арифметическую операцию: '+','-','*' или '/'.");
        }
    }
}


