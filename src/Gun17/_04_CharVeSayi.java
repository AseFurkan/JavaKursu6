package Gun17;

public class _04_CharVeSayi {
    public static void main(String[] args) {

//        A   hava    A  bilgisayar için her şey sayı
//        A->65
//        a->97
//
//        karakter ve karşılık gelen sayıların yer aldığı tablo var.
//        A->65 , 65 saklıyor.
//        65->A ,  A yazıyor
//
//        bu tabloya ascii denir.

        int sayi = 65;
        System.out.println("sayi = " + sayi);

        char harf= (char) 65;
        System.out.println("harf = " + harf);

        //ascii tablosunu
        for (int i = 0; i <= 255; i++) {

            harf= (char) i;
            System.out.println(i+" nolu harf = " + harf);
        }



    }
}
