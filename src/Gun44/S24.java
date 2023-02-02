package Gun44;

public class S24 {
    public static void main(String[] args) {//bu soruyu yanlış yapamayacak kadar  anlamadım
        String[] strs=new String[2];
        int idx=0;
//String ifadelerin dizilerinde default değer NULL olduğu için concat yapılamıyor olmayan birşeye ekleme yapamaz
//     for (int i= 0; i<strs.length; i++){
//         System.out.println(strs[i]);}

//NULL değer bir şey eklemez NULLPinter exception
        for (String s: strs){
            strs[idx].concat(" element "+ idx);
            idx++;
        }
//        for (idx=0; idx< strs.length; idx++){
//            System.out.println(strs[idx]);}

        //ORNEK:
        String kelime;
        String[] kelimeler=new String[2];
       // System.out.println("kelime= "+ kelime); okurken hata verir

        kelimeler[0].concat("ismet");//olmayan bir şeye concat ile ekleme yapmaya çalışıyoruz ama ekleme yapmaz
        // hafıazada yeri olmadığı için ekleme yapılama
    }
}
