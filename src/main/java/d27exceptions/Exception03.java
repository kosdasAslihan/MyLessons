package d27exceptions;

public class Exception03 {
    public static void main(String[] args) {
        //3) StringIndexOutOfBoundsException, bir String nesnesinin karakter dizisindeki
        //geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

        String s = "Java";
        //karakterSec(s, 2); //v
        karakterSec(s, 5); //StringIndexOutOfBoundsException
    } //main disi

    public static void karakterSec(String s, int idx) {
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan index'leri kullanmayiniz: " + e.getMessage());
            //Olmayan index'leri kullanmayiniz: String index out of range: 5
            e.printStackTrace(); //developer hatalari gormek isterse kullanir. Exception'i gosterir
            //ama exception firlatilmaz, kodlar alttan calismaya devam eder
        }
        System.out.println("App calisiyor"); //App calisiyor
    }
}
