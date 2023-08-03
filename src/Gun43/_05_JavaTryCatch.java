package Gun43;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class _05_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Proğram çalışmaya başladı");

      try { // dene, hatanın başladığı yerin üzerine konulur
          LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);//RintimeError
      }// hata olduğu zaman proğramı kırma
      catch (Exception ex) // ex isimli değişkende oluşan hataların bilgisi atanıyor
      {
          System.out.println("Hata Oluştu "+ ex);
          System.out.println("ex.getMessage() = " + ex.getMessage());
          // log tutabilirsin ekranın fotoğrafını alabilirsin
      }
        System.out.println("*program bitti*");

      // kurstaki hata durumu yönetimi
        try {
            //java ve toolları çalışmaya devam  et
            //konuları grupla çalışmaya devam
            //anlamadığın yerler mi oldu runtime error
        }
        catch (Exception ex){
            // hatanın sebebini anla
            // derse daha fazla odaklan
            // anlamadığın yerleri sor,
            // videoları tekrar izle
            //grup çalışmasına devam et
        }













    }
}
