package Gun25._02_ornek;

public class Okul {
    public static void main(String[] args) {
        ogrenci ogr1 = new ogrenci();

        ogr1.okulNo = 1002;
        ogr1.adi = "Mehmet";
        //  ogr1.soyadi="Demir";
        ogr1.soyadi = "Demir";
        System.out.println("ogr1.okulNo = " + ogr1.okulNo);
        System.out.println("ogr1.okulNo = " + ogr1.adi);
        System.out.println("ogr1.okulNo = " + ogr1.soyadi);

    }
}
