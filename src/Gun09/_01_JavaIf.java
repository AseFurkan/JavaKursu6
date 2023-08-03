package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // Baklava dilimimiz : if
        // Girilen bir sayı 10 dan büyük ise ekrana 10 büyük yazdırınız.
        //        1-Başla     {
        //        2-sayi oku  sayi=oku.nextInt();
        //        3-sayi > 10 ise "10 dan büyük" yaz   if (sayi>10) sout..
        //        4-Dur }

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        if (sayi>10) // normal parantez şart
        {  // if in şartı sağlandığında çalışacak bölüm
            System.out.println("10 dan büyük");
            System.out.println("if deyimi kullanıldı");
        }  // curly braces

        // {} parantezlerini herzaman kullanabilirsiniz ,
        // ancak if şartı sağlandığında çalışacak tek bir komut var ise
        // kullanmak zorunlu değildir.


    }

}
