package Gun14;

public class _02_forLoop {
    public static void main(String[] args) {
        // 1 den 5e kadar olan sayıları ekrana yazdırınız.

        int i=0; // i sayac demek
        while (i<=5)
        {
            System.out.println("w_i = "+ i);
            i++;
        }

        System.out.println();

        //for döngüsü, başı belli,sonu belli,artışı belli ise
        for (i=1; i<=5; i++) {
            System.out.println("f_i = "+ i);
        }
        //NOT:1- Başı belli, sonu belli,yani kaç adım döneceği belli ve artış miktarı belli ise bu FOR döngüsüdür.
        //2- Kaç kere döneceği belli değil ise (kullanıcı 0 değeri girene kadar) WHILE döngüsüdür.
        //3-While döngüsünde döngü kontrolü işlemden sonra ise DO-WHILE dongusudur.



    }
}
