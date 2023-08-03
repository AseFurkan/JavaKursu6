package Gun30._01_StaticVariables.Ornek1;

public class Okul {

    public static void main(String[] args) {
//        Ogrenci ogr1 = new Ogrenci("ismet", "temur", "Yıldırım İlkokulu");
//        Ogrenci ogr2 = new Ogrenci("Serkan", "Şengül", "Yıldırım İlkokulu");
//        Ogrenci ogr3 = new Ogrenci("Elif", "Özen", "Yıldırım İlkokulu");
//
//        //...
//        //...
//        Ogrenci ogr499=new Ogrenci("Senol","Doğan","Yıldırım İlkokulu");
//        Ogrenci ogr500=new Ogrenci("Murat","Savluk","Yıldırım İlkokulu");


        Ogrenci ogr1=new Ogrenci("ismet","temur");
        System.out.println("ogr1 = "+ ogr1);

        Ogrenci.okulAdi="Atatürk İlkokulu";
        System.out.println("ogr1 tekrar = " +ogr1);



        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hazıfazada NESNE sayısı kadar tekrarlanması engellendi
    }

}
