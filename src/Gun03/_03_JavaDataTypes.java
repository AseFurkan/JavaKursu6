package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayi; // hafızada int kadar yer kaplar, sadece tam sayı atılabilir
        // tam sayılarda default int

        //tam sayilar
        byte byteDeger=7; // -128 - 127
        short shortDeger=1645;   // -32000 - 32000
        int intDeger=250000;
        long longDeger = 3434345454545454L;

        // ondalıklı sayıları defaultu double
        //ondalıklı sayılar
        double doubleDeger= 3.143434343434343434555; // noktadan sonra 16 haneye kadar hassasyiyet var
        float floatDeger= 3.143434f;   // noktadan 5 hane hassasiyeti var, ama kararsız


        // karakter ve Harfler
        char basHarf='Ğ';  // bir tane harf saklayabilir, tek tırnak kullanılır
        String isim="İsmet";  // kelime veya cümle saklayabilir, uzunluğu değişken, çift tırnak kullanılır

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);
    }
}
