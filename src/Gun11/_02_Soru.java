package Gun11;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız
Scanner read= new Scanner(System.in);
        System.out.print("aracınız kaç saat otoparkta kaldı ?  = ");
        int sure = read.nextInt();

        if (sure<=3)
            System.out.println("Ücret =10 tl ");
        else if (sure<=5)
            System.out.println("Ücret =15 tl ");
        else
            System.out.println("Ücret =20 tl ");
        /*


        Scanner oku=new Scanner(System.in);
        System.out.print("Bir saat giriniz=");
        int saat=oku.nextInt();

//        eğer 3 ve 3 den küçükse 10 tl
//        değilse
//        {
//            eğer 5 den küçükse  15 tl
//            değilse  20 tl
//        }

        if ( saat <= 3)
            System.out.println("10 ₺");
        else  // saat>3
        {
             if (saat <=5)
                 System.out.println("15 ₺");
             else
                 System.out.println("20 ₺");
        }



         */

    }
}
