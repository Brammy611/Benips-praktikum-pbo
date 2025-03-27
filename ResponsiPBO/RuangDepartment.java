public class RuangDepartment extends Ruang{
    private String namaDepartemen;
    private String ketuaDepartemen;
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;
    private double tarifKebersihan;
    private static int counterRuangDepartment = 0;
    
    public RuangDepartment(){
        counterRuangDepartment++;
    }

    public RuangDepartment(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDepartemen, String ketuaDepartemen, int jumlahMeja, int jumlahKursi, int jumlahLemari, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDepartemen = namaDepartemen;
        this.ketuaDepartemen = ketuaDepartemen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
        this.tarifKebersihan = tarifKebersihan;
        counterRuangDepartment++;
    }

    public static int getCounterRuangDepartment(){
        return counterRuangDepartment;
    }

    @Override
    public double hitungBiayaKebersihan(double tarif) {
        return getPanjang() * getLebar() * tarifKebersihan;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Departemen      : " + namaDepartemen);
        System.out.println("Ketua Departemen: " + ketuaDepartemen);
        System.out.println("Jumlah Meja     : " + jumlahMeja);
        System.out.println("Jumlah Kursi    : " + jumlahKursi);
        System.out.println("Jumlah Lemari   : " + jumlahLemari);
        System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(tarifKebersihan));
    }
}
