package Gun11;

import java.util.Scanner;

public class _08_JavaMath {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz
        Scanner oku = new Scanner(System.in);
        System.out.print("a değeri =");
        int a= oku.nextInt();

        System.out.print("b değeri =");
        int b= oku.nextInt();

        System.out.print("c değeri =");
        int c= oku.nextInt();

        int enAB= Math.max(a,b);
        int enb=Math.max(enAB,c);
        System.out.println(enb);

        /*Scanner oku = new Scanner(System.in);
        System.out.print("a değeri =");
        int a= oku.nextInt();

        System.out.print("b değeri =");
        int b= oku.nextInt();

        System.out.print("c değeri =");
        int c= oku.nextInt();

        //a,b, -> enbAB    c,
        int enbABden= Math.max(a,b);
        int enb = Math.max(enbABden,c);
        System.out.println("enb = " + enb);

       //2.yöntem
        System.out.println(   Math.max( Math.max(a,b), c )   );


         */
    }
}
