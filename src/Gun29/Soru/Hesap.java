package Gun29.Soru;

public class Hesap {
   private int toplamYatan=0;
  private   int toplamCekilen=0;
   private int bakiye=0;
//public eklersen her yerden erişiliyor
    void paraYatir(int yatanPara){
        toplamYatan+=yatanPara;
        bakiye+=yatanPara;
    }
    void  paraCek(int cekilenPara){
        toplamCekilen+=cekilenPara;
        bakiye+=cekilenPara;
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "\nyatan=" +toplamYatan +
                "\n, cekilen=" + toplamCekilen +
                "\n, bakiye=" + bakiye +
                '}';
    }
}
