package Pegawai;

import java.time.LocalDate;

public class DosenTetap extends Dosen{
    protected String NIDN;
    protected double Tunjangan;
    protected LocalDate BUP;

    public DosenTetap(){

    }

    public DosenTetap(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Fakultas, String Jabatan, String NIDN){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok, Fakultas, Jabatan);
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return NIDN;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    public double getTunjangan(){
        return 0.02 * this.getMasaKerjaInt() * this.getGajiPokok();
    }

    public LocalDate getBUP(){
        LocalDate bupDate = tanggalLahir.plusYears(65); 
        return LocalDate.of(bupDate.getYear(), bupDate.getMonthValue(), 1).plusMonths(1);
    }
    
    @Override
    public void printInfo(){
        System.out.println("NIP             : " + getNIP());
        System.out.println("NIDN            : " + NIDN);
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTTL());
        System.out.println("TMT             : " + getTMT());
        System.out.println("Jabatan         : " + getJabatan());
        System.out.println("Fakultas        : " + getFakultas());
        this.getMasaKerja();
        System.out.println("BUP             : " + getBUP());
        System.out.println("Gaji Pokok      : " + getGajiPokok());
        System.out.println("Tunjangan       : 2% " + "x " + this.getMasaKerjaInt() + " x " + "Rp" + this.getGajiPokok() + " = " + this.getTunjangan());
    }
}
