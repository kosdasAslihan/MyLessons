package d20instanceblock_oop;

public class InstanceBlock2 {
    public int year;

    {
        System.out.println("Herkese selam");
    }

    public InstanceBlock2() {
        //System.out.println("Herkese selam"); //kisa kod olmasi icin yukari yazdik
    }
    public InstanceBlock2(int year) {
        //System.out.println("Herkese selam"); //kisa kod olmasi icin yukari yazdik
        this.year = year;
    }
}
