package d27exceptions;

public class Exception05 {
    public static void main(String[] args) {
        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 12;
        //int b = 3;
        //int b = 0;
        int b = 1;
        String s = "My Java";
        //getCharFromString(s, a, b); //b = 3 iken a ciktisi verdi // b = 0 iken 0'a bolme yapilamaz: / by zero ciktisi verdi
        //b = 1 iken StringIndexOutOfBoundsException ciktisi verdi

        getCharFromString2(s, a, b); //Bir istisna olustu class java.lang.StringIndexOutOfBoundsException

    } //main disi

    public static void getCharFromString(String s, int a, int b) {

        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("0'a bolme yapilamaz: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan index kullanmayiniz"); //Olmayan index kullanmayiniz null
            //getCause() hatanin sebebini class'ta yukluyse verir, yoksa null verir
        }

    }

    //2.yol: Tum exception turlerini tek bir catch’te yakalamak icin “Exception” adli parent kullanilir

    public static void getCharFromString2(String s, int a, int b) {
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);

        } catch (Exception e) {
            System.out.println("Bir istisna olustu " + e.getClass());
            //getClass() ile exception'in cesidini ogrenebiliriz
        }
    }
}
