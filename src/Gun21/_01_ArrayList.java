package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {

        // dizi,array: boyut sayısı belli , sonradan değiştirelemz
        int[] dizi=new int[5]; // 5 elemanlı Array, boyutu değiştirilemez

        // Boyutu dinamik olsun, eleman ekledikçe uzasın, sildikçe kısalsın
        // ArrayList : boyutunu baştan vermen gerekmiyor. boyutu başlangıçta 0
        // eleman ekledikçe artar, sildikçe kısalır.

        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Ahmet"); // uzunluk 1
        isimler.add("Metin"); // 2
        isimler.add("Burak"); // 3
        isimler.add("Cansu"); // 4  // sona ekler

        System.out.println("isimler = " + isimler); // yazdırır
        System.out.println("isimler.size() = " + isimler.size() ); // uzunluğunu verir

        isimler.add(1,"Nurhayat"); // verilen ındex e ekliyor,  diğerleri 1 kayıyor sona doğru
        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size() );

        isimler.set(1,"Elife"); // verilen indexdeki elemanı değiştirir
        System.out.println("isimler = " + isimler);

        boolean varMi= isimler.contains("Elife"); // Elife var mı
        System.out.println("Elife varMi = " + varMi);

        isimler.remove("Ahmet"); // değere göre sil
        System.out.println("isimler = " + isimler);

        isimler.remove(2); // 2 (Burak) indexe göre sil
        System.out.println("isimler = " + isimler);

        int indexOfMetin= isimler.indexOf("Metin"); // Metin in indexi
        System.out.println("indexOfMetin = " + indexOfMetin);

        String ilkEleman=isimler.get(0);// 0.elemanı ver
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear();
        System.out.println("isimler = " + isimler);

    }
}
