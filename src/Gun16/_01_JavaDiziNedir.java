package Gun16;

public class _01_JavaDiziNedir { // Array = Dizi
    public static void main(String[] args) {
        int sayi=0;

        int ogrNot=0;

        int ogrNot1;
        int ogrNot2;
        int ogrNot3;
        //...
        //...
        //...
        int ogrNot50;

        // bana bir tanımlamada BIRDEN FAZLA değer tutabilen bir değişkene ihtiyacım var;
        // Çözüm :
        int[] notlar= new int[50]; // 50 tane int saklayabilen notlar isimli değişken.

        notlar[0] = 75;
        notlar[1] = 88;
        //...
        //...
        notlar[49]= 95; // en son eleman toplam eleman sayısı-1  length-1 dir böylede 0-49 index dir.
        // 50.Öğrenci notu
        // notlar[50]=56; challanger patlar


        System.out.println("notlar[0] = " + notlar[0]);

        System.out.println("notlar.length = " + notlar.length);
        //50 yani toplam eleman sayısını verir.




    }
}
