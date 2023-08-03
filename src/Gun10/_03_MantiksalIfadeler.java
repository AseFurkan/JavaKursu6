package Gun10;

import java.util.Scanner;

public class _03_MantiksalIfadeler {
    public static void main(String[] args) {
        //mantıksal ifadeler Logic statement
        // && ve işareti (shitf 6) -> and
        // || veya işareti  (altgr <)  -> or

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        int kalan= sayi%2;

        if (kalan == 1 || kalan == -1)  // 1 veya -1 ken
            System.out.println("tek");
        else  // 0
            System.out.println("çift");





    }
}
