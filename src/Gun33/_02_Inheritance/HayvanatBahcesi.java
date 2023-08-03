package Gun33._02_Inheritance;

public class HayvanatBahcesi {
    public static void main(String[] args) {
       Kedi kedi1=new Kedi("Siyah",8,"van");
        System.out.println("kedi1 = " + kedi1);
        kedi1.konustu();

        Kopek kop1=new Kopek("sarı",8,"golden");
        System.out.println("köp1 = " + kop1);
    kop1.konustu();
    }

    Yilan yil1=new Yilan("siyah",3,"engerek",3);

}
