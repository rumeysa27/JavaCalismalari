package Gun21;

import java.util.ArrayList;

public class _01_ArraysList {
    public static void main(String[] args) {
        //dizi, array : boyut sayısı belli, sonradan değiştirelemez
        int[] dizi=new int[5]; //Array 5 elemanlı boyutu sonradan değiştirilemiyor

        //boyutu dinamik olsun, eleman ekledikçe uzsın, sildikçe kısalsın
        //ArrayList:boyutunu başta vermene bile gerek yok boyutu başlanğıçta 0 alır 1den değil
        //eleman ekledikçe artar, sildikçe kısalır.

        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler= " + isimler);

        isimler.add("ayşe"); //uzunluk1 //buradaki add en sona ekle demek
        isimler.add("yusuf");//uzunluk2
        isimler.add("sefa");//uzunluk3
        isimler.add("aden");//uzunluk4

        System.out.println("isimler= "+ isimler);
        System.out.println("isimler= "+ isimler.size()); //size lenght gibi uzunluğu veriyor

        isimler.add(1,"fatih");//verilen indexe ekliyor, diğerleri 1 kayıyor sona doğru
        System.out.println("isimler= "+ isimler);

        isimler.set(1,"eymen");//verilen indexdeki elemanı değiştirir 1deki fatih yerine eymeni aldı değiştir set yazınca
        System.out.println("isimler= "+ isimler);

       boolean varMi=isimler.contains("berra");//var mi
        System.out.println("varMi= "+ varMi);//true

        isimler.remove("berra");//değere göre siler
        System.out.println("isimler= "+ isimler);

        isimler.remove(1);//rakam verildiğinde index kabul ediyor ve ona göre siliyor
        System.out.println("isimler= "+ isimler);

        int indexOfYusuf=isimler.indexOf("yusuf");
        System.out.println("indexOfYusuf= "+ indexOfYusuf);

        String ilkEleman=isimler.get(0); //verilen indexteki değeri verir
        System.out.println("ilkEleman= "+ ilkEleman);

        isimler.clear();//her şeyi temizliyor.
        System.out.println("isimler= "+ isimler);







    }
}
