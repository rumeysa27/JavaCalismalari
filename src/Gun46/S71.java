package Gun46;

public class S71 {
    public static void main(String[] args) {
        int[][] arr=new int[2][4];
        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};
        //2boyutlu dizilerin eleman sayısı diye incelediğimizde satır sayısı karşımıza çıkar
        System.out.println("arr.length="+arr.length);//satır sayısını verecek
        System.out.println("arr[0].length="+arr[0].length);//0.satırın eleman sayısı 4
        System.out.println("arr[1].length="+arr[1].length);//1.satırın eleman sayısı 2

        for (int[] a: arr){//a burada arr nın elemanları yani satırlarını temsil ediyor sırasıyla
            //arr.length satır sayısını a.length ise her satırın eleman sayısını temsil eder
            for (int i= 0; i<arr.length; i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();

        }
    }
}
