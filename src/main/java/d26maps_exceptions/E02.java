package d26maps_exceptions;

public class E02 {
    public static void main(String[] args) {
        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur

        /*String s = "1234";
        convertStringToInt(s); //1235*/

        /*String s = "1234a";
        convertStringToInt(s); //NumberFormatException: For input string: "1234a"*/


    } //main disi
    public static void convertStringToInt(String s){
        int intS = Integer.valueOf(s);
        System.out.println(intS+1); //1'i donusturup donusturmedigini anlamak icin yazdik
    }
}
