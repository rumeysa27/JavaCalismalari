package Gun44;

public class S21 {
    public static void main(String[] args) {//bu soruya direkt 1 2 3 4 diye atladım:(((
        int[] arr={1,2,3,4};//indexler:0,1,2,3,toplam da 4 eleman var size ı 4
        int i=0;

        do {
            System.out.println(arr[i]+" ");//döngü sırayla 1 2 3 4 yazdı
            i++;//i en son 4 oldu ama yukarıda 4.eleman yok index 0dan başlıyor
        }while (i<arr.length+1);//burada length i<5 yani uzulunk 4 burada
        //while(i < arr.length) eğer böyle olursa sorunsuz çalışacak
    }
}
