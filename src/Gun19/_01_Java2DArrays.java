package Gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo={
                {3, 4,55},
                {234,22,33}
        };//2satır 3 sutun

        System.out.println("satir uzunluğu= "+ tablo.length);//2 satır sayısı
        System.out.println("0.satirin sutun uzunluğu="+tablo[0].length);//3,sutun uzunluğu
        System.out.println("1.satirin sutun uzunluğu="+ tablo[1].length);//3,sutun uzunluğu

        for (int i=0; i < tablo.length; i++){
            //ilgili satırdaki sutun uzunluğu
            for (int j= 0; j < tablo[i].length; j++){
                System.out.print(tablo[i][j]+"\t");
                //sayı ne kadar uzun olsa da tek bir sayı olduğundan uzunlukta 1 olarak alıyoruz
            }
            System.out.println();
        }







    }
}
