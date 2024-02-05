package d11loops;

import java.util.Scanner;

public class ForLoops02 {
    public static void main(String[] args) {
        /*
            ornek 1: Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                            Day: 1
                            Day: 2
                            Day: 3
                            .....
                        Week: 2
                            Day: 1
                            Day: 2
                            Day: 3
                            ....    */
        for (int i = 1; i < 5; i++) {
            System.out.println("Week : " + i);

            /*System.out.println("       Day : 1");
            System.out.println("       Day : 2");
            System.out.println("       Day : 3");
            System.out.println("       Day : 4");
            System.out.println("       Day : 5");
            System.out.println("       Day : 6");
            System.out.println("       Day : 7"); hard code*/

            for (int j = 1; j < 8; j++) { // 7 gün için yazdık
                System.out.println("      Day: " + j);

            }
        }
        //--------------------
        System.out.println("------------------");
        /* Ornek 2:
        Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz

              X X X X X
              X X X X X
              X X X X X    */

        Scanner input = new Scanner(System.in);

        System.out.println("Satir sayisini giriniz");
        int satir = input.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int sutun = input.nextInt();

        //int satir = 3;
        //int sutun = 5;

        for (int i = 1; i <= satir; i++){
            for (int j = 1; j <= sutun; j++){
                System.out.print("X");

            }
            System.out.println(); //pointer'i alt satira almak icin kullanildi
        }
        System.out.println("------------------");
        //Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        /*

         *
         * *
         * * *
         * * * *

         */
        int sayi = 4;

        for (int k = 0; k < sayi; k++) {
            for (int l = 0; l <= k; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
