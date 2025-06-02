package Koleksi_Anabul;


public abstract class Anabul {
    protected String Nama;

    public Anabul(){
        this.Nama = "";
    }

    public Anabul(String N){
        this.Nama = N;
    }

    public String getNama(){
        return Nama;
    }

    public void setNama(String N){
        this.Nama = N;
    }

    public abstract void Gerak();

    public abstract void Bersuara();

    public void tampilkanInfo(){
        System.out.println("Nama: " + getNama());
    }
}
