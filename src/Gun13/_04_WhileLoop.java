package Gun13;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // Ekrana 5 kez merhaba yazdırınız.

        int sayac =1;

        while (sayac<=5){
            System.out.println("merhaba"+sayac);
            sayac++;
        }
        System.out.println("program bitti ");

/*
        int sayac=1;

        while(sayac <= 5) // iken yap: şartı yazıyoruz, dönme şartını
        {
            //tekrarlanacak adımlar buraya yazılıyor
            System.out.println(sayac+".Merhaba");
            sayac=sayac+1;   // 2,3,4,5  sayac++, ++sayac
        }

        System.out.println("program bitti");

 */
    }
}
