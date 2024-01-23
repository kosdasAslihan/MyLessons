package d9string_loops;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*Ornek 1: Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin.

        1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
        2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        3- Başında ve sonunda boşluk olmamalıdır.*/

        //Not: isEmpty() metodu sadece hicligi kontrol eder (true verir).
        //isBlank() metodu ise hem hicligi hemde space’i kontrol eder(true verir)

        // 1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.

        String pwd = "a";
        boolean first = pwd.isEmpty();
        System.out.println(first); //false, "" şeklinde olsaydı true donecekti

        //2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.

        boolean second = pwd.isBlank();
        System.out.println(second); //false

        //3- Başında ve sonunda boşluk olmamalıdır.
        //Basindaki ve sonundaki bosluklari alinca ilk haline esitse, orjinalinde bosluk yoktur

        boolean third = pwd.trim().equals(pwd);
        System.out.println(third); //true
        //trim() bosluklari yok ediyor bu yüzden pwd = "a " seklinde olsaydi false verecekti cunku "a" = "a " gorecekti.

        if(first){
            System.out.println("Parola hicbir sey yazmadan gecilemez."); // pwd = "" olsaydi uyariyi console'a yazdiracakti
        }
        if(second){
            System.out.println("Parola bos birakilmamali ve bosluk harici karakterler de bulunmalidir.");
            //pwd = "" olsaydi uyari devreye girecekti. pwd = " " seklinde olsaydi uyari cikmayacakti.
        }
        if(!third){
            System.out.println("Parolanin basinda ya da sonunda bosluk birakilmamalidir.");
            //if(third) olunca console'a yazdiriyor cunku yukarida true olarak kabul edilmis
        }


    }
}
