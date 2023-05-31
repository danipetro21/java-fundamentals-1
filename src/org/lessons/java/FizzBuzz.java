package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner keyboardReader = new Scanner(System.in);


        //init costanti
        int numMax = 1000;
        int numMin = 0;
        int mod3 = 3;
        int mod5 = 5;



        int number;

        do  {

            System.out.print("inserisci il numero di numeri da stampare compreso tra 0 e 1000: ");
            number = keyboardReader.nextInt();

            if (number < numMin || number > numMax){
                System.out.println("noooo!! tra 0 e 1000");
            }

        } while (number < numMin || number > numMax );




        int[] numbers = new int[number];

        for (int i = 0; i < number; i++) {

            numbers[i] = i + 1;

            if (numbers[i] % mod3 == 0 && numbers[i] % mod5 == 0) {
                System.out.println("FizzBuzz");
            } else if (numbers[i] % mod5 == 0) {
                System.out.println("Buzz");
            } else if (numbers[i] % mod3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(numbers[i]);
            }

        }

    }

}
