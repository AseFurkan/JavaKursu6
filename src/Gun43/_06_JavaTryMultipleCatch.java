package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _06_JavaTryMultipleCatch {
    public static void main(String[] args) {

        System.out.println(" Program BaŞladı");

        try {
            Scanner oku = new Scanner(System.in);

            System.out.print("Sayi1= ");
            int sayi1 = oku.nextInt();

            System.out.print("Sayi2= ");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);
        }
            //           String kelime="";  //Genel hatay düşmesi için yapıldı
//           kelime.charAt(3);

        catch (ArithmeticException ex)
        {
            System.out.println("sıfıra bölme hatası oluştu ");
        }

        catch (InputMismatchException ex)
        {
            System.out.println("Lütfen sayı giriniz ");
        }
              catch (Exception ex)
              {
                  System.out.println("beklenmeyen hata ");
        }

        System.out.println("Proğram Bitti");
    }
}
