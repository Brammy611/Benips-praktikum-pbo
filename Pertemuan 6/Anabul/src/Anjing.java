public class Anjing extends Anabul{

    public Anjing(){
    }

    public Anjing(String N){
        super(N);
    }

    @Override
    public void Gerak(){
        System.out.println("Anjing bergerak melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Anjing bersuara guk-guk");
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
    }
}
