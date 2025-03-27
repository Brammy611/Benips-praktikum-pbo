public class RuangDosen extends Ruang {
    private String namaDosen;
    private int jumlahKursi, jumlahMeja;
    private double tarifKebersihan;
    private static int counterRuangDosen = 0;

    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, int jumlahKursi, int jumlahMeja, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahKursi = jumlahKursi;
        this.jumlahMeja = jumlahMeja;
        this.tarifKebersihan = tarifKebersihan;
        counterRuangDosen++;
    }

    @Override
    public double hitungBiayaKebersihan(double tarif) {
        return getPanjang() * getLebar() * tarifKebersihan;
    }

    public static int getCounterRuangDosen(){
        return counterRuangDosen;
    }

    @Override
    public void printInfo() {
        System.out.println("Ruang Dosen - " + namaDosen);
        System.out.println("Jumlah Kursi    : " + jumlahKursi);
        System.out.println("Jumlah Meja     : " + jumlahMeja);
        System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(tarifKebersihan));
    }
}
