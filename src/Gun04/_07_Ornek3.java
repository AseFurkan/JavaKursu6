package Gun04;

public class _07_Ornek3 {
    public static void main(String[] args) {
        // String olarak verilen 3 notun ("82","95","56") ortalamasını bulunuz.
        String yaziNot1="82";  // yazı hali mi rakam hali mi
        String yaziNot2="95";
        String yaziNot3="56";

        String toplam=yaziNot1+yaziNot2+yaziNot3;
        System.out.println("toplam = " + toplam);  //829556

        int rakamNot1= Integer.parseInt(yaziNot1);  // 82
        int rakamNot2= Integer.parseInt(yaziNot2);  // 95
        int rakamNot3= Integer.parseInt(yaziNot3);  // 56

        int toplamNot=rakamNot1+rakamNot2+rakamNot3;
        System.out.println("toplamNot = " + toplamNot);

        double ort=toplamNot/(double)3;
        System.out.println("ort = " + ort);

    }
}
