package Koleksi_Anabul;


public class Kucing extends Anabul{
    public Kucing(){
    }

    public Kucing(String N){
        super(N);
    }

    @Override
    public void Gerak(){
        System.out.println("Kucing bergerak melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Kucing bersuara meong");
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
    }
}
