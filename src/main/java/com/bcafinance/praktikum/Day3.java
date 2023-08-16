package com.bcafinance.praktikum;
import java.util.Scanner;
import java.util.*;

public class Day3 {
    public static void main(String[] args) {
        String again = "N";

        do {
            String input = "";
            int ascii = 0;
            int total = 0;
            System.out.println("Masukkan Kalimat: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();

            char[] charArray = input.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                ascii = charArray[i];
                if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 & ascii <= 122)) {
                    total += ascii;
                }
            }
            System.out.println(total);

            System.out.print("Enter again? (Y/N): ");
            again = scanner.next();
        } while (again.equals("Y"));
    }
}
