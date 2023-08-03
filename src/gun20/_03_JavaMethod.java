package gun20;

import Tools.Myfunc;

import java.util.Arrays;
import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemlmini bir metodda
        // yaptıktan sonra main de yazdırınız

        Scanner read = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz = ");
        int sayi1 = read.nextInt();

        System.out.print("2. Sayıyı giriniz = ");
        int sayi2 = read.nextInt();

        int enb=enBul(sayi1,sayi2);
        enb= Myfunc.enBul(sayi1,sayi2);//Myfunc
        System.out.println("enb = "+ enb );
        int rndSayi=Myfunc.rndTAmSayi(10);

    }
    public static  int enBul(int s1, int s2)
    { //metodun imzası
        int enb = 0;
        if(s1>s2)
            enb=s1;
        else
            enb=s2;
        return enb;

        //2. yöntem
       // if (s1>s2)
       //     return s1;
      //  else
       //     return s2;
        //2. yöntem
      //  return (s1>s2 ? s1 : s2 );
//return (s1>s2 ? s1 :s2);

    }


}
