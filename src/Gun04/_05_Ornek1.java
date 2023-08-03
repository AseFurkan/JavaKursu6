package Gun04;

public class _05_Ornek1 {
    public static void main(String[] args) {

//       10/3   -> herzaman tam sayı kısmını veriyor sonuc olarak
//       3
//       3.33333

        int sayi1=10;
        int sayi2=3;

        int tamSonuc= sayi1/sayi2; // int/int -> int
        System.out.println("tamSonuc = " + tamSonuc); // 3 çıkacak

        /* ***********************************************  */

        int s1=10;
        int s2=3;

        double doubleSonuc= s1/(double)s2;  // int/double -> double sonuc
        System.out.println("doubleSonuc = " + doubleSonuc);
    }
}
