package Gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        //girilen bir ay numarasına göre ayın kaç gün sürdüğünü yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Ayın nosu= ");
        int ayNo=oku.nextInt();

        switch (ayNo)
        {
            case 1: System.out.println(31);break;
            case 2: System.out.println(28);break;
            case 3: System.out.println(31);break;
            case 4: System.out.println();break;
            case 5: System.out.println(31);break;
            case 6: System.out.println();break;
            case 7: System.out.println(31);break;
            case 8: System.out.println(31);break;
            case 9: System.out.println();break;
            case 10: System.out.println();break;
            case 11: System.out.println();break;
            case 12: System.out.println(31);break;
            default: System.out.println("hatalı ay no");
        }
              // 2.KOLAY YOL

        switch (ayNo)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println(31);break;

            case 2: System.out.println(28);break;

            case 4:
            case 16:
            case 19:
            case 11: System.out.println(30);break;
            default: System.out.println("hatalı ay no");
        }










    }
}