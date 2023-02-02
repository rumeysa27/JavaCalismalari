package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo={
                //5satır: 0,1,2,3,4
                {4,55},//0.satır
                {45,6,77},//1.satır
                {4,2,999,45,56,66},//2.satır
                {42,12,9},//3.satır
                {4}//4.satır
        };
        System.out.println("satir miktarı="+tablo.length);
        System.out.println("0.satirdaki sutun sayısı="+tablo[0].length);
        System.out.println("1.satirdaki sutun sayısı="+tablo[1].length);
        System.out.println("2.satirdaki sutun sayısı="+tablo[2].length);
        System.out.println("3.satirdaki sutun sayısı="+tablo[3].length);
        System.out.println("4.satırdaki sutun sayısı="+tablo[4].length);

        //yazdırma bölümü
        for (int i=0; i<tablo.length;i++){

            for (int j=0; j<tablo[i].length;j++){
                System.out.print(tablo[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
