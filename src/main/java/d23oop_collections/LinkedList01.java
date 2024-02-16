package d23oop_collections;

import java.awt.*;
import java.util.*;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        /*Collections (koleksiyonlar), Object'leri depolamak ve işlemek için kullanılan
        bir class'lar ve interface'ler kümesidir.

        —Collections, çeşitli Object (nesne) işleme yöntemlerini de destekler:
                Ekleme: Bir nesneyi bir koleksiyona eklemek için kullanılır.
                Silme: Bir nesneyi bir koleksiyondan silmek için kullanılır.
                Arama: Bir koleksiyonda bir nesneyi bulmak için kullanılır.
                Döngüleme: Bir koleksiyonun tüm nesnelerini işlemek için kullanılır.

        —Collections, Java programcılarının aşağıdakileri yapmasına olanak tanır:
                Verileri verimli bir şekilde depolamak
                Verileri hızlı bir şekilde işlemek(verileri aramak, sıralamak, filtrelemek)
                Verileri güvenli bir şekilde depolamak*/

        //-------------------------------------------------
        /*Java da Array'ler neden eksik kaldi da Collection'lar gelistirildi?

        Java'da array'ler eksik kaldı çünkü:

        Boyutları statiktir: Bu, array'lerin dinamik olarak büyüyemediği veya küçülemediği anlamına gelir.
        İç içe geçmiş array'ler karmaşıktır: Bu, array'lerin birbirleriyle ilişkili olduğu durumlarda karmaşık ve hata yapmaya müsaittir.
        Array'ler genel olarak verimli değildir: Bu, ekleme, silme ve arama gibi işlemler için genellikle daha yavaştır.

        Collections, bu dezavantajları çözmek için tasarlanmıştır.*/

        //-------------------------------------------------

        /*LinkedList: Bağlı bir listedir.

        LinkedList'ler de, bir dizi index'e sahiptir. Ancak, bu index'ler,
        LinkedList'in içinde bulunan node'ların konumunu temsil eder.

        ArrayList'lerde, bir elemana erişmek için, o elemanın index'ine doğrudan erişilebilir.
        Ancak, LinkedList'lerde, bir elemana erişmek için, o elemanın bulunduğu node'a erişmek gerekir.
        Bu, LinkedList'lerde bir elemana erişmenin daha yavaş olmasına neden olabilir.

        1)Her eleman, bir önceki ve bir sonraki elemanı işaret eden (pointer) bağlantılara sahiptir.
        Bu nedenle, ekleme ve silme işlemleri hızlıdır, ancak elemanlara erişim, başka bir elemandan
        başlayarak ilerlemeyi gerektirir. Yani ArrayList'e gore erisim yavastir.
        ArrayList'lerde get(index) ile hizli erisiriz. Ama LinkedList'ler en bastan istenen eleman mi diye
        tek tek bakar.

        2) Başka bir elemanın başından veya sonundan eleman eklemek veya silmek, hızlı bir şekilde yapılabilir.

        3) Bağlantılar ve düğümler (node) nedeniyle LinkedList, genellikle daha fazla bellek kullanır.*/

        /*ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Object list3 = new ArrayList<>();*/
        //List<String> list4 = new List(); HATA, interface'ler constructor tarafında kullanılamazlar

        LinkedList<String> mylist = new LinkedList<>();

        //1-add() : listeye bir eleman ekler
        mylist.add("Ali");
        mylist.add("Veli");
        mylist.add("Ayşe");
        mylist.add("Fatma");

        System.out.println(mylist); //[Ali, Veli, Ayşe, Fatma] insertion order yani ekleme sıramıza göre ekledi. arraylist gibi doğrudan yazdırılabilir

        //---------------- ekstra bilgi - kisa yolla eleman ekleme
        /*LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Eleman1","Eleman2","Eleman3"));
        System.out.println(linkedList); //[Eleman1, Eleman2, Eleman3]

        LinkedList<String> linkedList2 = new LinkedList<>(List.of("Eleman1","Eleman2","Eleman3")); //boyut degistirilir
        System.out.println(linkedList2); //[Eleman1, Eleman2, Eleman3]*/

        /*List<String> immutableList = List.of("Eleman1","Eleman2","Eleman3"); //boyut değiştirilemez
        immutableList.add("Serkan");
        System.out.println(immutableList); //HATA*/

        //2- add(int index, E element); belirtilen konuma bir oge ekler
        mylist.add(1,"Zeynep");
        System.out.println(mylist); //[Ali, Zeynep, Veli, Ayşe, Fatma]

        //3- addFirst(E e): Listenin basina oge ekler
        mylist.addFirst("Hasan");
        System.out.println(mylist); //[Hasan, Ali, Zeynep, Veli, Ayşe, Fatma]

        //4- addLast(E e): Listenin sonuna bir öğe ekler.
        mylist.addLast("Huseyin"); //normalde add metodunu da kullansaydık sona eklerdi ama okunurluk adına böyle bir metod kullanıyoruz
        System.out.println(mylist); //[Hasan, Ali, Zeynep, Veli, Ayşe, Fatma, Huseyin]

        //5) remove(Object o): Belirtilen öğeyi listeden kaldırır ve boolean dondurur, büyük küçük harf duyarlıdır
        boolean m1 = mylist.remove("Ali");
        System.out.println(mylist); //[Hasan, Zeynep, Veli, Ayşe, Fatma, Huseyin]
        System.out.println(m1); //true, sildiğine dair true döndürdü

        //6)removeFirstOccurrence() metodu,
        // belirtilen bir öğeyi LinkedList içinde
        //bastan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en bastaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

        mylist.add("Yusuf");
        mylist.add(3,"Yusuf");
        System.out.println(mylist); //[Hasan, Zeynep, Veli, Yusuf, Ayşe, Fatma, Huseyin, Yusuf]

        mylist.removeFirstOccurrence("Yusuf");
        System.out.println(mylist); //[Hasan, Zeynep, Veli, Ayşe, Fatma, Huseyin, Yusuf]

        //---------------- ekstra bilgi
        /*mylist.removeAll(Collections.singleton("Yusuf")); //listeyi tamamen tarar ve belirtilen ögenin tüm hepsini siler
        System.out.println(mylist); //[Hasan, Zeynep, Veli, Ayşe, Fatma, Huseyin]*/

        //7) removeLastOccurrence metodu, belirtilen bir öğeyi LinkedList içinde
        //sondan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en sondaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.
        mylist.removeLastOccurrence("Yusuf");
        System.out.println(mylist); //[Hasan, Zeynep, Veli, Ayşe, Fatma, Huseyin]

        //8) peek() metodu, bir koleksiyonun ilk elemanına erişmek için kullanılır.
        // Bu metod, elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa null dondurur)
        String s = mylist.peek();
        System.out.println(s); //Hasan

        //9)poll() metodu, bir koleksiyonun başındaki elemanı alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa null döndürür.
        System.out.println(mylist.poll()); //Hasan
        System.out.println(mylist); //[Zeynep, Veli, Ayşe, Fatma, Huseyin]

        //10) element() metodu, bir koleksiyonun başındaki elemanı alır, ancak elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar. (peek() null dondurur)
        // bir koleksiyonun boş olup olmadığını kontrol etmek için NoSuchElementException istisnasını kullanir
        System.out.println(mylist.element()); //Zeynep
        System.out.println(mylist); //[Zeynep, Veli, Ayşe, Fatma, Huseyin]

        //11) pop() metodu, bir koleksiyonun ilk elemanını alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar.(poll() null dondurur)
        System.out.println(mylist.pop()); //Zeynep

    }
}
