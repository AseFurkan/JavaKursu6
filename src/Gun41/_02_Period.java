package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _02_Period {
    public static void main(String[] args) {
        //Period 2 tarih arasındaki farkı tutar
       // LocalDate ler için kullanılır

        LocalDate dogumTarihi=LocalDate.of(1998,02,11);
        LocalDate buGun=LocalDate.now();

        Period fark=Period.between(dogumTarihi,buGun);
        System.out.println("fark = "+fark);


        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());
        /**************************************************/

        Period period3Gun= Period.ofDays(3);
        Period period3Ay= Period.ofMonths(3);

        System.out.println(" period3Gun =" +period3Gun);
        System.out.println(" period3Ay =" +period3Ay);

        LocalDate ucGunSonra=buGun.plus(period3Gun);
        System.out.println("ucGunSonra "+ucGunSonra);

        LocalDate ucAySonra=buGun.plus(period3Ay);
        System.out.println( "ucAySonra = "+ucAySonra);

        /***********************************************/

        //1. Soru Kursun bitiş tarihini bulunuz
        LocalDate kursBaslangıcı=LocalDate.of(2023,05,15);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursbitis=kursBaslangıcı.plus(kursSure);

        System.out.println("kursbitis =" +kursbitis);
        System.out.println("kursbitis günü  = " + kursbitis.getDayOfWeek());


        //2.Soru : Kursun bitmesine nekadar süre kaldı ?
        Period neKadarSureKaldi= Period.between(buGun, kursbitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);

        //3.Soru : Ne kadar süredir devam ediyor
        Period suAnaKadarDevamSuresi= Period.between(kursBaslangıcı,buGun);
        System.out.println("suAnaKadarDevamSuresi = " + suAnaKadarDevamSuresi);




    }
}
