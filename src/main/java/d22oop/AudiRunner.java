package d22oop;

public class AudiRunner {
    public static void main(String[] args) {
        //Motor m = new Motor(); HATA: interface'lerden object uretemezsiniz.

        AudiA4 a4 = new AudiA4();
        a4.turbo(); //Audi A4 turbo motor kullanir
        a4.analog(); //Audi A4 analog klima kullanir
        a4.esp(); //Audi A4 esp fren sistemi kullanir

        AudiS5 s5 = new AudiS5();
        s5.eco(); //Audi S5 ekonomik bir motor kullanir
        s5.turbo(); //Audi S5 turbo bir motor kullanir
        s5.gas();  //Audi S5 benzinli motor kullanir
        s5.analog(); //Audi S5 analog klima kullanir
        s5.dijital(); //Audi S5 dijital klima kullanir
        s5.abs(); //Audi S5 abs fren sistemi kullanir
        s5.esp(); //Audi S5 esp fren sistemi kullanir
    }
}
