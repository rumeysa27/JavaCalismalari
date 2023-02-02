package Gun29._01_ClassErisimleri.Pakteİki;

import Gun29._01_ClassErisimleri.PaketBir.PublicErisim;

public class DigerPaketMain {
    public static void main(String[] args) {
        PublicErisim pe=new PublicErisim();
        //defaultErişim de=new DefaultErişim(); diğer paketlerden default belirtecli classa erişilemez.
        //yalnızca kendi paketindekiler erişebilir.
        //diğer paketlerden default belirteci class a erişilemez. yalnzca kendi paketindekiler erişebilir.
    }
}
