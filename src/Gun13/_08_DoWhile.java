package Gun13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
//kullanıcıdan x girilene kadar ekrana "program çalışıyor" yazan
// ve x girildiğinde ise "program bitti" yazan programı yazınız
        Scanner oku=new Scanner(System.in);
        String okunan="";
        do {
            System.out.print("ifade giriniz=");
            okunan=oku.next();

            if (!okunan.equalsIgnoreCase("x"))
                System.out.println("program çalışıyor");


        }while(!okunan.equalsIgnoreCase("x"));

        System.out.println("program bitti");





    }


}
