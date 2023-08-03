package Gun14;

import java.util.Scanner;

public class _01_DoWhile_2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int sayi=0;

        do{ // bu döngü en az bir kez çalışır
            System.out.print("Sayi giriniz=");
            sayi=oku.nextInt();
            toplam=toplam+sayi;

        }while(sayi !=0); // şart kontrolü sonda

        System.out.println("toplam = " + toplam);
    }
}
/*
  Scanner read= new Scanner(System.in);
        int toplam=0;
        int sayi=0;
        do {
            System.out.println( "sayi giriniz = ");
             sayi=read.nextInt();
            toplam=toplam +sayi;

        }while(sayi!=0);
        System.out.println("toplam = "+toplam);

 */