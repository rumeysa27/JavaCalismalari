package Gun44;

public class S23 {
    public static void main(String[] args) {//bu soruyu direkt yaptımm çok mutluyum berkecann:))))))))))))
        //döngüye ne gelmeli ki sonuç 30u versin
        int[] stack={10,20,30}; //30 ikinci indexte
        int size=3;
        int idx=0;//idx index demek
        do {
            idx++;
        }while (idx< size-1);//index en son küçükken döncek 1ken 2 oldu 1<2yken döncek 2burada 2.indexi yani 30uvercek
// şöyle de olabilir do{
      //  idx++;
   // }while(idx< size) bu yöntemle de 30 verir sonuç/ size 3
        System.out.println("idx= "+ idx);
        System.out.println("The Top eleman : "+stack[idx]);//30

    }
}
