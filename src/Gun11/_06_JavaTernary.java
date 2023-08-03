package Gun11;

import java.util.Scanner;

public class _06_JavaTernary {
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.


        Scanner read= new Scanner(System.in);
        System.out.print("sayi gir = ");
        int sayi = read.nextInt();
        System.out.println((sayi>0)? "pozitif" : sayi<0 ? "negatif " : "sıfır ");

/*
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();
        // ? böyle ise  ,    : else
        System.out.println( sayi==0 ? "Sıfır" :  (sayi>0 ? "Pozitif" : "Negatif")   );

 */
    }
}
