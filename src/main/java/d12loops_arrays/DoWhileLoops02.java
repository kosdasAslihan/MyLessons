package d12loops_arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhileLoops02 {
    public static void main(String[] args) {
        /*Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.

       Kullanicidan username ve password'u alin.
       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.
        */
       Scanner input = new Scanner(System.in);

       int counter = 0;

       do {
           if (counter == 4){
               System.out.println("Hesabiniz bloke olmustur.");
               break;
           }
           System.out.println("Lutfen bir username giriniz: ");
           String userName = input.next();

           System.out.println("Lutfen password giriniz");
           String password = input.next();

           if (userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("pwd123")){
               System.out.println("Hesabiniza Hos Geldiniz");
               break;
           }
           counter++;
       }while (true); //sonsuz dongu olusturduk, icerden kirilmadigi surece calisacak

    }
}
