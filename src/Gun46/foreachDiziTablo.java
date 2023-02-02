package Gun46;

public class foreachDiziTablo {
    public static void main(String[] args) {
        int[] dizi=new int[]{1,2,3,44,6};

        int[] dizi1={1,2,3,4,5};

        int[] dizi2=new int[3];
        dizi2[0]=5;
        dizi2[1]=5;
        dizi2[2]=5;
        System.out.println("dizi1.length = "+ dizi1.length);//dizinin eleman sayısı

        //for i index sırasıyla gittiği için SIRA GARANTİ
        for (int i=0; i<dizi1.length; i++){
            System.out.println(dizi1[i]+" ");
        }
        System.out.println("**********");
        //foreach olduğu için sıra garanti değil normalde sıradan verir
        for (int eleman : dizi1){//içindeki elemanları teker teker alarak eleman isimli değişkene
            System.out.println(eleman+" ");
        }

        //**2 boyutlu diziler yani tablolar
        int[][] tablo1=new int[2][3];
        tablo1[0][0]=4; tablo1[0][1]=14; tablo1[0][2]=22;//1. satır
        tablo1[1][0]=24; tablo1[1][1]=33; tablo1[1][2]=12;//2.satır

        int [][]tablo2=new int[][]{//elemanlar verildiğinde zaten sayı elemanlardan geldiği için boyut sayıları verilmiyor

                {1,3,4},
                {56,7,8}
        };

        int[][] tablo6={//new int[][]vermeden de ilk tanımlama anında elemanları verebiliriz
                {1,3,4},
                {56,7,8}
        };
        int[][] tablo3= new int[2][3];
        tablo3[0]=new int[]{2,3,4,5,6};//her bir satırı yeniden tanımlayabiliriz
        tablo3[1]=new  int[]{2,3};

        int tablo4[][]= new int[2][3];//köşeli parantezler değişkenin adında da olabilir
        // tablo4 : satır sayısı 2 , her satır kendi uzunluğu var, 1.satırın uzunluğu 3, 2.satırın uzunluğu 3
        // tablo3 : satır sayısı 2, 0.satırın uzunluğu 5, 1.satırın uzunluğu 2

        System.out.println("tablo3.length = " + tablo3.length); // tablo3 satır sayısını verecek 2, tablonun elemanları satırlardan oluşur
        System.out.println("tablo3[0].length = " + tablo3[0].length); // 0.satırın length 5
        System.out.println("tablo3[1].length = " + tablo3[1].length); // 1.satırın length 2

        for (int i = 0; i < tablo3.length; i++) { // i:  0,1

            for (int j = 0; j < tablo3[i].length; j++) { // önce tablo[0] 5, sonra tablo[1] 2
                System.out.print(tablo3[i][j]+" "); // 0.satır için 00, 01 , 02, 03, 04
                // 1.satır için 10, 11
            }
            System.out.println();
    }
        System.out.println("******************");
        for (int[] satir : tablo3)//tablo3 elemanları satırlardan oluşuyor onlarda her biri tek boyutlu dizi
        {
            for (int eleman : satir){
                System.out.println(eleman+ " ");
            }
            System.out.println();
        }
        System.out.println("******************");

}
}