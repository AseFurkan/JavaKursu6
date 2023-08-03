package Gun29._02_PrivadeErisim;

public class Calisan {
    int id; // default
    String name; //default
    String surname; //default
    private String password; // private
public void sifreAta(String sifre){
    if (sifre.length()<8)
        System.out.println("zayıf şifre");
    else {
        this.password=sifre;
        System.out.println("şifre başarı ile oluşturuldu");
    }
}
public  void sifreGoster()
{
    System.out.println("*****"+this.password.substring(4));
}
}
