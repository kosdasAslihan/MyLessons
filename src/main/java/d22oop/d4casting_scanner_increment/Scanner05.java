package d22oop.d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123

        Scanner input = new Scanner(System.in);
        System.out.println("Bes basamakli bir sayi giriniz: ");
        int num = input.nextInt();

        //Java'da bir tamsayiyi baska tamsayiya bolunce sonuc tamsayi cikar
        int ilkIki = num / 1000; //45,678 yazar ama tamsayi kismini aldigindan oturu 678 kismini atıp 45'i verir

        //% isaretine modulus operatoru denir, kalan bulunur
        int sonIki = num % 100; //kalan 78'i verecektir

        System.out.println(ilkIki+sonIki);
    }
}
