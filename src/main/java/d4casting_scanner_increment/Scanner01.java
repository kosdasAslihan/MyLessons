package d4casting_scanner_increment;

//import java.util.Scanner; //Java util package'dan Scanner class

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Java'da Scanner class'i, kullanıcıdan veya farklı bir kaynaktan girdi almanın oldukça kolay bir yolunu sağlar.
        //Scanner sınıfı, farklı veri tiplerini (int, float, double, String, boolean vb.) kolaylıkla okuyabilir.
        //next(), nextInt(), nextDouble() gibi farklı metotlar, farklı ihtiyaçlara uygun şekillerde kullanicidan
        // girdi almayı sağlar.

        //Ornek 1 : Kullanicidan yasini isteyip console’a yazdiriniz
        //1. adim: Scanner class'yan obje uretin

        Scanner giris = new Scanner(System.in);
        //System.in ile klavye uzerinden veri girisi kabul edilir.

        //2. adim: Kullaniciya ne istediginize dair mesaj veriniz.
        System.out.println("Lutfen yasinizi giriniz");

        //3. adim: Uygun methodu kullanarak kullanicinin verdigi data'yi memory'e yerlestiriniz.
        byte age = giris.nextByte(); //kullanicinin girdigi veriyi yerel age degiskenine yukledik.
        System.out.println(age);








    }
}
