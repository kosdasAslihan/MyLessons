package d9string_loops;

public class StringManipulations02 {
    public static void main(String[] args) {
        //lastIndexOf() method’u spesifik bir karakterin son gorunumunun index’ini verir
        //Bu method olmayan karakterler icin -1 verir

        //Ornek 1: Bir String’deki tekrarsiz character’leri ekrana yan yana yazdiriniz.
        // yusuf ==> ysf

        //indexOf("u") ==> 1
        //lastIndexOf("u") ==> 3 farkli yani tekrarli

        //indexOf("y") ==> 0
        //lastIndexOf("y") ==> 0 ayni yani tekrarsiz

        String s = "yusuf";

        if (s.indexOf("y") == s.lastIndexOf("y")) {
            //     0      ==          0    true uretti
            System.out.println("y");
        }
        if (s.indexOf("u") == s.lastIndexOf("u")) {
            //      1     ==           3    false uretti
            System.out.println("u");
        }
        if (s.indexOf("s") == s.lastIndexOf("s")) {
            //      2      ==         2     true uretti
            System.out.println("s");
        }
        if (s.indexOf("f") == s.lastIndexOf("f")) {
            //      4     ==         4       true uretti
            System.out.println("f");
        }
        System.out.println();

        //Ornek 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789

        String cardNum = "1234 6789 1234 6789";

        String first = cardNum.substring(0,15).replaceAll("[0-9]", "*");
        System.out.println(first); //**** **** ****

        String last = cardNum.substring(15);
        System.out.println(last); //6789

        String result1 = first + last;
        System.out.println(result1); //**** **** **** 6789

        String result2 = first.concat(last); //first + last ile ayni islemi gorur
        System.out.println(result2); //**** **** **** 6789
    }
}
