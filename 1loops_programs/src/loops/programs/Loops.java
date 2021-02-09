package loops.programs;

import java.math.BigInteger;
import java.util.Scanner;

public class Loops {

    static void loop1(){
        System.out.println("Напишите программу, где пользователь вводит любое целое положительное число." +
                "А программа суммирует все числа от 1 до введенного пользователем числа.");
        int sum = 0, x;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integer: ");
            x = scan.nextInt();
            if (x > 0) {
                for (int i = 1; i <= x; i++) {
                    sum += i;
                }
                System.out.println("Sum of numbers from 1 to " + x + " is " + sum);
            } else {
                System.out.println("Wrong number");
            }
        } while (x <= 0);
        System.out.println("---------------------------------");
    }

    static void loop2(){
        System.out.println("Вычислить значения функции на отрезке [а,b] c шагом h: " +
                "y = x при x > 2, y = -x, при x<=2");
        double y, a, b, h;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A: ");
        a = scan.nextDouble();
        System.out.print("Enter B: ");
        b = scan.nextDouble();
        System.out.print("Enter h: ");
        h = scan.nextDouble();
        for (double i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = -i;
            }
            System.out.printf("|%-11f|%-11f|\n", i, y);
        }
        System.out.println("---------------------------------");
    }

    static void loop3(){
        System.out.println("Найти сумму квадратов первых ста чисел.");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("Sum the square of the 100 numbers is " + sum);
        System.out.println("---------------------------------");
    }

    static void loop4(){
        System.out.println("Составить программу нахождения произведения квадратов первых двухсот чисел.");
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= 200; i++) {
            BigInteger a = BigInteger.valueOf(i);
            res = res.multiply(a.pow(2));
        }
        System.out.println("Product the square of the numbers is: " + res);
        System.out.println("---------------------------------");
    }

    static void loop5(){
        System.out.println("Даны числовой ряд и некоторое число е." +
                "Найти сумму тех членов ряда, модуль которых больше или равен заданному е.");
        double an, n = 3, sum = 0.0, e = 0.1;
        for (int i = 0; i <= n; i++) {
            an = 1 / (Math.pow(2, n)) + 1 / (Math.pow(3, n));
            if (Math.abs(an) >= e) {
                sum += an;
            }
        }
        System.out.println(sum);
        System.out.println("---------------------------------");
    }

    static void loop6(){
        System.out.println("Вывести на экран соответствий между символами и их численными обозначениями в " +
                "памяти компьютера (Таблицу ASCII).");
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }
        System.out.println("---------------------------------");
    }

    static void loop7(){
        System.out.println("Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. " +
                "m и n вводятся с клавиатуры.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        System.out.print("Enter m: ");
        int m = scan.nextInt();
        for (int i = n; i <= m; i++) {
            System.out.print("\n" + i +  " divisible by: ");
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
        }
        System.out.println("\n---------------------------------");
    }

    static void loop8(){
        System.out.println("Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = scan.nextInt();
        System.out.println("Введите b: ");
        int b = scan.nextInt();
        int[] arr = new int[10];
        while(a != 0){
            arr[a % 10]++;
            a /=10;
        }
        while(b != 0){
            if(arr[b % 10] != 0)
                System.out.println(b % 10);
            b /=10;
        }
    }
}
