package org.example;

/*Odkurzacz do spacji: napisz program, który oczyszcza dany tekst
 ze wszystkich nadmiarowych spacji, pozostawiając tylko pojedyncze
 między słowami. Np Ala   ma           kota                 ->
 Ala ma kota
 */
public class App 
{
    public static void main( String[] args )
    {
        String text = "Ala     ma        kota";
        String withoutSpaces = text.replaceAll(" +"," ");
        System.out.println(withoutSpaces);





        }



    }

