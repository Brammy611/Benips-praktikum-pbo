public class LabKomputer extends Laboratorium {
    private int jumlahKomputer;
    private static int counterLabKom = 0;
    
    public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.jumlahKomputer = jumlahKomputer;
        counterLabKom++;
    }

    public static int getCounterLabKom(){
        return counterLabKom;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Laboratorium Komputer - " + namaLab);
        System.out.println("Jumlah Komputer : " + jumlahKomputer);
        System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(0));
    }
}