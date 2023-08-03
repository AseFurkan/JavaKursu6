package Gun28._01_Ornek;

import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();

        //1.yol
        ogr1.id=1;
        ogr1.ad="ismet";
        ogr1.soyad="temur";
        ogr1.sinif=6;
        System.out.println("ad =" + ogr1.ad);

        //2.yöntem
        Ogrenci ogr2=new Ogrenci(2,"mehmet","yılmaz",5);
        System.out.println("ad2 = "+ogr2.ad);

        //3.yöntem
        Ogrenci ogr3=new Ogrenci(3,"Ayşe","demir");
        System.out.println("ad3 = "+ogr3.ad);

    }


}
