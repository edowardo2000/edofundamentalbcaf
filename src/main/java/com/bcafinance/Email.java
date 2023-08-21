package com.bcafinance;

import java.util.Random;

public class Email {
    public static void main(String[] args) {
        Random random = new Random();
        Character chR = 'x';


        for(int i = 0; i<10; i++){
            int intR = random.nextInt(97,122);
            chR = (char) intR;
            System.out.println(chR);
        }
    }
}
