package Gun44;

public class S37 {
    public static void main(String[] args) {//bu soruyu da yaptım
        int[] intArr={15,30,45,60,75};
        intArr[2]=intArr[4];//yani2.index 45 bunu alıp yerine 4.indexi yani 75i atadı
        intArr[4]=90;//burada da 4.indexin yani 75in yerine 90ı atadı
        for (int i: intArr){
            System.out.print(i+",");
        }


    }
}
