package org.lessons.java;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TrainTicket {

    public static void main(String[] args) {

        Scanner keyboardReader = new Scanner(System.in);

        //init classe decimal format
        String pattern = "####,####.##";
        DecimalFormat numberFormat = new DecimalFormat(pattern);

        //init viariabili
        int userKm = 0;
        double totalPrice = 0;
        int eta = 0;
        double coupon = 0;

        //init costanti
        double priceKm = 0.21;
        int couponMinorenni = 20;
        int couponOver = 40;


        System.out.print("Inserisci il numero dei km che vorresti percorrere: ");
        userKm = keyboardReader.nextInt();

        System.out.print("Inserisci quanti anni hai: ");
        eta = keyboardReader.nextInt();

        //calcolo prezzo biglietto in base ai km

        totalPrice = userKm * priceKm;

        if (eta < 18 ) {
            coupon = (totalPrice * couponMinorenni) / 100 ;
        }
        if (eta > 65) {
            coupon = (totalPrice * couponOver) / 100 ;
        }

        totalPrice -= coupon;


        System.out.println("il prezzo del bieglietto secondo i dati inseriti è di: " + numberFormat.format(totalPrice) + " €");


    }
}
