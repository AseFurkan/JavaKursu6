package Gun19;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        // biir sayı çiftmi tekmi yazdırınız

       //int sayi=55;
       //if (sayi%2==0)
       //    System.out.println("çift ");
       //else
         //   System.out.println("tek ");
        /***************************************/
        tekmiCiftmiYaz(22);
        tekmiCiftmiYaz(61);
/**********************************************/

okuTekmiCiftmiYaz();

    }
    public static void tekmiCiftmiYaz(int sayi)
    {
        if (sayi%2==0)
            System.out.println("m:çift ");
        else
            System.out.println("m:tek");
    }
    public static void okuTekmiCiftmiYaz()
    {
        Scanner read=new Scanner(System.in);
        System.out.print("sayi giriniz = ");
        int sayi = read.nextInt();

        tekmiCiftmiYaz(sayi);

      //  if (sayi%2==0)
       //     System.out.println("m:çift");
      //  else
        //    System.out.println("m:tek");


    }
}
