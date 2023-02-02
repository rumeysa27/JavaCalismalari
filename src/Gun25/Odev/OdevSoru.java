package Gun25.Odev;

import java.util.ArrayList;
import java.util.Scanner;

public class OdevSoru {
    public static void main(String[] args) {
        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        ArrayList<calisan> ofis=new ArrayList<>();

        for (int i=0; i<2; i++){
            calisan bilgi=new calisan();

            System.out.print("Çalışan bordroNo="); bilgi.bordroNo=okuInt.nextInt();
            System.out.print("Çalışan tamAdi="); bilgi.tamAdi=okuStr.nextLine();
            System.out.print("Çalışan maasi="); bilgi.maasi=okuInt.nextInt();

            ofis.add(bilgi);
        }
        butunCalisanlar(ofis);
        maasOrtalaması(ofis);
        enFazlaVeEnAzMaasAlanlar(ofis);
    }
    public static void butunCalisanlar(ArrayList<calisan>ofis){
        for (calisan bilgi: ofis){
            System.out.println("Çalışan bordoNo:"+bilgi.bordroNo);
            System.out.println("Çalışan tamAdı:"+bilgi.tamAdi);
            System.out.println("Çalışan maaşı:"+ bilgi.maasi);
        }

    }
    public static void maasOrtalaması(ArrayList<calisan>ofis){
       int toplamMaas=0;
       for (calisan bilgi: ofis){
           toplamMaas+=bilgi.maasi;
       }
       int ortalama=toplamMaas/ofis.size();
        System.out.println("Maaş ortalaması= "+ ortalama);


    }
    public static void enFazlaVeEnAzMaasAlanlar(ArrayList<calisan>ofis){
        int minMaas=ofis.get(0).maasi;
        String minMaasAlanlar=ofis.get(0).tamAdi;

        int maxMaas=ofis.get(0).maasi;
        String maxMaasAlanlar=ofis.get(0).tamAdi;

        for (int i = 0; i < ofis.size(); i++) {
            if (maxMaas < ofis.get(i).maasi) {
                maxMaas = ofis.get(i).maasi;
                maxMaasAlanlar = ofis.get(i).tamAdi;
            }
            if (minMaas > ofis.get(i).maasi) {
                minMaas = ofis.get(i).maasi;
                minMaasAlanlar = ofis.get(i).tamAdi;
            }
        }

        System.out.println("En yüksek maaş alan çalışan ismi/maaşı:  " + maxMaasAlanlar+" "+maxMaas);


        System.out.println("En düşük maaş alan çalışan ismi/maaşı:  " + minMaasAlanlar+ " "+minMaas);

    }
}
class calisan{
    int bordroNo;
    String tamAdi;
    int maasi;
}
