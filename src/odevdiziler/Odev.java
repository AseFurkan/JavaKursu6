package odevdiziler;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;

public class Odev {
    static String terstenYaz(String metin) {
        String sonuc = "";
        int i;

        for (i = metin.length() - 1; i >= 0; i--) {
            sonuc += metin.charAt(i);
        }
        return sonuc;
    }

    public static void main(String[] args) {

        // 1. Soru
        String cumle0 = "Removes white space from both ends of a string";
        String[] kelimeler = cumle0.split(" ");
        System.out.println("kelime Sayisi = " + kelimeler.length);


        // 2.Soru
        String cumle1 = "Hello World";
        System.out.println("cumle1 = " + terstenYaz(cumle1));

        //3. Soru
        int[] Array1 = {25, 30, 30, 35, 100};
        int toplam = 0;
        for (int i = 0; i < Array1.length; i++) {
            toplam = toplam + Array1[i];
        }
        System.out.println("toplam = " + toplam);

        //4.Soru
        int[] Array2 = {13, 15, 14, 16, 16};
        System.out.println(Arrays.toString(Array2));

        //5.Soru
        String[] Array3 = {"new jersey", "new york", "boston", "California"};
        System.out.println("Eleman  Sayısı =" + (Array3.length));

        //6.Soru
        String Array4[] = {"Apple", "Orange", "Babana", "Kiwi"};
        //bunu da  tek tek yanyana  yazdıralım
        for (int i = 0; i < Array4.length; i++)
            System.out.print("**Array[" + i + "]= " + Array4[i] + "\t\n");

        //7.Soru
        int Array5[] = {12, 14, 21, 23, 10, 4};
        int toplam2 = 0;
        double ortalama;
        for (int i = 0; i < Array5.length; i++) {
            toplam2 = toplam2 + Array5[i];
        }
        ortalama = (toplam2 / (double) (Array5.length));
        System.out.println("ortalama = " + ortalama);

        //8.Soru
        int[] Array6 = {5, 6, 8, 12, 14, 19};
        int teklertoplamı = 0;
        int çiftlerToplami = 0;
        for (int i = 0; i < Array6.length; i++) {

            if (Array6[i] % 2 == 1)
                teklertoplamı = teklertoplamı + Array6[i];

            else
                çiftlerToplami = çiftlerToplami + Array6[i];
        }
        System.out.println("(çiftlerToplami-teklertoplamı) = " + (çiftlerToplami - teklertoplamı));


        //9.Soru
        int[] Sayilar = {15, 25, 22, 18, 30};
        Arrays.sort(Sayilar);
        System.out.println("Sayilar = " + Arrays.toString(Sayilar));
        System.out.println("2. en büyük Sayi = " + Sayilar[Sayilar.length - 2]);


        //10.Soru
        int[] Sayilar2 = {14 , 19 , 5 , 21};
        Arrays.sort(Sayilar2);
        System.out.println("Sayilar2 = " + Arrays.toString(Sayilar2));
        System.out.println("en küçük Sayi = " + Sayilar2[0]);


        //11.Soru
        int[] Sayilar3 = {12,2,5,15,8};
        Arrays.sort(Sayilar3);
        System.out.println("Sayilar3 = " + Arrays.toString(Sayilar3));
        System.out.println("en büyük Sayi = " + Sayilar3[Sayilar3.length - 1]);

        //12.Soru
        String[] meyveler={ "Apple" , "Orange" , "Banana" , "Pineapple"};
        Arrays.sort(meyveler);
        if (Arrays.binarySearch(meyveler,"Apple")>=0)
            System.out.println("**True**");






    }
}