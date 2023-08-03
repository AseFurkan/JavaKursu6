package Gun40;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _02_JavaLocalDate {
    public static void main(String[] args) {
        //LocalDate sadece gün ay yıl bilgisini tutar

        LocalDate tarih = LocalDate.now();  //şuanki tarihi ver

        DateTimeFormatter ozelFormat = DateTimeFormatter.ofPattern("MMMM EEEE dd.MM.yyyy");
        System.out.println("MMMM EEEE dd.MM.yyyy =" + tarih.format(ozelFormat));

        System.out.println("*************Başka bir formatta gösterim***********");
        //lokalden aldığım tarihi başka dilde formatta gösterimi
        System.out.println(tarih.format(ozelFormat.withLocale(Locale.GERMANY)));

// Lokalizasyon tanımlaması ne demek
        // en-US : Amerikanı nın İngilizce konuşulan lokalizasyonu (Bölgesi)
        // en-UK : İngiltere nin İngilizce konuşulan lokalizasyonu (Bölgesi)
        // fr-CA : Kanada nın fransızca konuşulan lokalizasyonu (Bölgesi)
        // en-CA : Kanada nın ingilizce konuşulan lokalizasyonu (Bölgesi)
        // tr-TR : Türkiye nin Türkçe konuşulan bölgesi


        Locale lCibce=new Locale("zh","Ch"); //çinin zh konuşulan bölgesi
        System.out.println("çince tarih ="+ tarih.format(ozelFormat.withLocale(lCibce)));

        //kullanılabilir Local leri bulma

    Locale[] kullanılabilirLokaller=Locale.getAvailableLocales();
    for (Locale l:kullanılabilirLokaller) {
        System.out.print("dili =" + l.getDisplayLanguage());
        System.out.print("Ülkesi =" + l.getDisplayCountry());
        System.out.print("dili =" + l.getLanguage());
        System.out.print("Ülkesi =" + l.getCountry());
        System.out.println();

    }
Locale lTurkiye=new Locale("tr","TR");
        System.out.println("tarih.format(ozelFormat.withLocale(lTurkiye)) = " + tarih.format(ozelFormat.withLocale(lTurkiye)));
    }
}
