package Gun44;

import java.util.ArrayList;

public class S01 {
    public static void main(String[] args) {//bu arkadaşı direkt yaptımm:))
        //Soru
        //************ buraya ne yazmalıyız ki aşağıda 10:20 versin diziyi
        // array[0]=10;
        //array[1]=20;
       // System.out.println(array[0]+":"+array[1]);

        int[] array=new int[2];//1.yöntem !![2]yani 0 ve 1 indexli iki eleman!!
        array[0]=10;
        array[1]=20;
        int[] array2;
        array2=new int[2];//2.yöntem

        int array3[]=new int[2];//3.yöntem bunu genelde çok kullanmadık ama bu yöntem de oluyor


        System.out.println(array[0]+":"+array[1]);


        ArrayList<String> list;//bun iki parça şeklinde de böyle yazabiliyoruz sorudan bağımsız
        list=new ArrayList<>();
    }
}
