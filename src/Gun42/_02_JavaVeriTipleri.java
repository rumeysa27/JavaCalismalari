package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {
        //ilkel tipler, primitive tipler: short,byte,long,float,double,boolean
        int sayi1=5;
        int sayi2=10;

        sayi1=sayi2;//sayi1= 10 eşitlesen bile değerler atanır kendi hücreleri yine ayrı ayrı kalır
        sayi1=34;
        sayi2=45;
        System.out.println("sayi1 = "+ sayi1);
        System.out.println("sayi2 = "+ sayi2);

        //Referans Tipler: classlar,diziler,arraylar,nesneler
        int[] dizi1={1,2,3,4};
        int[] dizi2={5,6};
        System.out.println("dizi1 = "+ Arrays.toString(dizi1));
        System.out.println("dizi2 = "+ Arrays.toString(dizi2));

        dizi1=dizi2;
        System.out.println("dizi1 = "+ Arrays.toString(dizi1));//5,6
        System.out.println("dizi2 = "+ Arrays.toString(dizi2));//5,6

        dizi1[0]=67;
        System.out.println("dizi1 = "+ Arrays.toString(dizi1));
        System.out.println("dizi2 = "+ Arrays.toString(dizi2));

        dizi2[0]=55;
        System.out.println("dizi1 = "+ Arrays.toString(dizi1));
        System.out.println("dizi2 = "+ Arrays.toString(dizi2));

        //Nesne tipler:NULL alabilen ilkel tip
        //String, Integer, Double, long
        String ad1="mehmet";
        String ad2="ismet";

        ad1=ad2;
        System.out.println("ad1= "+ ad1);
        System.out.println("ad2= "+ad2);

        ad1="Ali";
        System.out.println("ad1 = "+ad1);//ali
        System.out.println("ad2= "+ad2);//ismet










    }
}
