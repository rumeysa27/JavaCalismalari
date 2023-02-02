package Gun45;

public class S114 {
    public static void main(String[] args) {

        int numbers[];
        numbers=new int[2];
        numbers[0]=10;
        numbers[1]=20;

        numbers=new int[4];//burada new diyince yukarıdaki int otamatikmen sıfırlanıyor
        //burada tekrar numbersi yeniledik //stringin defaultu 0 olur
        numbers[2]=30;
        numbers[3]=40;
        for (int x: numbers){
            System.out.print(" "+ x);
        }
    }
}
