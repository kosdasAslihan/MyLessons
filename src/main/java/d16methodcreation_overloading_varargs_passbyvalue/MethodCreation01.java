package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodCreation01 {
    public static void main(String[] args) {

        /*Java da Method Olusturma: Java'da bir metot (örneğin main metodu) içinde başka bir metot tanımlanamaz.
        Ancak bir metod içinde (mesela main), bir iç Class (nested class veya inner class) tanımlanabilir
        ve bu iç class'in içinde metotlar tanımlanabilir. Ancak LocalInnerClass yalnızca main metodu içinde
        geçerli ve erişilebilir olduğu için, main dışında bir yerde kullanılamaz. */

        /* Method Creation - Metot Olusturma
        Java'da method nasil olusturulur?

        1-main method'un disinda, class'in icinde olusturulur
        2-Syntax'i: Access Modifier + Return Type + Method ismi + () + {}
        3-Olusturulan method nasil kullanilir?
            Main icinden method cagrisi yapilmalidir. Buna method Call denir.
        */

        int sonuc = toplama(3, 5); //3,5 argumanlardir
                            //1-Method call
                            //2-Data tipi olan method'larda donen sonucu icinde saklamak
        System.out.println(sonuc); //8


    } //main disi
    // ornek 1: Toplama yapan bir method olusturunuz
    public static int toplama(int a, int b) { //int a, int b parametredir
        return a + b; //cagirildigi yere (call) sonucu dondurur
    }
}
