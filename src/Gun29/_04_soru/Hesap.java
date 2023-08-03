package Gun29._04_soru;

public class Hesap {
    int yatan;
    int cekilen;
    int bakiye;

    public void paraYatir(int yatanPara)
    {
        this.yatan=this.yatan+yatanPara;
        this.bakiye=this.bakiye+yatanPara;
    }

    public void paraCek(int cekilenPara)
    {
        this.cekilen=this.cekilen+cekilenPara;
        this.bakiye=this.bakiye-cekilenPara;

    }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + this.yatan +
                ", cekilen=" + this.cekilen +
                ", bakiye=" + this.bakiye +
                '}';
    }
}
