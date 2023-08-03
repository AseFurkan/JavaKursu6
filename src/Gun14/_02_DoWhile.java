package Gun14;

import java.util.Scanner;

public class _02_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("ifade giriniz=");
        String girilen=oku.next();

        while( !girilen.equalsIgnoreCase("x") )
        {
            System.out.println("program çalışıyor");

            System.out.print("ifade giriniz=");
            girilen=oku.next();
        }

        System.out.println("program bitti");


    }
}
