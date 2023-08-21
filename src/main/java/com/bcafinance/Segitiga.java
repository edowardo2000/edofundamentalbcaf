package com.bcafinance;

public class Segitiga {
    public static void main (String[] args){
        luasSegitiga(5,10);
    }

    private static void luasSegitiga (int alas, int tinggi){
        double luas =0.5*alas*tinggi;
        System.out.println(luas);
    }
}
