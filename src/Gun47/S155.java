package Gun47;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Objects;

public class S155 {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<>();
        //Integer null değer alır int null değer almaz arraylist de zaten int almaz Integer alır

        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(1);//1.index yani (2)'yi siler
        points.remove(null);
        System.out.println("points = "+ points);

//        points.remove((Object)1);//bu da değer olarak 1i siler eğer girilen değeri bulamazsa hata verir
//        System.out.println("points = " +points);
//        points.remove(7);//7burada yok  olmayan indexi silme işleminde hata verir
//        points.remove((Object)7);//değer olarak siler, değeri bulamazsa hata vermez



    }
}
