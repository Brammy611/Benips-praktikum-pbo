package PelaporanPajak;
/* Nama File    : Pengusaha.java
 * Deskripsi    : berisikan atribut dan method petani
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 20 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    protected String asal_kota;
    protected static int counterPetani = 0;

    public Petani(){
        counterPetani++;
    }

    public Petani(String nama, LocalDate TMK, String alamat, double pendapatan, String asalKota){
        super(nama, TMK, alamat, pendapatan);
        this.asal_kota = asalKota;
        counterPetani++;
    }

    public String getAsalKota(){
        return asal_kota;
    }
    
    public void setAsalKota(String asalKota){
        this.asal_kota = asalKota;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    public int hitungMasaKerja(){
        LocalDate sekarang = LocalDate.now();
        return Period.between(tgl_mulai_kerja, sekarang).getYears() + 0;
    }

    public double hitungPajak(){
        return 0;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota       : " + this.getAsalKota());
        System.out.println("Masa Kerja      :" + this.hitungMasaKerja());
        System.out.println("Pajak           : " + this.hitungPajak());
    }
}
