package Gun34._04_Protected.Paket2;

import Gun34._04_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan p2h=new P1Hayvan();
        p2h.ad="kopek";
        //p1h.yas default diğer paketten erişilemez
        //ph1.cinsi protected diğer paketten direkt erişilemedi
    }
}
