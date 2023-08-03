package Gun09;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığı yazdırınız
        // VAR ve YOK şeklinde

//        hava  -> var desin
//        HAVA  -> var desin

        Scanner oku= new Scanner(System.in);
        System.out.print("Cümle giriniz=");
        String cumle=oku.nextLine();

        cumle=cumle.toLowerCase(); // bütün büyük harfler küçük oldu

        if (cumle.contains("a"))
            System.out.println("VAR");

        if (!cumle.contains("a"))
            System.out.println("YOK");

    }
}
