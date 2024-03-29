package d8stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {

        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$", "");
        laptop = laptop.replace("$", "");

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println("totalPrice = " + totalPrice);

        //-----------------------------------------
        //Ornek 2: Kullanici isminin ilk harflerini alip buyuterek console’a yazdiriniz.
        //      ”  ali cAN  ” ==> AC
        //trim() metodu bir String’deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String’i istediginiz karakterden parcalamaya yarar.

        String name = "  ali cAN  ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first); //A
        //name yukaridaki ismi alır, trim() sağdaki ve soldaki bosluklari siler, tuUpperCase() tum harfleri buyutur
        // charAt()'e deger atadıgımızda sadece o indexteki harfi buyuk yazar

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        /*char last = name.trim().toUpperCase().split("\\s+")[1].charAt(0); + ali cAN arasında birden fazla bosluk
        //varsa o hatayı engeller*/
        System.out.println(last); //C
        //name yukaridaki ismi alır, trim() sağdaki ve soldaki bosluklari siler, tuUpperCase() tum harfleri buyutur
        // [0][1] 0'daki ali 1'deki cAN kismini temsil eder o yuzden ikinci kisim olan cAN'i sectik
        // charAt()'e deger atadıgımızda sadece o indexteki harfi buyuk yazar

        System.out.println("" + first + last); // AC -(first + last) şeklinde yazdığımızda 132 degerini veriyor
                                                // cunku char'ın matematiksel degeri vardir.


    }
}
