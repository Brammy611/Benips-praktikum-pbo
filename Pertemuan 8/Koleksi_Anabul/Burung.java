package Koleksi_Anabul;


public class Burung extends Anabul{
    public Burung(){
    }

    public Burung(String N){
        super(N);
    }

    @Override
    public void Gerak(){
        System.out.println("Burung bergerak melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Burung berbunyi cuit");
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
    }
}
