package Gun13;

public class _07_WhileLoop {
    public static void main(String[] args) {
        // 1 den 100 e kadar olan sayıların toplamını bulunuz


        int toplam =0;
        int sayac=1;
        while (sayac<=100){
            toplam=toplam+sayac;
            sayac++;
        }

        System.out.println("toplam = " + toplam);
/*

        int sayac=1;
        int toplam=0;
        while(sayac<=100)
        {
            toplam=toplam+sayac;

            sayac=sayac+1;
        }

        System.out.println("toplam = " + toplam);




 */
    }
}
