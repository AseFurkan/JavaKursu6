package Gun08;

public class _05_JavaAritmeticOperators {
    public static void main(String[] args) {
        int sayac=0;

        sayac=sayac+1;  // sayacın değerini 1 tane artırıyor: 1
        sayac++ ;       // sayacın değerini 1 tane artırıyor: 2
        ++sayac ;       // sayacın değerini 1 tane artırıyor: 3

        sayac=sayac-1;  // sayacın değeriniz 1 azaltır      : 2
        sayac-- ;       // sayacın değeriniz 1 azaltır      : 1
        --sayac ;       // sayacın değeriniz 1 azaltır      : 0

        System.out.println("sayac = " + sayac);

        /*****************************/
        int toplam=0, sayi=0;

        // toplama işlemden önce : toplam=0, sayi=0
        toplam= 5 + sayi ;
        // toplama işlemden sonra : toplam=5, sayi=0;

        /******************************/
        toplam=0; sayi=0;

        // toplama işlemden önce : toplam=0, sayi=0
        toplam = 5 + sayi++;    // önce  toplam = 5+sayi;    sonra   sayi++;
        // toplama işlemden sonra: toplam= 5, sayi=1

        /*************************************/
        toplam=0; sayi=0;

        // toplama işlemden önce : toplam=0, sayi=1
        toplam =  5 +  ++sayi;   //önce   ++sayi;    sonra   toplam= 5 + sayi;
        // işlemden sonra : toplam= 6, sayi=1




        // Özet:  ++ lar sağda ise önce işlem sonra artış
        //        ++ lar solda ise önce artış sonra işlem.

    }
}
