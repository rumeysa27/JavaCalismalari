package Gun13;

public class  _02_WhileLoop {
    public static void main(String[] args) {
        //ekrana 5kez merhaba yazdırınız.

       int sayac=1;
        while (sayac<6) //iken yap: şartı yazıyoruz, dönme şartı
        {
            //her döndükçe yapılacaklar
            System.out.println(sayac+".merhaba");

            sayac=sayac+1; //2 3 4 5 //sayac++;
            //tekrarlanacak şeyleri süslü parantezin içine yaz bunda da süslü parantez zorunlu


        }
        System.out.println("program bitti");
    }
}
