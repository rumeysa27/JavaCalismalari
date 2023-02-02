package Gun47;

public class S39 {
    public static void main(String[] args) {
        String shirts[][]=new String[2][2];
        shirts[0][0]= "red";
        shirts[0][1]="blue";
        shirts[1][0]="small";
        shirts[1][1]="medium";

        for (String[] c : shirts){//shirts içindeki satırları al c ismini ver ve döngüye gönder
            for (String s : c){//satırdaki elemanları al s adını vererek döngüye gönder
                System.out.println(s + ":");
            }
        }





    }
}
