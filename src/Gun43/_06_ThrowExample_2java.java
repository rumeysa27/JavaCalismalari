package Gun43;

import java.util.Scanner;

public class _06_ThrowExample_2java {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Yeni şifre oluşturma");

        System.out.println("Yeni şifreniz: ");
        String newPassword= oku.nextLine();
        try {
            if (newPassword.length()<8)//bu mesaj ile suni hata oluştu
                throw  new Exception("Şifre ez az 8 karakterden oluşmalı");
            if (newPassword.length()>15)//bu mesaj ile suni hata oluştur
                throw new Exception("Şifre en fazla 15 karakterden oluşmalı");
        }
        catch (Exception ex){
            //hatalar bir yere toplanıp hepsi için hyapılması gereken işlemler birarada burada yapılabilir
            //mesela log tutma gibi.
            System.out.println("Lütfen Dikkat ! ");
            System.out.println(ex.getMessage());
        }
    }
}
