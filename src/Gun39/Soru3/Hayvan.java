package Gun39.Soru3;

public abstract class Hayvan {
   private final int Id;
   private String Isim;
   private boolean Vahsi;
   private String DogumTarihi;

   //protected Hayvan(int id) {
   //    Id = id;
   //}

    abstract void Yiyecegi();

   abstract void YemekMiktari();
    abstract void GunlukUykuSuresi();
    abstract void Sesi();

    private static int sayacId=1; // static deme sebebi tek olmasını saplamak

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
        this.Id=sayacId++;
    }

    @Override
    public String toString() {
        System.out.println("Yiyecegi= "); Yiyecegi();
        System.out.println("YemekMiktari= "); YemekMiktari();
        System.out.println("GunlukUykuSuresi= "); GunlukUykuSuresi();
        System.out.println("Sesi= "); Sesi();

        return "Hayvan{" +
                "Id=" + Id +
                ", Isim='" + Isim + '\'' +
                ", Vahsi=" + Vahsi +
                ", DogumTarihi='" + DogumTarihi + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }



    public String getIsim() {
        return Isim;
    }

    public void setIsim(String isim) {
        Isim = isim;
    }

    public boolean isVahsi() {
        return Vahsi;
    }

    public void setVahsi(boolean vahsi) {
        Vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return DogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        DogumTarihi = dogumTarihi;
    }
}
