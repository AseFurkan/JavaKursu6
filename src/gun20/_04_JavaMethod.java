package gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        // bir fonksiyonda buldurup mainden yazdırınız
        // Örn: 5 girildiyse -> 1*2*3*4*5 i bulmalısınız
        Scanner read=new Scanner(System.in);

        System.out.print("bir sayı giriniz =");
        int sayi=read.nextInt();

        int carpim=faktoriyel(sayi); // dönen var , eşitleniyorsa
        System.out.println("carpim = " + carpim);
    }
    public static int faktoriyel (int sayi){
        int carpim=1;
        for (int i = 1; i <=sayi ; i++)
            carpim=carpim*i;

        return carpim;

    }

}
