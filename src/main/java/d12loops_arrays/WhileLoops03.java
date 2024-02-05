package d12loops_arrays;

public class WhileLoops03 {
    public static void main(String[] args) {
        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //      Palindrome: 121 <==> 121    123321 <==> 123321

       int k = 312;

       String m = String.valueOf(k);
       String reversed = ""; //ters cevrilmis olani bunun icinde saklayacagiz

        int n = m.length()-1; //son indexi alip n'ye yukledik.

        while (n >= 0){ //dongu son indexten baslamis oldu
            reversed = reversed + m.charAt(n);
            n--;
        }
        System.out.println(reversed); //213

        if(m.equals(reversed)){
            System.out.println("Polindromdur");
        }else {
            System.out.println("Polindrom degildir");
        }
    }
}
