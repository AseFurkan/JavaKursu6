package Gun06;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadı örneğin "Ismet Temur" ->  I.T.  şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız ve soyadınız=");
        String adSoyad=oku.nextLine();  // Ismet Temur

        char ilkHarf= adSoyad.charAt(0); // I

        int boslukIndex=adSoyad.indexOf(" ");
        char sayadIlkHarf= adSoyad.charAt(boslukIndex+1);

        System.out.println(ilkHarf+"."+sayadIlkHarf+".");




    }
}
