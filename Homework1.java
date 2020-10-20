package package1;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) throws IOException {

        //+++1. Приветствовать любого пользователя при вводе его имени через командную строку.

/*        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println("Hello " + next);*/

        //+++2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

 /*       Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        int size = input.nextInt();
        int args1[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            System.out.println("Enter Number: ");
            args1[i] = input.nextInt();
        }
        for (int i = args1.length - 1; i >= 0; i--) {
            System.out.println(args1[i]);
        }*/

        //+++3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

   /*     Scanner input = new Scanner(System.in);
        System.out.println("Enter number of numbers: ");
        int number = input.nextInt();
        for (int i = 0; i < number; i++){
            //System.out.print(Math.round(Math.random()*100) + " ");
            System.out.println(Math.round(Math.random()*100));
        }
*/

        //+++4. Ввести пароль из командной строки и сравнить его со строкой образцом.

/*      String parol = "parole";
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if (next.equals(parol)) {
            System.out.println("Good parol");
        } else {
            System.out.println("Bad parol ");
        }*/

        //+++5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и
        //вывести результат на консоль.

/*        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of numbers: ");
        int number = input.nextInt();
        int sum = 0;
        int mult = 1;
        int enteredNum = 0;
        for (int i = 0; i < number; i++){
            System.out.println("Enter a number: ");
            enteredNum = input.nextInt();
            sum += enteredNum;
            mult *= enteredNum;
        }
        System.out.println("Sum = " + sum);
        System.out.println("multiplication = " + mult);*/

        //6.Ввести с консоли Целых чисел. На консоль вывести:
        //+++6.1. Четные и нечетные числа.

/*        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        int size = input.nextInt();
        int args1[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            System.out.println("Please enter a number: ");
            args1[i] = input.nextInt();
            if (args1[i] % 2 == 0) {
                System.out.println("Number " + args1[i] + " is even");
            } else {
                System.out.println("Number " + args1[i] + " is odd");
            }
        }*/

        //+++6.2. Наибольшее и наименьшее число.

/*        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        int size = input.nextInt();
        System.out.println("Enter initial number: ");
        int init = input.nextInt();
        int min = init;
        int max = init;

        for (int i = 1; i < size; i++)
        {
            System.out.println("Please enter a number: ");
            int number = input.nextInt();
            if (min > number) {
                min = number;
            }
            if (max < number) {
                max = number;
            }
        }
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);*/

        //+++6.3. Числа, которые делятся на 3 или на 9.

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        int size = input.nextInt();
        for (int i = 0; i < size; i++)
        {
            System.out.println("Please enter a number: ");
            int number = input.nextInt();
            if (number % 9 == 0) {
                System.out.println("Number " + number + " is divided on 9");
                System.out.println("Number " + number + " is divided on 3");
            } else if (number % 3 == 0){
                System.out.println("Number " + number + " is divided on 3");
            }
        }*/
        //+++6.4. Числа, которые делятся на 5 и на 7.
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        int size = input.nextInt();
        for (int i = 0; i < size; i++)
        {
            System.out.println("Please enter a number: ");
            int number = input.nextInt();
            if (number % 5 == 0) {
                if (number % 7 == 0){
                    System.out.println("Number " + number + " is divided on 5 and 7");
                }
            }
        }*/

        //+++6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
/*        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        int size = input.nextInt();
        for (int i = 0; i < size; i++)
        {
            System.out.println("Please enter a number: ");
            int number = input.nextInt();
            if (number > 101 && number < 988) {
                    String str1 = Integer.toString(number);
                char[] arg1 = str1.toCharArray();
                if (arg1[0] != arg1[1] && arg1[0] != arg1[2] && arg1[1] != arg1[2]) {
                    System.out.println(number);
                }
            }
        }*/
        //6.6. «Счастливые числа.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        lucky(number);

    }

    private static void lucky(int number) {
        int firstHalf = 0;
        int secondHalft = 0;
        String str1 = Integer.toString(number);
        String[] split = str1.split("");
        for (int i = 0; i < split.length; i++) {
            int anInt = Integer.parseInt(split[i]);
            if (i < split.length / 2) {
                firstHalf += anInt;
            } else {
                secondHalft += anInt;
            }
        }
        if (firstHalf == secondHalft) {
            System.out.println("True!");
        } else {
            System.out.println("False!");
        }
}
}
