package Gun24;

import java.util.*;

public class _04_JavaMap {
    public static void main(String[] args) {
        Map<Integer, String> hm=new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11,"kuş");
        hm.put(4,"kurt");
        System.out.println("hm= "+ hm);//hızlı çalışmak için kendine göre sıralıyor HasMap

        Map<Integer,String> lhm=new LinkedHashMap<>();//Map lerden Linkedhasmap
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11,"kuş");
        lhm.put(4,"kurt");
        System.out.println("lhm= "+ lhm);//eklendiği sıraya göre sıralanıyor

        Map<Integer, String> tm=new TreeMap<>(); //MAPlerden TreeMap
       tm.put(9,"tilki");
       tm.put(2,"kedi");
       tm.put(30,"köpek");
       tm.put(11,"kuş");
       tm.put(4,"kurt");
        System.out.println("tm= "+ tm);//her zaman sıralı KEYe göre kendinden sortlu
        // yani sayı sırasına göre küçükten büyüğe içinde ilk integer yazılı olduğu için ona göre aldı
        // string önce yazsaydı ona da göre alırdı ilk ne yazılıysa onu baz alıyor
    }
}
