package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizNotlari=new ArrayList<>();
        ArrayList<Integer> kimNotlari=new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        ArrayList<  ArrayList<Integer>  >notlarListesi=new ArrayList<>();//listlerin listesi
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 40 50 60
        // Fizik : 30 40
        // Kimya : 70 80 90 100

        ArrayList<String> dersler=new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i=0; i<notlarListesi.size();i++){//her bir derslerin tüm notları
            System.out.print(dersler.get(i)+" : ");

            for (int j=0; j<notlarListesi.get(i).size(); j++){//tek tek notlar
                System.out.print(notlarListesi.get(i).get(j)+"\t");
            }
            System.out.println();
        }
        //soru2: //kullanıcıdan istediği bir dersin nosunu alarak(0-6Mat, 1-Fiz, 2-Kim)
        //sadece istediği derse ait notları bir metodda yazdırınız.
        System.out.println("*****************************");
        Scanner oku=new Scanner(System.in);
        System.out.println("Ders No(0-Mat, 1-Fizik, 2-Kim)=");
        int dersNo=oku.nextInt();

        dersNotlariniYazdir(notlarListesi,dersNo);

        //soru3:Yukarıda verilen derse ait not artalamasını ve geçen sayısını bir metoda yazdırınız
        dersOrtVeGecenMikBul(notlarListesi, dersNo);
    }
    public static void dersNotlariniYazdir(ArrayList<ArrayList<Integer>  >notlarListesi, int dersNo){
        for (int i=0; i<notlarListesi.get(dersNo).size();i++){
            System.out.print(notlarListesi.get(dersNo).get(i)+"\t");
        }
    }
    public static void dersOrtVeGecenMikBul(ArrayList<ArrayList<Integer>  >notlarListesi, int dersNo){
        int toplam=0;
        for (int i=0;i<notlarListesi.get(dersNo).size();i++){
            toplam+=notlarListesi.get(dersNo).get(i);
        }
        int ort=toplam/notlarListesi.get(dersNo).size();

        int gecenMik=0;
        for (int i=0; i<notlarListesi.get(dersNo).size();i++){
            if (notlarListesi.get(dersNo).get(i)>=ort)
                gecenMik++;
        }
        System.out.println("ort= "+ort);
        System.out.println("gecenMik= "+gecenMik);
    }
}
