public class Anabul {
    private String Nama;

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

    public void Gerak(){
        System.out.println(getNama());
    }

    public void Bersuara(){
        System.out.println(getNama());
    }

    public void tampilkanInfo(){
        System.out.println("Nama: " + getNama());
    }
}
