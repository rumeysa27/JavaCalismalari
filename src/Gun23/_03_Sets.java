package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");
        System.out.println("renkler= "+renkler);

        //ekrana tek tek nasıl yazdırırım
        for (String eleman: renkler){ //sıra garanti değil
            System.out.println("eleman= "+eleman);
        }

        //foreach ile ilgili örnek olsun diye yazdık bana sıralı elemanlar lazım değilse bunu kullanırım
        int[] dizi={34,5,6,7,8,89,899,77};
        for (int sayi:dizi){
            System.out.println("sayi= "+sayi);
        }

        //set in kendi sırası nasıl ise onun aynısını verir
        Iterator gosterge= renkler.iterator();
        while (gosterge.hasNext()){ //sıradaki eleman var ise duruyor while döngüsü
            System.out.println("gösterdiği eleman= "+gosterge.next()); //while sırasını bilmediğimiz için kullandık
            //next göstergenin gösterdiği elemanı temsil eder
        }
    }
}
