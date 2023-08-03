package Gun30._04_Soru;

import java.util.Scanner;

public class SoruMain {
    public static void main(String[] args) {

        int gun=0;
        int saat=0;
        int dak=0;

        Scanner read =new Scanner(System.in);
        System.out.print("Gün = "); gun=read.nextInt();
        System.out.print("Saat = "); saat=read.nextInt();
        System.out.print("Dakika = "); dak=read.nextInt();

        int toplamSaniye=
                gun
                        *Sabitler.birGundekiSaatSayisi
                        *Sabitler.birSaatdekiDakikaSayisi
                        *Sabitler.birDakikadakiSaniyeSayisi
                        +
                        saat
                                *Sabitler.birSaatdekiDakikaSayisi
                                *Sabitler.birDakikadakiSaniyeSayisi
                        +
                        dak
                                *Sabitler.birDakikadakiSaniyeSayisi;
        System.out.println("toplamSaniye = " + toplamSaniye);
        //2. yöntem
        System.out.println("toplamSaniye= "+Sabitler.hesapla(gun,saat,dak));
    }


}

