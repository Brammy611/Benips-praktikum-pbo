public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public Pegawai(){

    }

    public Pegawai(String n){
        this.nama = n;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String Nama){
        this.nama = Nama;
    }

    public int getGajiPokok(){
        return gajiPokok;
    }

    public void tampilData(){
        System.out.println("Nama : " + getNama() + ", " + "Gaji Pokok : " + getGajiPokok());
    }
    
}
