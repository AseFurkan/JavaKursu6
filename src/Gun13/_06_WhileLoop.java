package Gun13;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {
        // Girilen 6 sayıdan sadece pozitif olanlarının
        // toplamını bulunuz
        Scanner read=new Scanner(System.in);

        int toplam =0;
        int sayac=1;

        while (sayac<=6){
            System.out.print(sayac+". Sayıyı giriniz =");
            int sayi= read.nextInt();
            sayac++;
            if (sayi>0)
                toplam=toplam+sayi;
        }
        System.out.println("toplam = " + toplam);
        /*
        Scanner oku=new Scanner(System.in);

        int sayac=1;
        int toplam=0;
        while (sayac <= 6){

            System.out.print("sayi giriniz=");
            int sayi=oku.nextInt();
            if (sayi>0)
               toplam=toplam+sayi;

            sayac=sayac+1;
        }

        System.out.println("toplam = " + toplam);
*/
    }
}
