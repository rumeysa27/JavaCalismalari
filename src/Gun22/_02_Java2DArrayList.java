package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=5; //tek bir rakam tutabilen bir değişken
        int[] dizi=new int[20]; //20adet sayı saklayabilen bir değişken,uzunluğu sabit
        int[][] tablo=new int[20][2];//20*2lik sayı saklayabilen değişken,sabit uzunluğu
        // inte iki tane[]bundan tanımlamamız lazım tablo dediği için

        ArrayList<Integer> liste=new ArrayList<>();//istenildiği kadar sayı eklenebilen, uzunluğu değişken

        //bir sınıf bu sınıf da 20 kişi var ve bunların 3dersi olsun.
        // öğrencilerin bu 3 derse ait notlarını nasıl bir değişkende saklayabilirim
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


        //ArrayList'in ArrayListi'i nasıl yapılır
        ArrayList<  ArrayList<Integer>  >notlarListesi=new ArrayList<>();//listlerin listesi
        notlarListesi.add(matNotlari);
        System.out.println("matNotlari = " + matNotlari);

        notlarListesi.add(fizNotlari);
        System.out.println("fizNotlari = " + fizNotlari);


        notlarListesi.add(kimNotlari);
        System.out.println("kimNotlari = " + kimNotlari);

        notlarListesi.get(0);//matNotlari
        int matBirNot=notlarListesi.get(0).get(0);//mat notlarının ilkini aldık burada index 0dan başladığı için 0yazdık
        System.out.println("matBirNot = " + matBirNot);

        System.out.println("notlarListesi.get(0)= "+notlarListesi.get(0));//mat notları
        System.out.println("notlarListesi.get(1)= "+notlarListesi.get(1));//fizik notları
        System.out.println("notlarListesi.get(2)= "+notlarListesi.get(2));//kimya notları

        //yukarıdakinin yerine bir for döngüsü nasıl kullanırız
        for (int i=0; i<notlarListesi.size();i++){//0,1,2 size Arraysta uzunluğu alır
            System.out.println("notlarListesi.get("+i+")="+notlarListesi.get(i));
        }
        /***************satır sütun yazdırma*/
        for (int i=0; i<notlarListesi.size();i++){//i satırları j sütunları
            for (int j=0; j<notlarListesi.get(i).size();j++){ //notlar[i].length
                System.out.print(notlarListesi.get(i).get(j)+"\t");//notlar[i][j]
            }
            System.out.println();
        }



    }
}
