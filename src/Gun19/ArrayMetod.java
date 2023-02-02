package Gun19;

import java.util.Arrays;

public class ArrayMetod {
    public static void main(String[] args) {//25 elemanlı diziyi random 70e kadar yazdır
        int[] dizi=new int[25];//25 elemanlı dizi
        for (int i=0; i<dizi.length; i++){
            dizi[i]=(int)(Math.random()*70);//70e kadar
        }
        System.out.println("sayılar:"+Arrays.toString(dizi) );
    }
}
