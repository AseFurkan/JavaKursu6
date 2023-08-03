package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        ogr1.okulNo = 1001;
        ogr1.ad = "hakan";
        ogr1.soyad = "Kılıç";

        ogr1.okul = new Okul();
        ogr1.okul.okulAd = "bayrak okulu";
        ogr1.okul.okulMudurAd = "Selim Özel";
        ogr1.okul.adres = "ümraniye/İst";

        System.out.println("ogr1.ad = "+ogr1.ad);
        System.out.println("ogr1.okul.okulAd = " + ogr1.okul.okulAd);

    }
}