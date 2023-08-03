package Gun26._02_Ornek;

import java.util.ArrayList;

public class Sirket {
    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : Bu degerlerı yazıdırınız.
    // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
    //           çalıştığında kişinin doğum yılını versin.

        public static void main(String[] args) {
        Person cal1=new Person();
        cal1.name="Senol";
        cal1.surname="Dogan";
        cal1.age=20;

        Person cal2=new Person();
        cal2.name="Sokol";
        cal2.surname="Rrustemi";
        cal2.age=25;

        //1.Yöntem
        System.out.println("cal1.name = " + cal1.name);
        System.out.println("cal1.surname = " + cal1.surname);
        System.out.println("cal1.age = " + cal1.age);

        System.out.println("cal2.name = " + cal2.name);
        System.out.println("cal2.surname = " + cal2.surname);
        System.out.println("cal2.age = " + cal2.age);

        //2.Yol
        BilgiYazdir(cal1);
        BilgiYazdir(cal2);

        //3.Yol
      cal1.bilgiYazdir();
      cal2.bilgiYazdir();
       //4.Yol
//        ArrayList<Integer> list=new ArrayList<>();
//        System.out.println("list = " + list.toString());

        System.out.println("cal1 = " + cal1);
        System.out.println("cal2 = " + cal2);

        cal1.getBirthYear();
        cal2.getBirthYear();

        System.out.println("cal1.getBirthYear2() = " +
                cal1.getBirthYear2());
    }

    public static void BilgiYazdir(Person cal) {

        System.out.println("cal1.name = " + cal.name);
        System.out.println("cal1.surname = " + cal.surname);
        System.out.println("cal1.age = " + cal.age);
      }
/*
    public static void BilgiYazdir(Person cal) // cal1 , cal2
    {
        System.out.println("cal.name = " + cal.name);
        System.out.println("cal.surname = " + cal.surname);
        System.out.println("cal.age = " + cal.age);


 */
}
