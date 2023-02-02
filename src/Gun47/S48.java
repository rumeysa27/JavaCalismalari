package Gun47;

import java.util.ArrayList;
import java.util.List;

public class S48 {
    public static void main(String[] args) {
       List colors= new ArrayList();

        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");

        colors.remove(2);//yani 2.index (red) onu sil diyo
        colors.add(3,"cyan");//3.index'e (red'i sildiği için) yani son index'e yellowdan sonraki yere
        //ekliyor. red silinince 2.index otomatikmen yellow aldı 3.indexe de ekleyeceğimiz geldi
        //son sıraya denk gelen indexe eklenebilir, ama ondan daha büyük bir indexe eklenemez hata verir.
        System.out.println("colors = "+ colors);
    }
}
