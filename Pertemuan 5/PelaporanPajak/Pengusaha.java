package PelaporanPajak;
/* Nama File    : Pengusaha.java
 * Deskripsi    : berisikan atribut dan method pengusaha
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 20 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{
    protected String NPWP;
    protected static int counterPengusaha = 0;

    public Pengusaha(){
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate TMK, String alamat, double pendapatan, String NPWP){
        super(nama, TMK, alamat, pendapatan);
        this.NPWP = NPWP;
        counterPengusaha++;
    }

    public String getNPWP(){
        return NPWP;
    }

    public void setNPWP(String NPWP){
        this.NPWP = NPWP;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    public int hitungMasaKerja(){
        LocalDate sekarang = LocalDate.now();
        return Period.between(tgl_mulai_kerja, sekarang).getYears() + 9;
    } 

    public double hitungPajak(){
        return 1.5 * this.getPendapatan();
    }

    public void cetakInfo(){
        System.out.println("NPWP              : " + this.getNPWP());
        super.cetakInfo();
        System.out.println("Masa Kerja        : " + this.hitungMasaKerja());
        System.out.println("Pajak             : " + this.hitungPajak());
    }
}
