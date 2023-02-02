package Gun08;

public class _03_Ozet {
    public static void main(String[] args) {
        int sayac=0; //0
        int toplam=0; //0

        sayac=sayac+1; // 1
        toplam=toplam+sayac;

        toplam=toplam+ ++sayac; //önce artış sonra işlem

        System.out.println("sayac = " + sayac);//0
        System.out.println("sayac = " + sayac); //1

        sayac++;
        sayac--;







    }
}
