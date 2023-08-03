package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // Otopark ücretleri : (Ternary operatör ile yapınız.)
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız.

        Scanner read= new Scanner(System.in);
        System.out.print("aracınız kaç saat otoparkta kaldı ?  = ");
        int sure = read.nextInt();

        System.out.println(sure<4? 10 : sure<6 ? 15 : 20);


/*


        Scanner oku=new Scanner(System.in);
        System.out.print("Saat=");
        int saat=oku.nextInt();

        String ucretStr= (saat<=3) ? "10 ₺" :    (saat<=5) ? "15 ₺" : "20 ₺" ;
        System.out.println("ucretStr = " + ucretStr);

        // 2.yöntem
        System.out.println(  (saat<=3) ? "10 ₺" :    (saat<=5) ? "15 ₺" : "20 ₺"    );
 */
    }
}
