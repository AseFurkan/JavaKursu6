package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.Set;

public class _04_ZonedDateTime {
    public static void main(String[] args) {

        ZonedDateTime zdt= ZonedDateTime.now();
        // şu anda benim bulunduğum yerin default zamanını veriri
        // LocalDateTime.now() gibi saat olarak
        // diğer zonelar için ZonedDateTime.now(ZoneId);

        System.out.println("zdt = " + zdt);
        // 2023-07-20T19:02:48.344+01:00[Asia/Istanbul]
        // Asia/Istanbul  : ZoneId

        // Locale.getAvailableLocales(); gibi
        Set<String> zamanZoneIdleri= ZoneId.getAvailableZoneIds();

        for(String z : zamanZoneIdleri){

            if (!z.toLowerCase().contains("bul"))
                continue;

            System.out.println("z = " + z);
        }

        ZoneId zoneIdIstanbul=ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul= ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);
        //zoneIstanbul = 2023-07-20T21:09:37.328+03:00[Europe/Istanbul]
    }
}
