package Gun39._05_OOP_Soru;

public class Lahmacun implements IFood{
    @Override
    public void teste() {
        System.out.println("Yerli pizza");

    }

    @Override
    public double ucret() {
        return 20;
    }
    void dough(){
        System.out.println("Mayalı hamur hazırlandı");

    }
    void addMeat(){
        System.out.println("İç kıyma eklendi");

    }
    void bake(){
        System.out.println("Odun ateşinde pişirildi");

    }
}
