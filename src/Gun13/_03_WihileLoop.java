package Gun13;

import java.util.Scanner;

public class _03_WihileLoop {
    public static void main(String[] args) {
      //girilen 20 ya da 5 sayının toplamının sonucunu yazdırınız.
        Scanner oku=new Scanner(System.in);
        int sayac=1;
         int toplam=0;
        while (sayac<=5)
         {
             System.out.print(sayac+ ".Sayi giriniz=");
            int  sayi=oku.nextInt();
            toplam=toplam+sayi;

            sayac++; //sayac=sayac+1 in kısaltımı
         }


        System.out.println("toplam=" + toplam);




    }
}
