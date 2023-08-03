package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        //Bir dikdörtgenin gerekli kenar(int) uzunluklarını kullanıcıdan
        //isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan =a*b

        Scanner oku=new Scanner(System.in);

        System.out.print("Uzun kenar=");
        int a= oku.nextInt();

        System.out.print("Kısa kenar=");
        int b= oku.nextInt();

        //1.Yöntem
        int cevre=a+b+a+b;
        int alan=a*b;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

        //2.Yöntem
        System.out.println("cevre = " + (a+b+a+b));
        System.out.println("alan = " + (a*b));
    }
}
