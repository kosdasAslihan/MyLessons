package d22oop;

public class Accord extends Honda{
    //1-Honda'nin child'i extends ile yapildi. //public class Accord extends Honda
    //2-@Override yazildi.
    //3-Abstract silindi - public abstract void engine() seklindeydi sildik
    //4Suslu parantez ile body eklendi -public abstract void engine(); seklinden public void engine(){ } oldu

    @Override
    public void engine(){
        System.out.println("Gas 2.0 Turbo");
    }

}
