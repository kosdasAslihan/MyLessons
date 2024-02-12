package d20instanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {

        InstanceBlock3 car1 = new InstanceBlock3();
        //Araba rengi : Siyah
        //Araba yakit turu : Benzin
        //InstanceBlock3 car2 = new InstanceBlock3(); //parametre vermedigimiz icin tekrar aynisini yazdirir.

        InstanceBlock3 car2 = new InstanceBlock3("Kirmizi","Dizel");
        System.out.println("Araba rengi : " + car2.color); //Araba rengi : Kirmizi
        System.out.println("Araba yakit turu : " + car2.fuelType); //Araba yakit turu : Dizel

        //System.out.println(car2); //d20instanceblock_oop.InstanceBlock3@776ec8df
    }
}
