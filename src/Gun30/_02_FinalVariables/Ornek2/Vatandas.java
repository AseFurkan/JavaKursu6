package Gun30._02_FinalVariables.Ornek2;

public class Vatandas {
  String isim;
  String adres;
  final int tcNo;
  private static int sayac=1;

    public Vatandas(String isim, String adres) {
        this.isim = isim;
        this.adres = adres;
        this.tcNo=sayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
