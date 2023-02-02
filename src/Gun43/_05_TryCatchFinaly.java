package Gun43;

public class _05_TryCatchFinaly {
    public static void main(String[] args) {
        long startTime=0;
        String str="";
        try {
           startTime=System.currentTimeMillis();
            System.out.println("Hatadan önceki kısım");
            char ilkHarf=str.charAt(0);
            System.out.println("Hatadan sonraki kısım");
            //hata olma olasılığının olduğu kodlar
        }
        catch (Exception ex){//hata olduğunda yapılacaklar
            System.out.println("catch bloğu çalıştı");
        }
        finally {
            //Hata olsa da çalışır olmasa da çalışacak kısım, bu bölüm yukarıdaki süreçle ilgili olduğunu
           // göstermek için FİNALLY içinde yazılıyor
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = "+ gecenSure);
            System.out.println("try-catch bloğuyla ilgili son yapılacaklar");

        }
        System.out.println("Diğer çalışan kodlar");

        System.out.println("Program sonu");



    }

}
