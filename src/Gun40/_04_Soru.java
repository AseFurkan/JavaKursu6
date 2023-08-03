package Gun40;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _04_Soru {
    public static void main(String[] args) throws InterruptedException {
      //  Canlı digital saat yapınız
        // Canlı digital saat yapınız
        // 21:32:45 --> 21:32:46  --> 21:32:47...  21:33:00 --> ... devam
        // aynı yere yazacak
        DateTimeFormatter f=DateTimeFormatter.ofPattern("kk:mm:ss");

        while (true){
            LocalTime saat= LocalTime.now();
            System.out.print("\r"+saat.format(f));
            // 1 sn bekle
           Thread.sleep(1000); // milisaniye aldığı için 1000ms =1sn
        }

    }
}
