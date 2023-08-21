package com.bcafinance;

import java.util.Scanner;

public class Palindrom {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan 1 kata");
        String input1;
        input1 = scanner.nextLine();

        char [] chinput = input1.toCharArray();
        int length = chinput.length;
        String temp= "";

        for(int i = length-1; i>=0; i--){
            temp+= chinput[i];
        }

        if(temp.equalsIgnoreCase(input1)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Bukan palindrom");
        }


    }
}
