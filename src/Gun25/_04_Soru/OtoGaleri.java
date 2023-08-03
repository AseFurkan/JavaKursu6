package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class OtoGaleri {


    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        ArrayList<Araba> galeri=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Araba a=new Araba();

            System.out.print("Araba No=");
            a.arabaNo=okuInt.nextInt();
            System.out.print("Araba Markası=");
            a.marka=okuStr.nextLine();
            System.out.print("Araba Uretim yılı=");
            a.uretimYili=okuInt.nextInt();

            galeri.add(a);
        }

        arabalarYazdir(galeri);
        uretimOrtalamasiYazdir(galeri);
        int ort=uretimOrtalamasiYazdir2(galeri);
        System.out.println("ort = " + ort);
    }

    public static int uretimOrtalamasiYazdir2(ArrayList<Araba> galeri){
        int toplamYil=0;
        for (Araba a : galeri)
            toplamYil=toplamYil+a.uretimYili;

        int ort=toplamYil/ galeri.size();
        return ort;
    }

    public static void arabalarYazdir(ArrayList<Araba> galeri){
        for (Araba a : galeri)
            System.out.println(a.arabaNo+" "+a.marka+" "+a.uretimYili);
    }

    public static void uretimOrtalamasiYazdir(ArrayList<Araba> galeri){
        int toplamYil=0;
        for (Araba a : galeri)
            toplamYil=toplamYil+a.uretimYili;

        int ort=toplamYil/ galeri.size();
        System.out.println("ort = " + ort);
    }


}
