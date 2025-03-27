import java.util.List;
import java.util.ArrayList;

public class LabNonKomputer extends Laboratorium {
    private List<String> mataKuliah = new ArrayList<>();
    private static int counterNonLabKom = 0;
    
    public LabNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, List<String> mataKuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.mataKuliah = mataKuliah;
        counterNonLabKom++;
    }

    public static int getCounterNonLabKom(){
        return counterNonLabKom;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Laboratorium Non-Komputer - " + namaLab);
        System.out.println("Mata Kuliah     : " + mataKuliah);
        System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(0));
    }
}