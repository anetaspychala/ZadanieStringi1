package org.example;
import java.util.*;
/*Odkurzacz do spacji: napisz program, który oczyszcza dany tekst
 ze wszystkich nadmiarowych spacji, pozostawiając tylko pojedyncze
 między słowami. Np Ala   ma           kota                 ->
 Ala ma kota
 */
public class App {
    public static void main(String[] args) {
  /*      String text = "Ala     ma        kota";
        String withoutSpaces = text.replaceAll(" +"," ");
        System.out.println(withoutSpaces);*/

      /*  Analiza stringów: napisz program, który sprawdza, czy dany string jest palindromem
        (odczytuje się go tak samo od przodu, jak i od tyłu, np Anna), heterogramem (żadna litera się nie powtarza, np Mateusz),
            pangramem (zawiera wszystkie litery alfabetu łacińskiego, np The quick brown fox jumps over a lazy dog), oraz,
            czy /**/
        // Read a single character from a string
//        String text = "Hello, World!";
//        Character c = text.charAt(5);
//        System.out.println(c);
    }
// Iterate over a string with a numeric for
        public static boolean palindrom(String text){
        String text = "anna";
        text = text.toLowerCase();
        for (int i = 0; int j < text.length()-1; i < j; i++; j--) {
            Character character = text.charAt(i);
            // System.out.println(character);
            if(text.charAt(i)) != text.charAt(j); {
                return false;
            }
            return true;
        }


//            for (int i = 0; j=str.length() - 1; i<j; i++, j--){
//                    if(str.charAt(i) !=str.charAt(j)){
//                        return false;

        //        }
        //    }
        //    return true;


// Iterate over a string with an iterative for
//        for (Character character : text.toCharArray()) {
//            System.out.println(character);


        }

    }

