package Gun17;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan
        // Random atayarak doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1,
        // çift olanlara 0 atayınız  yazdırınız.

        int[] dizi=new int[50]; //50 elemanlı bir dizi tanımlayınız

        for (int i = 0; i < dizi.length; i++)  // 10 a kadar sayılarla Rnd doldur
             dizi[i] = (int)(Math.random()*10);


        for (int i = 0; i < dizi.length; i++) // dizi içeriğini görme
            System.out.println("dizi önce= "+dizi[i]);


        for (int i = 0; i < dizi.length; i++){ // çift olanlara 0, tek olanlara 1 ata

           if (dizi[i]%2 == 0)  // çiftse
               dizi[i]=0;
           else
               dizi[i]=1;

        }

        for (int i = 0; i < dizi.length; i++) // 1 ve 0 atama işleminden sonra dizi yi yazdır
            System.out.println("dizi sonra= "+dizi[i]);

    }
}
