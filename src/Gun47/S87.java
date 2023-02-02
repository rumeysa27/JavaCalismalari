package Gun47;

public class S87 {
    public static void main(String[] args) {
        int n[][]= {{1,3},{2,4}};//n.length 2 ye eşit
        for (int i = n.length -1; i>= 0; i--){//i--yani tersten yazdırıyor en son satırın en son elemanından başlıyor
            for (int j= n[i].length-1; j>= 0; j--){//n[1].length ve n[0].length j: 1 0
                System.out.print(n[i][j]);
            }

        }
    }
}
