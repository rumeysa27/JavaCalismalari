package Gun30._02_FinalVariables.Ornek2;

public class Sabitler {
    static final  int birGundekiSaatSayisi=24; //BURADA HEM STATİC HEM FİNAL YAPMAMIZIN NEDENİ BİRTANE DEĞİŞEMEZ
    //BU DEĞERLER Bİ NESNEYE AİT DEĞİL GENEL DEĞERLER yani o  yüzden he değiştirilemez hem birtane olumuş olduğu
    //için static ve private ikisini bir kullandık
    static final  int birSaaattekiDakikaSayisi=60;
    static final  int birDakikadakiSaniyeSayisi=60;

    public static int hesapla(int gun, int saat, int dakika){
        int toplamSaniye=
                gun
                        *birGundekiSaatSayisi
                        *birSaaattekiDakikaSayisi
                        *birDakikadakiSaniyeSayisi
                        +
                        saat
                                *birSaaattekiDakikaSayisi
                                *birDakikadakiSaniyeSayisi
                        +dakika
                        *birDakikadakiSaniyeSayisi;
        return toplamSaniye;
    }
}
