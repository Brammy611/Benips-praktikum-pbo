package Pegawai;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DosenTamu extends Dosen{
    protected String NIDK;
    protected double Tunjangan;
    protected LocalDate BUP;
    protected LocalDate tanggalBerakhirKontrak;

    public DosenTamu(){

    }

    public DosenTamu(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Fakultas, String Jabatan, String NIDK, LocalDate tanggalBerakhirKontrak){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok, Fakultas, Jabatan);
        this.NIDK = NIDK;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public String getNIDK(){
        return NIDK;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public double getTunjangan(){
        return 0.025 *  this.getGajiPokok();
    }

    public long getTAK(){
        LocalDate tanggalSaatIni = LocalDate.of(2025, 3, 10);
        
        long selisihBulan = ChronoUnit.MONTHS.between(tanggalSaatIni, tanggalBerakhirKontrak);
        return selisihBulan;
    }

    public void setTAK(LocalDate tanggalAkhir){
        this.tanggalBerakhirKontrak = tanggalAkhir;
    }
        
    @Override
    public void printInfo(){
        System.out.println("NIP             : " + getNIP());
        System.out.println("NIDN            : " + NIDK);
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTTL());
        System.out.println("TMT             : " + getTMT());
        System.out.println("Jabatan         : " + getJabatan());
        System.out.println("Fakultas        : " + getFakultas());
        this.getMasaKerja();
        System.out.println("TAK             : " + getTAK());
        System.out.println("Gaji Pokok      : " + getGajiPokok());
        System.out.println("Tunjangan       : 2,5% " + "x " + this.getMasaKerjaInt() + " x " + "Rp" + this.getGajiPokok() + " = " + this.getTunjangan());
    }
    
}
