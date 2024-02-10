package d19stringbuilder_buffer_accessmodifier_static;

import java.time.LocalDate;

public class StaticBlok {

    //Bir variable olusturup deger atamazsaniz o variable’i initialize etmediniz demektir
    static double pi;

    //Senaryo: Subat ayinda fiyatlarda indirim olacak. Class cagirildiginda otomatik price’i alacak
    // ve class’in heryerinde bu degeri kullanacak
    static int price;

    static {
        System.out.println("Static block 2");
        LocalDate currentDate = LocalDate.now();

        if (currentDate.getMonthValue() == 2) { //Alinan tarihin ayini kontrol eder
            price = 1000;
            System.out.println(price);
        } else {
            price = 2000;
            System.out.println(price);
        }
    }

    static { //static block
        pi = 3.14;
        System.out.println("Static block 1");
    }

    public static void main(String[] args) {

        /*"static" blok, bir class'in yüklenmesi sırasında otomatik olarak çalışan ve class'in başlatılmasını
        veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.
        Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
        Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
        bir şekilde hazır olmasını sağlar.*/

        System.out.println(pi);
        System.out.println("main method ici");
        //Static block 1
        //3.14
        //main method ici

        //static block 2'yi ekleyince su sekilde calisti:
        //Static block 2
        //1000
        //Static block 1
        //3.14
        //main method ici
    }
}
