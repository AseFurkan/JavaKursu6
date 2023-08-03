package Gun06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // Girilen bir stringin sadece son Harfini yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("cumle=");
        String cumle=oku.nextLine();

        // 01234
        // bugün   uzunluk =5      length-1

        int uzunluk=cumle.length();
        char sonHarf= cumle.charAt(uzunluk-1);
        System.out.println("sonHarf = " + sonHarf);

        //2.yöntem
        System.out.println("sonHarf = " + cumle.charAt(  cumle.length()-1  )  );
    }
}
