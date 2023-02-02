package Gun45;

public class S79 {
    public static void main(String[] args) {
        String[] arr={"A","B","C", "D"};

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");//A

            if (arr[i].equals("D")){ //ilk adımda burası çalışmadı
                System.out.print("Work Done");
                break;
            }
           continue;
        }
    }
}
