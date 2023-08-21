package com.bcafinance.ujian;
import java.util.Random;
import java.util.Scanner;

public class UjianJF12 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Character charX = 'x';
        char at = '@';
        char dot = '.';
        String [] provider = {"gmail", "ymail", "rocketmail"};
        String [] domain = {"co.id", "com", "us", "jp"};

        System.out.print("Jumlah data format email yang ingin di generate : ");
        int jumlahData = 0;
        jumlahData = scanner.nextInt();


        for(int i=0; i<jumlahData; i++) {
            String email = "";
            int length = random.nextInt(10, 16);
            int digit = random.nextInt(100, 999);

            for (int j = 0; j < length - 3; j++) {
                int intRandom = random.nextInt(97, 122);
                charX = (char) intRandom;
                email += charX.toString();
            }
            int digitPosition = random.nextInt(0, 3);

            if (digitPosition == 0) {
                int randomProv = random.nextInt(0, 3);
                int randomDom = random.nextInt(0, 4);
                email = digit + email;
                email += at + provider[randomProv] + dot + domain[randomDom];
                System.out.println(email);
            }
            else if (digitPosition==1) {
                int randomProv = random.nextInt(0, 3);
                int randomDom = random.nextInt(0, 4);
                email = email + digit;
                email += at + provider[randomProv] + dot + domain[randomDom];
                System.out.println(email);
            }
            else if (digitPosition==2) {
                int randomProv = random.nextInt(0, 3);
                int randomDom = random.nextInt(0, 4);
                String email1 = email.substring(0, (email.length()/2));
                String email2 = email.substring((email.length()/2+1), email.length());
                email = email1 + digit + email2;
                email += at + provider[randomProv] + dot + domain[randomDom];
                System.out.println(email);
            }

        }

    }
}
