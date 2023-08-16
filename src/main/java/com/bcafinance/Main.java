package com.bcafinance;
import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

//        int a = 'Z';
//        System.out.println("hello, i am " + (a-67) + " years old");
//
//        boolean b = true;
//        int c = 0;
//        if (b ==(true)){
//            c=1;
//        }
//
//        System.out.println(c);

//        short shX = (short) 23766232;
//        byte intY = (byte) shX;
//
//        System.out.println(intY);
//
//        float f = 3.32424353222f;
//        double d = 3.23442323445242;
//        System.out.println("Default value f = "+f);
//        System.out.println("Default value d = "+d);
//
//        d = Double.parseDouble(Float.toString(f));
//
//        System.out.println("Default value f (long)    = "+f);
//        System.out.println("Default value d (float)   = "+d);
//
//        if ("sayalaper" == "sayalaper"){
//            System.out.println("benar");
//        }
//
//        String strFirst = "First";
//        String strSecond = "Date";
//        strFirst.equals(" First");
//        System.out.println(strFirst.concat(strSecond));
//
//        String strThird = "Okay";
//
//        System.out.println(strFirst+ strSecond + "hello" + "$##" + strThird);
//
//
//        String strThirds = "mengapahatiku";
//        System.out.println(strThirds.substring(5,7));



//        System.out.print("Masukkan string : ");
//        Scanner scanner = new Scanner(System.in);
//        String str123 = scanner.nextLine();
//
//        System.out.print("string yang anda masukkan adalah" + str123);
//
//        System.out.print("\nMasukkan Angka: ");
//        int angka = scanner.nextInt();
//
//        System.out.println("anda memasukkan angka " + angka);




////        System.out.println("Enter your magical number: ");
////        int num12 = scanner.nextInt();

//        switch (num12){
//            case 1:
//                System.out.println("You entered number 1");
//                System.out.println("Thank you");
//                break;
//
//            case 2:
//                System.out.println("You entered number 2");
//                System.out.println("Thank you");
//
//            default:
//                System.out.println("unlucky");
//                String again1 = scanner.nextLine();
//                break;
//        }




//        System.out.println("Enter your score: ");
//        int Score = scanner.nextInt();
//
//        String output = (Score>65)? "bagus, tingkatkan nilai kamu": "kamu tidak lulus";
//        System.out.println(output);


        for(int i=0; i<5; i++){
            System.out.println("Number: " + (i+1));
        }


        String again = "N";

        do{
            String input="";
            int ascii = 0;
            int total = 0;
            System.out.println("Masukkan Kalimat: ");
            Scanner scanner = new Scanner (System.in);
            input = scanner.nextLine();

            char [] charArray = input.toCharArray();
            for (int i=0; i< charArray.length; i++){
                ascii = charArray[i];
                if((ascii>=65&&ascii<=90)||(ascii>=97&ascii<=122)){
                    total+= ascii;
                }
            }
            System.out.println(total);

            System.out.println("Enter again? (Y/N)");
            again = scanner.next();
        }while (again.equals("Y"));

    }
}