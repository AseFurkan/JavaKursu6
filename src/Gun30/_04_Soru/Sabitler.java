package Gun30._04_Soru;

public class Sabitler {
    final static int birGundekiSaatSayisi=24;
    final static int birSaatdekiDakikaSayisi=60;
    final static int birDakikadakiSaniyeSayisi=60;

public static int hesapla(int gun,int saat,int dak)
{

    int toplamSaniye=
            gun
                    *Sabitler.birGundekiSaatSayisi
                    *Sabitler.birSaatdekiDakikaSayisi
                    *Sabitler.birDakikadakiSaniyeSayisi
                    +
                    saat
                            *Sabitler.birSaatdekiDakikaSayisi
                            *Sabitler.birDakikadakiSaniyeSayisi
                    +
                    dak
                            *Sabitler.birDakikadakiSaniyeSayisi;
return toplamSaniye;
}


}
