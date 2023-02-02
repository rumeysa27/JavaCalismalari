package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        //Set->HashSet ,LinkedHashSet ,TreeSet
        // Map-> HashMap ,LinkedHashMap,TreeMap
        // Map-> Anahtar+Set->Anahtarlı Set
        // anahtarın tipi Integer,değerinin tipi String olsun


        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1001, "rümeysa bakır");
        hm.put(1002, "nursel bakır");
        hm.put(2001, "selim dündar");
        hm.put(5001, "yusuf çekiç");
        hm.put(1002, "tomris uyar");

        System.out.println("hm= "+hm);
        System.out.println("hm.get(2001)="+hm.get(2001));
        System.out.println("hm.get(5001)= "+hm.get(5001));

        System.out.println("hm.containsKey(2001)= "+ hm.containsKey(2001));
        System.out.println("hm.containsKey(12)= " +hm.containsKey(12));

        System.out.println("hm.keySet()= "+ hm.keySet());//sayıları aldı key de indexi ben veriyorum set de tekrarlı ifadeye yer yok.
        System.out.println("hm.values()= "+ hm.values()); //isimleri aldı

        hm.remove(5001);
        System.out.println("hm= "+ hm);

        System.out.println("hm.size()= "+hm.size());

        hm.clear();
        System.out.println("hm="+ hm);
    }
}
