package Gun08;

public class _02_JavaAritmeticOperators {
    public static void main(String[] args) {
        int sayac=0;

        sayac=sayac+1; //sayacın değerini 1tane artırıyor:1
        sayac++; //sayacın değerini 1 tane artırır:2
        ++sayac; //sayacın değerini  1 tane artırıyor:3

        sayac=sayac-1; //sayacın değerini 1 tane azaltır:2
        sayac--; //sayacın değerini 1tane azaltır:1
        --sayac; // sayacın değerini 1 tane azaltır:0

        System.out.println("sayac = " + sayac);

        /*************************************/
        int toplam= 5+ sayac; // 5olur
        System.out.println("toplam= " + toplam); //5
        System.out.println("sayac= " + sayac); //0



        toplam = 5 + sayac++; //toplam = 5+sayac sonra sayac=sayac+1 toplam=5 ve sayac=1.
        System.out.println("toplam= " +toplam);//5
        System.out.println("sayac= " + sayac);//1

        toplam = 5+ ++sayac; //sayac=sayac+1 sonra toplam=5+sayac 7 olur
        //özet: ++'lar sağda ise önce işlem sonra artış
        //++'lar solda ise önce artış sonra işlem.
        System.out.println("toplam= " + toplam); //7
        System.out.println("sayac= " + sayac);//2






    }
}
