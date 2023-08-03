package Gun39.Soru3;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void Yiyecegi() {
        System.out.println("Et");
    }

    @Override
    void YemekMiktari() {
        System.out.println("günlük 1 kg ");
    }

    @Override
    void GunlukUykuSuresi() {
        System.out.println(" günde 8 saat uyur ");

    }

    @Override
    void Sesi() {
        System.out.println("ciyak");
    }
}
