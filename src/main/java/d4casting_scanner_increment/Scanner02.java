package d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*Ornek 1:
        Kullanıcıdan;
        i)Adini ve Soyadini ii)Yaşını
        iii)Boyunu
        iv)Kilosunu
        v)Medeni durumunu girmesini isteyin.

        Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın*/

        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi ve Soyadinizi giriniz");
        String fullName = input.nextLine(); //nextLine() methodu ile birden fazla kelime girdisi alabiliriz.

        System.out.println("Yasinizi giriniz");
        byte age = input.nextByte();

        System.out.println("Boyunuzu giriniz");
        float height = input.nextFloat();

        System.out.println("kilonuzu giriniz");
        short weight = input.nextShort();

        System.out.println("Medeni durumunuzu giriniz");
        String maritalStaus = input.next(); //next() kullanicidan tek kelimeli String almak icin kullanilir

        //Kullanici bilgilerini konsola yazdiralim
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStaus = " + maritalStaus);

        //ODEV: nextLine'ın enterla bos gecmesini do-while dongusu ile duzeltiniz.

    }
}
