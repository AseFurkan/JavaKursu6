package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrNot1=98;
        byte ogrNot2=97;
        byte ogrNot3=99;
        byte ogrNot4=100;

        //int          // byte
        int toplamNot= ogrNot1+ogrNot2+ogrNot3+ogrNot4;
        System.out.println("toplamNot = " + toplamNot);

        byte toplam2 = (byte)toplamNot;  // 394 ü byte alana atıyorum
        System.out.println("toplam2 = " + toplam2);
        // int -> byte atınca dur bakalım dedi   (DARALTMA)
        // büyük hafıza ayrılmış bir alanı, küçük hafıza ayrılmış alana atma
        // işlemi var. veri kaybı ihtimali var
    }
}
