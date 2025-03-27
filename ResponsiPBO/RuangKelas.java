public class RuangKelas extends Ruang{
    private int kursiRusak;
    private int kursiTersedia;
    private static final double TARIF_KEBERSIHAN = 5000;
    private static int counterRuangKelas = 0;

    public RuangKelas(){
        counterRuangKelas++;
    }

    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int kursisedia, int kursirusak){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.kursiTersedia = kursisedia;
        this.kursiRusak = kursirusak;
        counterRuangKelas++;
    }

    public int getKursiSedia(){
        return kursiTersedia;
    }

    public void setKursiTersedia(int ks){
        this.kursiTersedia = ks;
    }

    public int getKursiRusak(){
        return kursiRusak;
    }

    public void setKursiRusak(int kr){
        this.kursiRusak = kr;
    }

    public static int getCounterRuangKelas(){
        return counterRuangKelas;
    }

    @Override
    public double hitungBiayaKebersihan(double tarif) {
        return getPanjang() * getLebar() * TARIF_KEBERSIHAN;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Kursi Tersedia  : " + kursiTersedia);
        System.out.println("Kursi Rusak     : " + kursiRusak);
        System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(TARIF_KEBERSIHAN));
    }
}
