package d16methodcreation_overloading_varargs_passbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //Ornek 1: Bir tane Integer List olusturunuz. Interview sorusu
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        //           [12, 23, 10, 19] ==> 12 ve 10

        //Iki turlu sort() kullanabiliriz.
        //1- ArrayList icinde olan (Java 8 sonrasi cikti)
        //2- Collections icinde olan sort()

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        //Collections.sort(nums);
        nums.sort(null); //listlerde dogal siralama yapabilmesi icin null yaziliyor
        System.out.println(nums); //[10, 12, 19, 23]

        int minFark = nums.get(1) - nums.get(0); //2

        for (int i = 1; i < nums.size(); i++) { //1'den baslattik ki 1. index'ten 0. index'i cikaralim
            minFark = Math.min(minFark, nums.get(i) - nums.get(i - 1));
        }
        System.out.println(minFark);
        //---------------------------
        //En kucuk farki (minFark) hangi sayilardan elde ettigimizi bulalim

        for (int i = 1; i < nums.size(); i++) {
            //minFark'i hangi cikarma isleminde buldugumuzu arastiracagiz
            //ve o cikarma islemindeki sayilari konsola yazdiracagiz

            if (nums.get(i) - nums.get(i - 1) == minFark) {
                System.out.println(nums.get(i) + " ve " + nums.get(i - 1)); //12 ve 10
            }

        }
    }
}
