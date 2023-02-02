package Gun46;

public class S17 {
    public static void main(String[] args) {
        //**tek boyutlularda yöntem aynı ilk oluşturma anında{}değer ataması yapılabilir
        //**sonrasında {}
        int[] [] arr=new int[2][4];//satır sayısı 2 sütun sayısı 4 ama aşağıda yeniden boyutlanmş
        //ikinci boyut yani sütunun (4)bir önemi yok aşağıda yeniden boyutlandırılıyor

        arr[0]=new int[]{1,3,5,7};//0.satır
        arr[1]= new int[]{1,3};//1.satır

     //   for (int i=0; i< arr.length; i++){

      //      for (int j=0; j< arr[i].length; j++){
      //          System.out.print(arr[i][j]+" ");
      //      }
        //    System.out.println();
      //  }
        System.out.println("******************");
        for (int[] satir :arr)//arr satırlardan oluşuyor[0],arr[1]
        {
            for (int eleman: satir){
                System.out.print(eleman+" ");
            }
            System.out.println();
        }
    }
}
