package Pegawai;
import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    protected String NIP;
    protected String Nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;
    protected LocalDate saatIni = LocalDate.of(2025, 3, 10);

    public Pegawai(){
        
    }

    public Pegawai(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok){
        this.NIP = NIP;
        this.Nama = Nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getNama(){
        return Nama;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public LocalDate getTTL(){
        return tanggalLahir;
    }

    public void setTTL(LocalDate TTL){
        this.tanggalLahir = TTL;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }

    public void setGajiPokok(double Gaji){
        this.gajiPokok = Gaji;
    }

    public int getMasaKerjaInt(){
        LocalDate saatIni = LocalDate.of(2025, 3, 10);
        return Period.between(TMT, saatIni).getYears();
    }

    public void getMasaKerja(){
        Period MasaKerja = Period.between(TMT, saatIni);
        int tahun = MasaKerja.getYears();
        int bulan = MasaKerja.getMonths();
        System.out.println( "Masa Kerja     : " + tahun  + " " + "tahun" + " " + bulan + " " + "bulan");
    }

    public void printInfo(){
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: "+ Nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("TMT: "+ TMT);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
