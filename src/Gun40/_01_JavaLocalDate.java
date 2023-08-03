package Gun40;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
 //LocalDate sadece gun ay yıl bilgisi tutar
        LocalDate tarih=LocalDate.now(); // şu andaki tarihi verir

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth()); // ayın adı
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue()); // kaçıncı ay olduğu
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek()); // gün adı
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue()); // haftanın kaçıncı günü
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        // kendisindeki hazır formatlara bakalım : Windowsun yerel ayarlarına göre değişebilir
        System.out.println("ISO_DATE="+ tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT   ="+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM  ="+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG    ="+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL    ="+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("\n****************İstediğimiz formatta gösterim******************");

        //istediğimiz formatta gösterim
        System.out.println("tarih"+ tarih);

        DateTimeFormatter ozelFormat1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy =" + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2= DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih d.M.yy =" + tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3= DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("EEEE dd.MM.yyyy =" + tarih.format(ozelFormat3));

        DateTimeFormatter ozelFormat4= DateTimeFormatter.ofPattern("MMMM EEEE dd.MM.yyyy");
        System.out.println("MMMM EEEE dd.MM.yyyy =" + tarih.format(ozelFormat4));
    }
}