package Gun15;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {
        // 2 lerin çarpım tablosunu sormuştuk.
        // 2 x 1 =2
        // 2 x 2 =4
        // ....

        // 5 lere kadar halini yapınız

        for (int j=1; j<=5;j++){ //j de sayac manasında

        for (int i=1;i<10;i++){ //İ BURADA SAYI MANASINDA
            System.out.println(j+ "x"+ i + "=" +(j * i));

        }

        System.out.println();

        }

    }
}
