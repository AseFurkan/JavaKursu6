package Gun36._05_Interface;

public class test implements IGoster,IYazdır{
    @Override
    public void goster() {
        System.out.println("gösterdi");

    }

    @Override
    public void yazdir(String msg) {
        System.out.println(msg+" yazdırıldı");

    }

    @Override
    public void yaz() {
        System.out.println("yazdırıldı");

    }

    @Override
    public int yazdirmaSayisiGoster() {
        int sayfaSayisi=5;  //metod çalıştı
        return sayfaSayisi;
    }
}
