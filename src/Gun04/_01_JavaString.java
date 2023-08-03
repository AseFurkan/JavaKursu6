package Gun04;

public class _01_JavaString {
    public static void main(String[] args) {
        int sayac = 0; // int tipi,  sayac adı, 0 başlangıç değeri

        String ad = "ismet";  // kelime veya kelimeler saklyacaksan String

        System.out.println("sayac = " + sayac); // 0 yazar
        System.out.println("ad = " + ad); // ismet

        String soyad = "Temur";
        System.out.println("soyad = " + soyad);

        String tamAd = ad + " " +soyad;  // + işareti sayılarda toplar,
                                          // kelimelerde yan yana birleştirir
        System.out.println("isim= " + tamAd); // ismet Temur
    }
}
