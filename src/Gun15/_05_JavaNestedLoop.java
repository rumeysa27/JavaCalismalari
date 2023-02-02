package Gun15;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *

        for (int satir=1;satir<=5;satir++){//satir=1,2,3,4,5

            for (int j=0;j<satir;j++){
                System.out.print("*");//*****
            }
            System.out.println();
        }

        for (int satir=5;satir>0;satir--){//5,4,3,2,1

          for (int j=0;j<satir;j++){
            System.out.print("*");
        }
        System.out.println();
        }
        }
}
