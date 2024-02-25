package d25maps;

import java.util.*;

public class Maps01 {
    public static void main(String[] args) {

        //Maps
        //1) Map’ler sozluk gibidir. Aciklamalidir. orn: Ali = 13 .Map’ler collections degildir. Ordan miras almaz
        //2) Sol taraf yani key’ler tekrarsizdir. Value tarafi tekrarli olabilir.
        //3) Key tarafi icin Set kullanilir. Values için ise genellikle Collection yapısı kullanılır.
        //4) Map’in elemanlarina komple ‘entry set’ (giris elemani) denir.

        //Map nasil olusturulur?
        //put():Bir key-value çiftini map’e ekler.

        //1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir.
        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("Ali Can", 13);
        myMap.put("Veli Han", 18);
        myMap.put("Ayşe Kaya", 15);
        myMap.put("Fatma Yilmaz", 19);
        myMap.put("Ali Can", 25); //key tekrarli kullanilirsa son value aktif olur (override), ustune yazar

        System.out.println(myMap); //{Fatma Yilmaz=19, Ali Can=25, Ayşe Kaya=15, Veli Han=18}

        //Sadece ‘key’ degerlerini nasil alabiliriz?
        //keySet(): Map’teki tüm key’lerin bir set’ini döndürür.Set’in sırası rastgeledir.
        Set<String> keyTarafi = myMap.keySet();
        System.out.println(keyTarafi); //[Fatma Yilmaz, Ali Can, Ayşe Kaya, Veli Han]

        //Sadece ‘value’ degerlerini nasil alabiliriz?
        //values():Map’teki tüm value’ların bir collection’ını döndürür.Collection’ın sırası rastgeledir.
        Collection<Integer> valueTarafi = myMap.values(); //Collection yerine baska bir sey yazilabilir mi? (List? Set?)
        System.out.println(valueTarafi); //[19, 25, 15, 18]

        //get(): Bir key’e karşılık gelen değeri döndürür.key verirsiniz value’sunu getirir
        Integer yas = myMap.get("Ali Can"); //buyuk kucuk harfe duyarlı oldugu icin yanlis yazdigimiz zaman null doner
        System.out.println(yas); //25

        //Ornek 1: myMap’deki kisilerin yaslarinin ortalamasi nedir?
        int toplam = 0;
        Collection<Integer> yaslar = myMap.values();
        System.out.println(yaslar); //[19, 25, 15, 18]

        for (Integer w : yaslar){
            toplam = toplam + w;
        }
        System.out.println(toplam / yaslar.size()); //19

        System.out.println("-----------------------------");

        //entrySet() metodu, HashMap’in tüm degerlerini içeren bir Set döndürür.
        // Dongu gibi ayri satirlarda yazdirir.Cunku Loop’lar direkt Map’ler ile kullanilamaz.
        //Bu yuzden ozel method gelistirilmis. Set’in icinde Map yapisi saklanir.

        System.out.println(myMap); //{Fatma Yilmaz=19, Ali Can=25, Ayşe Kaya=15, Veli Han=18}

        Set<Map.Entry<String,Integer>> myEntrySet = myMap.entrySet();
        System.out.println(myEntrySet); //[Fatma Yilmaz=19, Ali Can=25, Ayşe Kaya=15, Veli Han=18]

        for (Map.Entry<String,Integer> w : myEntrySet){
            System.out.println(w);
            //Fatma Yilmaz=19
            //Ali Can=25
            //Ayşe Kaya=15
            //Veli Han=18
        }
        System.out.println("-----------------------------");

        //Ornek 2: Verilen Map’deki kisi isimlerinin character sayisi ile yaslarinin toplamini bulunuz.
        //Java’da Map.Entry kullanarak bir Set üzerinde loop yapabilir ve
        // hem anahtarları (getKey()) hem de değerleri (getValue()) elde edebilirsiniz.

        HashMap<String, Integer> kisiler = new HashMap<>();
        kisiler.put("Ali", 3);
        kisiler.put("Can", 5);
        kisiler.put("Ayşe", 2);

        int sum = 0;

        Set<Map.Entry<String,Integer>> mySet = kisiler.entrySet();
        System.out.println(mySet); //[Can=5, Ayşe=2, Ali=3]

        for (Map.Entry<String,Integer> w : mySet){
            sum = sum + w.getKey().length() + w.getValue();
        }
        System.out.println(sum); //20
    }
}
