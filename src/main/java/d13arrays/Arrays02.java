package d13arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //      bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int[] ages = new int[6];

        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages)); //[20, 23, 19, 44, 15, 32]

        //1.yol
        /*Arrays.sort(ages); //kucukten buyuge siralama yaptik
        System.out.println(Arrays.toString(ages)); //[15, 19, 20, 23, 32, 44]

        System.out.println(ages[0] + ages[ages.length-1]); //59*/

        //2.yol: Math.max ve Math.min'i kullanacagiz
        int minimum = ages[0];
        int maksimum = ages[0];

        for (int w : ages){
            minimum = Math.min(minimum, w);
            maksimum = Math.max(maksimum, w);
        }
        System.out.println(minimum); //15
        System.out.println(maksimum); //44

        System.out.println(minimum+maksimum); //59
    }
}
