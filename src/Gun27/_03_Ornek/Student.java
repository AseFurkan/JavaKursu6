package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;

    int maxsaat;

    ArrayList<Lesson> dersleri=new ArrayList<>();


    public void dersYazdir(){
        System.out.println("\n***    Transkript    ***");
        System.out.println("Sayın, "+ name);
        System.out.println("Aldığınız dersler aşagıdadır.");
        for (Lesson d:this.dersleri)
            System.out.println(d.name+" - "+ d.saat);
         }

   public static void universiteKurallari() //6.Adım
    {
        System.out.println("Kural 1: Çaysız ve üzümsüz derse gelme");
        System.out.println("Kural 2: Uykunu mutlaka al, sağlık en önemlisi");
        System.out.println("Kural 3: Her zaman dinç ve dinamik ol ve pozitif ol");
        System.out.println("Kural 4: En başta verdiğin sözü unutma, şu an kamptasın");
        System.out.println("Kural 5: İnş, biz bu işi başaracağız.");
        System.out.println("tekrarsız derse gelme");
        System.out.println("Kendi hatasını bulan kraldır");

    }


}
