package Gun43;

import java.util.Scanner;

public class _08_ThrowExample_2 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("yeni şifre oluşturma ");

        System.out.print("yeni şifre ");
        String newPassword= oku.nextLine();

        try {
            if (newPassword.length()<8)
                throw new Exception("Şifre en az 8 karakter olmalı"); // suni hata
            if (newPassword.length()>15)
                throw new Exception("Şifre en fazla 15 karakter olmalı");

        }catch (Exception ex){
            //hatalar bir yere toplanıp, hepsi için yapılması gereken işlemler
            // birarada burada yapılabilir. mesala log tutma gibi.
            System.out.println("Lütfen Dikkat");
            System.out.println(ex.getMessage());
            // hangi ip bağlandı kaydedersin
            // yapılacak ortak işler
        }
    }
}
