package Gun31._04_EnumSoru;

import java.util.ArrayList;
import java.util.Scanner;
public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large,4-Göster
    // seçeneklerini bir menü şeklinde vererek,verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Göster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        ArrayList<Pizza> siparisler=new ArrayList<>();

        int secim=0;
        do{
          menu();  //menu
            //scanner seçimi al
            //secilen pizza ArrayListe ekle
            switch (secim){
                case 1://small
                    Pizza sp=new Pizza(PizzaSize.SMALL);
                    siparisler.add(sp);
                    break;
                case 2://medium
                    Pizza mp=new Pizza(PizzaSize.MEDIUM);
                    siparisler.add(mp);
                    break;
                case 3://large
                    Pizza lp=new Pizza(PizzaSize.LARGE);
                    siparisler.add(lp);
                    break;
                case 4: siparisYazdir(siparisler);
                    //eğer 4ü seçerse ArrayLisi bir metoda gönder
                    //orada hangi pizzadan kaç sipariş verdiğini göster
                    break;
            }

        }while (secim<=4);

    }//static metod içindeki her şey static olmalı içinde  açtığımız diğer metodlar da..
    public static void menu(){
        System.out.println("*********Pizza Menü*********");
        System.out.println("1- Small");
        System.out.println("2- Medium");
        System.out.println("3- Large");
        System.out.println("4- İşleme Al-Sipariş Göster");
        System.out.println("5- Çıkış");
        System.out.println("Seçiminiz:");
    }
    public static void siparisYazdir(ArrayList<Pizza> siparisler){
        int s=0, m=0, l=0;

        for (Pizza p:siparisler){

            if (p.size==PizzaSize.SMALL)s++;
            else
                if (p.size== PizzaSize.MEDIUM)m++;
                else
                    if (p.size==PizzaSize.LARGE)l++;
        }
        System.out.println("**** SİPARİŞLERİNİZ ****");
        System.out.println("Small Pizza Count = "+s);
        System.out.println("Medium Pizza Count = "+m);
        System.out.println("Large Pizza Count = "+l);
    }
}
