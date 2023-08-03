package Gun12;

import java.util.Scanner;

public class _04_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        System.out.print("1.Sayi=");
        int sayi1=oku.nextInt();

        System.out.print("2.Sayi=");
        int sayi2=oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma  için P");
        System.out.println("Bölme   için B");
        System.out.print("Seçiminiz=");
        String secim=okuStr.next(); // T,Ç,P,B
        
        
        if (secim.equalsIgnoreCase("T"))
            System.out.println(sayi1+sayi2);
        else if (secim.equalsIgnoreCase("Ç"))
            System.out.println(sayi1-sayi2);
        else if (secim.equalsIgnoreCase("P"))
            System.out.println((double)(sayi1/sayi2));
        else if (secim.equalsIgnoreCase("B"))
        System.out.println((double)(sayi1/sayi2) );
        else
        System.out.println("hatalı giriş " );

        /*

        //merdivenli if , ladder if
        if (secim.equalsIgnoreCase("T"))
            System.out.println("toplam = " + (sayi1+sayi2));
        else
            if (secim.equalsIgnoreCase("Ç"))
                System.out.println("çıkarma = " + (sayi1-sayi2));
            else
                if (secim.equalsIgnoreCase("P"))
                   System.out.println("Çarpma = " + (sayi1*sayi2));
                else
                   if (secim.equalsIgnoreCase("B"))
                       System.out.println("Bölme = " + ((double)sayi1/sayi2));
                   else
                       System.out.println("Hatalı giriş");


         */
    }
}
