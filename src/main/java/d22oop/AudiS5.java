package d22oop;

public class AudiS5 implements Motor,Klima,Fren{
    //Odev: Audi S5 class'i olusturup, interface'lere child yapip, gerekli override'lari yapiniz.

    //Motor interface'inden override edilenler
    public void eco(){
        System.out.println("Audi S5 ekonomik bir motor kullanir");
    }
    public void turbo(){
        System.out.println("Audi S5 turbo bir motor kullanir");
    }
    public void gas(){
        System.out.println("Audi S5 benzinli motor kullanir");
    }

    //Klima interface'inden override edilenler
    public void analog(){
        System.out.println("Audi S5 analog klima kullanir");
    }
    public void dijital(){
        System.out.println("Audi S5 dijital klima kullanir");
    }

    //Fren interface'inden override edilenler
    public void abs(){
        System.out.println("Audi S5 abs fren sistemi kullanir");
    }
    public void esp(){
        System.out.println("Audi S5 esp fren sistemi kullanir");
    }
}
