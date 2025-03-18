package Pegawai;

import java.time.LocalDate;

public class Tendik extends Pegawai{
    protected String Bidang;
    protected double TunjanganTendik;
    protected LocalDate BUP;

    public Tendik(){
        
    }

    public Tendik(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Bidang){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok);
        this.Bidang = Bidang;
    }

    public String getBidang(){
        return Bidang;
    }

    public void setBidang(String Bidang){
        this.Bidang = Bidang;
    }

    public LocalDate getBUPTendik(){
        LocalDate bupDate = tanggalLahir.plusYears(55); 
        return LocalDate.of(bupDate.getYear(), bupDate.getMonthValue(), 1).plusMonths(1);
    }

    public double getTunjanganTendik(){
        return 0.01 * this.getMasaKerjaInt() * this.getGajiPokok();
    }

    @Override
    public void printInfo(){
        System.out.println("NIP             : " + getNIP());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTTL());
        System.out.println("TMT             : " + getTMT());
        System.out.println("Jabatan         : " + getBidang());
        this.getMasaKerja();
        System.out.println("BUP             : " + getBUPTendik());
        System.out.println("Gaji Pokok      : " + getGajiPokok());
        System.out.println("Tunjangan       : 1% " + "x " + this.getMasaKerjaInt() + " x " + "Rp" + this.getGajiPokok() + " = " + this.getTunjanganTendik());
    }
}
