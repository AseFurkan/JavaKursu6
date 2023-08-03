package Gun15;

public class _06_JavaNestedLoop {
    public static void main(String[] args) {
        // 2 lerin çarpım tablosunu sormuştuk.
        // 2 x 1 =2
        // 2 x 2 =4
        // ....

        // 5(dahil) lere kadar halini yapınız
       for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <10 ; j++)
            {
                System.out.println(j+" X "+i+" = "+(i*j));

            }System.out.println();
        }
/*
       for(int kaclar=1; kaclar <=5 ; kaclar++) {

           for (int i = 1; i <= 10; i++)
               System.out.println(kaclar+" x " + i + " = " + (kaclar * i));

           System.out.println();
       }




 */
    }
}
