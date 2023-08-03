package Gun35._03_PolymorphismSoru;

public class Calisan extends kisi{
private String departman;

   public Calisan(String ad, String soyad, String gorevi,String departman) {

      super(ad, soyad, gorevi);
      setDepartman(departman);
   }

   public String getDepartman() {
      return departman;
   }

   public void setDepartman(String departman) {
      this.departman = departman;
   }
}
