public abstract class Ruang {
    private String kode;
    private double panjang;
    private double lebar;
    private double tinggi;
    private int kapasitas;
    private static int counterRuang = 0;

    public Ruang(){
        counterRuang++;
    }

    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas){
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
        counterRuang++;
    }

    public String getKodeRuang(){
        return kode;
    }

    public void setKodeRuang(String kode){
        this.kode = kode;
    }

    public double getPanjang(){
        return panjang;
    }

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public double getLebar(){
        return lebar;
    }

    public void setLebar(double l){
        this.lebar = l;
    }

    public double getTinggi(){
        return tinggi;
    }

    public void setTinggi(double t){
        this.tinggi = t;
    }

    public int getKapasitas(){
        return kapasitas;
    }

    public void setKapasitas(int k){
        this.kapasitas = k;
    }

    public static int getCounterRuang(){
        return counterRuang;
    }

    public abstract double hitungBiayaKebersihan(double tarif);

    public void printInfo() {
        System.out.println("Kode Ruang      : " + kode);
        System.out.println("Dimensi         : " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("Kapasitas       : " + kapasitas);
    }
}
