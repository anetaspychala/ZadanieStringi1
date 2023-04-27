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
        String text = "Anna";
        palindrom(text);
    }
// Iterate over a string with a numeric for
public static void palindrom (String text) {
    text = text.toLowerCase();
    int i = 0;
    boolean result=false;


    for ( i = 0;i<text.length()-1; i++){
        for(int j = text.length() - 1;j>0;j--){

            if ((text.charAt(i))!=text.charAt(j)) {
                result = false;
            } else{
                result =  true;

            }

        }
    }

    if (result==true){
        String isPalindrom = String.format("%s is a palindrome",text);
        System.out.println(isPalindrom);
    }
    else {
        String notAPalindrom = String.format("%s is NOT a palindrome",text);
        System.out.println(notAPalindrom);
    }


}

    }

