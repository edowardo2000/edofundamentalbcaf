package com.bcafinance;

import java.util.Random;

public class RandomSample {
    public static void main(String[] args) {
        Random random = new Random();

        for(int i=0; i<10; i++){
            int intRandom= random.nextInt(97, 122);
            char chRandom = (char) intRandom;
            System.out.println(chRandom);
        }
    }
}
