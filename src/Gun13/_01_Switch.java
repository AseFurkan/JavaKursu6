package Gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        // Daha önce çözdüğünüz hesap makinesi sorusunu,
        // switch ile çözünüz.

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



        switch (secim.toUpperCase()){ // sadece 1 eşitlik durumu için çalışır
            case "T" :  System.out.println("toplam = " + (sayi1+sayi2)); break;
            case "Ç" :  System.out.println("Çıkarma = " + (sayi1-sayi2)); break;
            case "P" :  System.out.println("Çarpma = " + (sayi1*sayi2)); break;
            case "B" :  System.out.println("Bölme = " + ((double)sayi1/sayi2)); break;
            default  :  System.out.println("Hatalı değer");
        }


    }
}
