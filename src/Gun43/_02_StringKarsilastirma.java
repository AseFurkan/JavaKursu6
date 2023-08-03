package Gun43;

public class _02_StringKarsilastirma {
    public static void main(String[] args) {
        String cumle1="bugün hava çok güzel";
        String cumle2="bugün hava çok güzel";

        // ilker tiplerdei karşılaştırdıgından 2 sinde de degerleri
        // karşılaştırır çünkü başka bir şeyi yok
        if (cumle1==cumle2)
            System.out.println("cumle 1 vee cumle2 eşit");
        else
            System.out.println("cumle 1 vee cumle2 eşit değil ");


        if (cumle1.equals(cumle2))
            System.out.println("cumle 1 vee cumle2 eşit");
        else
            System.out.println("cumle 1 vee cumle2 eşit değil ");

        // Referans Tiplerde ise durum
        //Scanner le ekrandan okuduğunda aşagıdaki gibi olur
        String cumle3=new String("bugün hava çok güzel");
        String cumle4=new String("bugün hava çok güzel");

        //manası referansları aynı mı ? diye kontrol etti
        if (cumle3==cumle4) // referans tiplerde  Referansları aynı mı
            System.out.println("cumle 3 vee cumle4 eşit");
        else
            System.out.println("cumle 3 vee cumle4 eşit değil ");


        // değerleri aynı mı
        if (cumle3.equals(cumle4)) // equals her zaman değerleri karşılaştırır
            System.out.println("cumle 3 vee cumle4 eşit");
        else
            System.out.println("cumle 3 vee cumle4 eşit değil ");


        //ÖZET : Nesne(String)ve referans(dizi,ArrayList,Nesneler )  tiplerde
         // herzaman equals kullanılır ,
        // ilkel(Sayısal,boolean ) tiplerde == kullanılır


    }
}

