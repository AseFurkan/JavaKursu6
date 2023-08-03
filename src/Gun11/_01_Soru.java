package Gun11;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67

        Scanner read=new Scanner(System.in);
        System.out.print(" Sayıları aralarında birer boşluk bırakarak yazınız = " );
        String sayilar=read.nextLine();
        int boslukIndex=sayilar.indexOf(" ");

        int sayi1=Integer.parseInt(sayilar.substring(0,boslukIndex));
        int sayi2=Integer.parseInt(sayilar.substring(boslukIndex+1));

        if (sayi1==sayi2)
            System.out.println("sayi1=sayi2 ");
        else
            System.out.println("eşit değil");


/*
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayıları aralarında bir boşluk olarak giriniz="); // 56 879
        String sayilar=oku.nextLine();

        int boslukIndex= sayilar.indexOf(" ");
        String strSayi1= sayilar.substring(0, boslukIndex); // 56  sayı görünümlü string
        String strSayi2= sayilar.substring(boslukIndex+1);  // 879 sayı görünümlü string

        int sayi1= Integer.parseInt(strSayi1); // 56 sayı oldu
        int sayi2= Integer.parseInt(strSayi2); // 879 sayı oldu

        if (sayi1 ==  sayi2)
            System.out.println("Eşit");
        else
            System.out.println("Eşit Değil");



 */
    }
}
