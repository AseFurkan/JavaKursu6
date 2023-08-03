package Gun34._02soru;

public class Ogrenci {
    private int Id;
    private String isim;
    private OgrTip tipi;

    private static int SayacId=1;
    public Ogrenci(String isim, OgrTip tipi) {
       setIsim(isim);
       setTipi( tipi);
       setId(SayacId++);
       // this.Id=SayacId++;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public OgrTip getTipi() {
        return tipi;
    }

    public void setTipi(OgrTip tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "Id=" + Id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi +
                '}';
    }
}
