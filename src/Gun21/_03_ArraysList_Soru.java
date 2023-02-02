package Gun21;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArraysList_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        AbstractList<Integer> notlar=new ArrayList<>();
        int toplam=0;
        String devamMi;
        do{
            //notu girecek
            System.out.println("Not=");
            int not= okuInt.nextInt();
            //notları arrayliste at
            notlar.add(not);
            //girilen notları topla
            toplam=toplam+not;
          //devam etmek istiyor musunuz (E/H)
            System.out.print("devam etmek istiyor musunuz E/H:");
            devamMi=okuStr.next();
        }while(devamMi.equalsIgnoreCase("E"));

        //ortalamayı bul
        int ort=toplam/notlar.size();
        System.out.println("ort = " + ort);

        //GEÇEN SAYISINI BUL;
        int gecenSAyisi=0;
        for (int i=0; i<notlar.size(); i++){
            if (notlar.get(i)>ort)
                gecenSAyisi++;
        }
        System.out.println("gecenSayisi="+ gecenSAyisi);
    }
}
