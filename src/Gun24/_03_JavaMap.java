package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        //bir kartvizit uygulamasını 2 kişi için yapınız
        HashMap<String,String> rKartVizit=new HashMap<>();
        rKartVizit.put("isim", "Rümeysa Bakır");
        rKartVizit.put("email", "rüm@gmail.com");
        rKartVizit.put("adres", "Şahinbey/GaziAntep");
        rKartVizit.put("telefon","05516460139");

        System.out.println("rKartVizit.get(isim)="+ rKartVizit.get("isim"));
        System.out.println("rKartVizit.get(tel)=" + rKartVizit.get("telefon"));

        HashMap<String,String> aKartVizit=new HashMap<>();
        aKartVizit.put("isim", "Ayşe Dündar");
        aKartVizit.put("email", "ayse@gmail.com");
        aKartVizit.put("adres","Karaköprü/Ş.Urfa");
        aKartVizit.put("telefon","05443287076");

        HashMap<String, HashMap<String,String> > kartvizitler=new HashMap<>();

        kartvizitler.put("Rümeysa",rKartVizit);
        kartvizitler.put("ayse", aKartVizit);

        System.out.println("kartvizitler.get(Rümeysa)= "+ kartvizitler.get("Rümeysa"));
        System.out.println("kartvizitler.get(ayse)= "+ kartvizitler.get("ayse"));

        System.out.println("ayşe'nin adresi: "+ kartvizitler.get("ayse").get("adres"));
        System.out.println("Rümeysa'nın adresi: " + kartvizitler.get("Rümeysa").get("adres"));


        //sadece emailler
        for (Map.Entry<String, HashMap<String,String>> kv: kartvizitler.entrySet()){
            System.out.println("emailler: "+ kv.getValue().get("email"));
        }




    }
}
