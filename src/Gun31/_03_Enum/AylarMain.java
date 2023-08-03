package Gun31._03_Enum;

import Gun31._02_Soru.Status;

import java.sql.SQLOutput;
import java.time.Month;

public class AylarMain {
    public static void main(String[] args) {

        Aylar ay=Aylar.AGUSTOS;

        System.out.println("ay ="+ay);
        System.out.println("ay.ayNo = " + ay.ayNo);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);
        System.out.println("ay.ayAd = " + ay.ayAd);

        for (Aylar a:Aylar.values()) {
            System.out.println(a.ayNo+"-"+a.ayAd+"-"+a.gunMiktar);

        }

        //Month.NOVEMBER


    }
}
