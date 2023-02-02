package Gun37._01_Soru;

import java.util.ArrayList;

public class ZooPark {
    public static void main(String[] args) {
        Shark kb=new Shark("kalamar","yüzer");
        Swallow kirlangic= new Swallow("Böcek ile beslenir","açık alanlarda uçarlar");
        Cat kedi= new Cat("Süt ile beslenir");
        Duck ordek= new Duck("Et ve ot ile beslenir","gökyüzünde uçar","göletlerde yüzer");

       // ordek.sailing(); aşağıya getclas ve simpleName ekleyince buraya gerek kalmadı oradan çağırmş olduk


        ArrayList<Animals> hayvanlar= new ArrayList<>();
        hayvanlar.add(kb);
        hayvanlar.add(kirlangic);
        hayvanlar.add(kedi);
        hayvanlar.add(ordek);

        for (Animals h: hayvanlar){
           System.out.println(h.getClass().getSimpleName());


            if (h instanceof Shark){
                System.out.println(((Shark)h).food());
                System.out.println(((Shark)h).sailing());
            } else
                if (h instanceof Swallow){
                    System.out.println(((Swallow)h).flying());
                    System.out.println(((Swallow)h).food());
                }else
                    if (h instanceof Cat){
                        System.out.println(((Cat)h).food());
                    }else
                        if (h instanceof Duck){
                            System.out.println(((Duck)h).flying());
                            System.out.println(((Duck)h).food());
                            System.out.println(((Duck)h).sailing());
                        }
        }
    }
}
