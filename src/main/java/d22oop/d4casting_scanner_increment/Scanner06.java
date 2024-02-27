package d22oop.d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        /*Ornek 6: Yani Satir Karakteri ('\n') Hatasi: Ardışık olarak birden fazla Scanner nesnesiyle bilgi
        toplarken bazı girdilerin atlanması, genellikle Scanner'ın girdi akışını nasıl işlediğiyle ilgilidir.
        Bu durum, özellikle nextInt(), nextDouble() gibi sayısal girdi alan metodlardan sonra nextLine() metodunu
        kullanırken yaygın olarak karşılaşılır.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yasinizi giriniz");
        int age = scanner.nextInt();
        // \n yeni satir karakteri akista kaldi

        scanner.nextLine(); //Kullanilmayan yeni satir karakterini okuyup atar

        System.out.println("Adinizi giriniz");
        String name = scanner.nextLine();
    }
}
