package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız
        // tek veya çift şeklinde yazdırınız

        Scanner oku= new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi=oku.nextInt();


        //eğer sayı 2 ye blümünden kalan var ise tektir
        if (sayi%2 ==  1)  // (sayi%2 !=  0)
            System.out.println("tek");


        if (sayi%2 == 0)
            System.out.println("çift");

    }
}
