package Gun39.Soru3;

public class Kedi extends Hayvan{
    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void Yiyecegi() {
        System.out.println("balık ve mama yer ");
    }

    @Override
    void YemekMiktari() {
        System.out.println("100 gr yer");
    }

    @Override
    void GunlukUykuSuresi() {
        System.out.println("16 saat ");
    }

    @Override
    void Sesi() {
        System.out.println("miyav");

    }
}
