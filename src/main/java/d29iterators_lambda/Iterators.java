package d29iterators_lambda;

import java.util.*;

public class Iterators {
    public static void main(String[] args) {

        /*
        1-  Iterator'ler loop'larin yaptigi ayni isi yapar
        2)  Iterator'lerde sonsuz loop olusma ihtimali yoktur(for each gibi)
        3)  Iterator'ler ile loop'lar arasinda performans farki yoktur
        4)  Iterator'ler bir collection'dan eleman silme ve bir collection'daki elemani degistirme
        konusunda daha basarilidir
        5) Iki tip iterator vardir:
            a) Iterator:
            Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mumkun degildir
            b) ListIterator:
            Bu eleman silebilir, ekleyebilir ve degistirebilir

            Not:
            Iterator, sadece soldan saga (ilk elemandan son elemana) calisir
            ListIterator iki yonlu calisabilir
         */

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");
        System.out.println(myList); //[Tom, Jim, Clara, Fatma, Mustafa]

        //myList uzerinde bir Iterator olusturalim
        //hasNext() : Koleksiyonun bir sonraki elemaninin olup olmadigini kontrol eder(boolean)
        //next() : Pointer'i bir sonraki elemanin onune konumlandirir ve pointer'in atladigi elemani verir
        //remove() : Pointer'in atladigi elemani siler

        Iterator<String> myItr = myList.iterator();
        /*while (myItr.hasNext()){ //en basa konumlanan pointerdan sonra eleman var mi diye bakar
            myItr.next(); //pointer'i bir sonraki elemanin onune alir ve atladigi elemani verir
            myItr.remove(); //next() in verdigi elemani siler
        }
        System.out.println(myList); //[]*/

        //**specific bir elemani iterator ile nasil silebiliriz? (Tom’u silelim)
        while (myItr.hasNext()){
            String el = myItr.next();

            if (el.equals("Tom")){
                myItr.remove();
                break;
            }
        }
        System.out.println(myList); //[Jim, Clara, Fatma, Mustafa]

        System.out.println("----------------------------------");

        //ListIterator

        List<String> yourList = new ArrayList<>(Arrays.asList("Ali", "Can", "Aliye"));
        System.out.println(yourList); //[Ali, Can, Aliye]

        ListIterator<String> yourListItr = yourList.listIterator();

        //1) set(E e): Koleksiyonun geçerli elemanını değiştirir.

        while (yourListItr.hasNext()){

            String el = yourListItr.next();
            yourListItr.set(el + "*");
        }
        System.out.println(yourList); //[Ali*, Can*, Aliye*]

        //2)elemanlari sondan basa dogru yazdirin
        List<String> yourList2 = new ArrayList<>(Arrays.asList("Ali", "Can", "Aliye"));
        System.out.println(yourList2); //[Ali, Can, Aliye]

        ListIterator<String> listItr2 = yourList2.listIterator();

        //bu loop pointer'i en saga almak icin yazildi
        while (listItr2.hasNext()){
            listItr2.next();
        }
        //elemanlari sondan basa dogru yazdirin

        while (listItr2.hasPrevious()){ //onceki eleman var mi diye kontrol ettik
            String el = listItr2.previous(); //previouse pointer'i sagdan sola alir
            System.out.println(el + " <-- ");
            //Aliye <--
            //Can <--
            //Ali <--
        }


    }
}
