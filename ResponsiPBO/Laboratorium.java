public abstract class Laboratorium extends Ruang {
    protected String namaLab;
    protected double hargaSewa;
    private static final double TARIF_KEBERSIHAN = 5000;
    private static int counterLab = 0;
    
    public Laboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
        counterLab++;
    }
    
    public static int getCounterLab(){
        return counterLab;
    }
    
    @Override
    public double hitungBiayaKebersihan(double tarif) {
        return getPanjang() * getLebar() * TARIF_KEBERSIHAN;
    }
}