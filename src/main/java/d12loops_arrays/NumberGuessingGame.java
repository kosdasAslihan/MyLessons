package d12loops_arrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        //Scanner ve Random classlarindan object uretelim.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //0 ile 100 arasinda rastgele sayi uretelim.
        int rastgeleSayi = random.nextInt(101);

        //Kullanicinin kac kere tahmin yaptigini takip etmek icin bir sayac olusturalim
        int denemeSayisi = 0;

        //Kullanicinin yaptigi tahmini saklamak icin bir degisken olusturalim
        int tahminEdilen;

        //Kullanicinin sayiyi dogru tahmin edip etmedigini kontrol etmek icin boolean degisken olusturalim
        boolean tahminDogrumu = false;

        //Oyunun aciklamasini yazdiralim
        System.out.println("0 ile 100 arasinda bir sayiyi tahmin etmeye calisin");

        //Dogru tahmin yapilincaya kadar donguyu devam ettirelim
        do{
            //Kullanicidan bir tahmin alalim
            System.out.println("Tahmininizi yapiniz");
            tahminEdilen = scanner.nextInt();

            //Sayaci arttiralim
            denemeSayisi++;

            //Tahmini kontrol edelim
            if(tahminEdilen < rastgeleSayi){
                System.out.println("Sayi daha buyuk"); //sayi kullanicinin tahmininden buyukse ipucu verdik
            }else if (tahminEdilen > rastgeleSayi){
                System.out.println("Sayi daha kucuk"); //sayi kullanicinin tahmininden kucukse ipucu verdik
            }else{
                tahminDogrumu = true;
                System.out.println("Tebrikler, dogru tahmin");
                System.out.println("Deneme sayisi: " + denemeSayisi);

            }

        }while (!tahminDogrumu);
        scanner.close(); //actiginiz kaynaklari kapatmak iyi bir programlama paratigidir



    }
}
