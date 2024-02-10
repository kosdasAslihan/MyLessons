package d18datetime_stringbuilder;

import d19stringbuilder_buffer_accessmodifier_static.Student;

public class BaskaPackageClass {
    public static void main(String[] args) {

        Student veli = new Student();
        System.out.println(veli.stdName); //Ali Can
        //address, email, tcKimlik gelmez.

        System.out.println(veli.toString()); //Student{stdName='Ali Can', address='Istanbul', email='alican@gmail.com'}
        //veri sizintisi
    }
}
