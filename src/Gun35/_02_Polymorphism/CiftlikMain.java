package Gun35._02_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1 = new Kopek("karabaş");
        //   kopek1.ses(); //havladı
        //   kopek1.kokladı(); //kokladı

        Kedi kedi1 = new Kedi("Pamuk");
        //kedi1.ses();//miyavladı
        //kedi1.tirmaladi(); //tırmaladı


        // kopekSesi(kopek1); // havladı
        // kediSesi(kedi1); // miyavlad

        hayvanSesi(kopek1);
        hayvanSesi(kedi1);

        // Setlerden HashSet
        // Maplarden HashMap
        // Listlerden ArrayList

        // Hayvanlardan Kedi
        // Hayvanlardan Kopek
        // Hayvanlardan hayvan



        Hayvan hayvan1=new Hayvan("ördek"); //hayvanlardan 1 hayvan
        Hayvan hayvan2=new Hayvan("kangal"); //hayvanlardan 1 kopek
        Hayvan hayvan3=new Hayvan("boncuk"); //hayvanlardan 1 kedi

        System.out.println(" -----------------------------");

        hayvan1.ses(); //ses çıkardı
        hayvan2.ses(); //havladı
        hayvan3.ses(); //miyavladı

        System.out.println(" -----------------------------");

       // ((Kopek)hayvan2).kokladı();



        //Polymorphism -
        //çok formluluk  - Çok çeşitlilik
        //şizofren bir konu
        //
        //:  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
        // ve bu şekilde kullanılabilmesine Polymorphism denir.
        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.

    }

    public static void hayvanSesi(Hayvan hayvan) {
        hayvan.ses(); // ses çıkardı mı, havladı mı
        //bir classın aslında  kim olduğunu bulma yöntemi
        if (hayvan instanceof Kopek) // hayvan aslında kopek ise
            ((Kopek) hayvan).kokladı();
        if (hayvan instanceof Kedi) // hayvan aslında kedi ise
            ((Kedi) hayvan).tirmaladi();
    }

    public static void kopekSesi(Kopek kopek) {
        kopek.ses();
    }

    public static void kediSesi(Kedi kedi) {
        kedi.ses();
    }
    //  Hayvan classından türettiğimiz-extend yaptığımız için
//  hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
//  köpek ve kedi için classlarında Override yaparak yazdığımız
//  özellikleri alarak yazdı.
//  Ama tırmaladı , kokladı gibi kedi, köpek classına özel olarak
//  yazdıklarımızı hayvanSesi methodunda yazdıramayız.
}