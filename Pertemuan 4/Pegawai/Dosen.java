package Pegawai;

import java.time.LocalDate;

public class Dosen extends Pegawai{
    String Fakultas;
    String Jabatan;

    public Dosen(){
        
    }

    public Dosen(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Fakultas, String Jabatan){
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok);
        this.Fakultas = Fakultas;
        this.Jabatan = Jabatan;
    }

    public String getFakultas(){
        return Fakultas;
    }

    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }

    public String getJabatan(){
        return Jabatan;
    }

    public void setJabatan(String Jabatan){
        this.Jabatan = Jabatan;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + Fakultas);
        System.out.println("Jabatan: " + Jabatan);
    }
}
