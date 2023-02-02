package Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        //SETS   Hashset: hızlı bunun için kendine göre algoritmik sırada tutar
        //LinkedHashSet: EKLEME SIRASIna göre sıralı tutar.
        //TreeSet: her zaman içinde SIRALIşekilde tutar, kendinden sortlu

        //hızlı bunun için kendine göre algoritmik sırada tutar sen bana bırak diyor yani
        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs= "+hs);

        //ekleme sırasına göre sıralı tutar sen nasıl eklersen ona göre tutuyor
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs= "+lhs); //burada string olduğu için alfabeye göre dizdi

        //her zaman içinde SIRALI şekilde tutar kendinden sortlu alfabetik ya da sayıya göre sıralıyor
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts=" +ts);


    }
}
