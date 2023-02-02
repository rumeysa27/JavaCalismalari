package Gun47;

public class S152 {
    public static void main(String[] args) {
        int n[][]={{1,3},{2,4}};
        for (int i= n.length -1; i>= 0; i--){//i : olarak önce 1i sonra 0ı göndercek

           for (int y : n[i]){//önce n[1]i yani(2,4) sonra n[0]ı yani(1,3) yazdırıryor
               System.out.print(y);
           }
        }
    }
}
