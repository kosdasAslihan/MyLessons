package d11loops;

public class ForLoops03 {
    public static void main(String[] args) {
        //Ornek 2: Verilen sayıda ondalık kısımdaki rakamların toplamını bulunnuz.
        //            28.587 ==> 5+8+7=20

        double num= 28.587;

        String sNum = String.valueOf(num); //double'i String' cevirdik.

        String decimalPart = sNum.split("[\\.]")[1]; //"587"

        int intDecimalPart = Integer.valueOf(decimalPart); //Unboxing //587
        //tamsayiya cevirip String'in tirnaklarini yok etmis olduk

        int sum = 0;

        for (int i = intDecimalPart; i > 0; i = i /10){
            sum = sum + i %10;
        }
        System.out.println(sum);
    }
}
