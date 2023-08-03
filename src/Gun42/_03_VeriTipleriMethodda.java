package Gun42;

import java.util.Arrays;

public class _03_VeriTipleriMethodda {
    public static void main(String[] args) {
        // ilkel tip 
        int sayi = 5;
        sayiArtir(sayi); // SADECE DEĞERİ gitti, kendisi değil
        System.out.println("sayi = " + sayi);

        sayi = sayiArtir2(sayi);
        System.out.println("sayi = " + sayi);

        //referans tiplerde (new)
        int[] dizi = new int[]{1, 2, 3, 4};
        diziSifirla(dizi); // giden referansı ise 0000, değilse 1234

        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
                //Nesne Tipler

       String kelime="ismet";
        kelimeSifirla(kelime);
        System.out.println("kelime = " + kelime); // ismet

        // Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler. Eşitlemelerde referanslar eşitlenir.

    }

    public static void kelimeSifirla(String kelime) {
        kelime = "";
    }

    public static void diziSifirla(int[] dizi5) { // gelen referansı ise 0000 , değilse 1234
        dizi5[0] = 0;
        dizi5[1] = 0;
        dizi5[2] = 0;
        dizi5[3] = 0;
    }

    public static void sayiArtir(int sayi) { //ilkel tiplerde sadece değer gelir
        sayi++;
    }

    public static int sayiArtir2(int sayi) {//ilkel tiplerde sadece deger gelir
        sayi++;
        return sayi;
    }

}
