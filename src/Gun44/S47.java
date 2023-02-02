package Gun44;

public class S47 {
    public static void main(String[] args) {//bu soruyu çözmedim iyice anlamak için Hocayı dinledim
        //SORU: kodun çıktısı ne olur
        String[] strs={"A", "B"};
        int idx=0;
        for (String s: strs){
            strs[idx].concat(" element "+ idx);//concat değer appent gibi değer atamaz değeri aynı kalır yani
            idx++;
        }for (idx = 0; idx < strs.length; idx++){
            System.out.print(strs[idx]);
        }
    }
}
