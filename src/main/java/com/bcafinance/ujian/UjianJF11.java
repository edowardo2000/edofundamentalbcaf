package com.bcafinance.ujian;

import java.util.Random;
import java.util.Scanner;

public class UjianJF11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        Integer [] f1 = {0, 62};
        Integer [] f2 = {12, 13, 57, 56, 52};
        char strip = '-';
        int jumlahData = 0;

        System.out.print("Jumlah data format no handphone yang ingin di generate : ");
        jumlahData= scanner.nextInt();

        for(int i=0; i<jumlahData; i++) {
            String phoneNo = "";
            int numDigit = random.nextInt(10, 15);

            int f1random = random.nextInt(0, 2);
            int f2random = random.nextInt(0, 5);
            int f3 = random.nextInt(100, 1000);

<<<<<<< HEAD
            phoneNo += f1[f1random].toString() + '8' + f2[f2random].toString() + strip + f3 + strip;
=======
            phoneNo += f1[f1random].toString() + f2[f2random].toString() + strip + f3 + strip;
>>>>>>> github/master
            int length = phoneNo.length() - 2;

//            System.out.println(length);

            if (numDigit - length == 7) {
                int f4 = random.nextInt(100, 9999999);
                phoneNo += f4;
                System.out.println(phoneNo);
            } else if (numDigit - length == 6) {
                int f4 = random.nextInt(100, 999999);
                phoneNo += f4;
                System.out.println(phoneNo);
            } else if (numDigit - length == 5) {
                int f4 = random.nextInt(100, 99999);
                phoneNo += f4;
                System.out.println(phoneNo);
            } else if (numDigit - length == 4) {
                int f4 = random.nextInt(100, 9999);
                phoneNo += f4;
                System.out.println(phoneNo);
            } else if (numDigit - length == 3) {
                int f4 = random.nextInt(100, 999);
                phoneNo += f4;
                System.out.println(phoneNo);
            }
        }
    }
}
