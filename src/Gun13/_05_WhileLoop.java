package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        //Girilen  5 tam sayının toplamının sonucunu yazdırınız
        Scanner read =new Scanner(System.in);
        int toplam=0;
        int sayac=1;
        while (sayac<=5){
            System.out.print(sayac+". Sayıyı giriniz ");
            int sayi= read.nextInt();
            sayac++;
            toplam=toplam+sayi;
        }
        System.out.println("toplam = "+ toplam);
        /*

        Scanner oku=new Scanner(System.in);

        int sayac=1;
        int toplam=0;
        while(sayac<=5){

            System.out.print(sayac+".sayi giriniz=");
            int sayi=oku.nextInt();
            toplam=toplam+sayi;

            sayac++; // sayac=sayac+1;   ++sayac
        }

        System.out.println("toplam = " + toplam);



         */
    }
}
