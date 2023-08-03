package Gun15;

import java.util.Scanner;

public class _02_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // bolum 2: carpimin degeri 10000 ü geçtiğinde işlem sonlansın.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sinir=oku.nextInt();
        int carpim=1;

        for (int i = 1; i < sinir; i++) {
            carpim=carpim*i;
            System.out.println(carpim);
            if (carpim>10000){
                System.out.println("geçti");
                break;}

        }
/*

        int carpim=1;

        for (int i = 1; i <= sinir; i++) {
            System.out.print("carpim="+carpim+"*"+i);

            carpim=carpim*i;

            System.out.println("-> "+carpim);

            if (carpim > 10000) {
                System.out.println("break çalıştı");
                break;

 */
            }
        }





