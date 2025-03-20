package PelaporanPajak;
/* Nama File    : Pengusaha.java
 * Deskripsi    : berisikan atribut dan method PNS
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 20 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    protected String NIP;
    protected static int counterPNS = 0;

    public PNS(){
        counterPNS++;
    }

    public PNS(String nama, LocalDate TMK, String alamat, double pendapatan, String NIP){
        super(nama, TMK, alamat, pendapatan);
        this.NIP = NIP;
        counterPNS++;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    public int hitungMasaKerja(){
        LocalDate sekarang = LocalDate.now();
        return (Period.between(tgl_mulai_kerja, sekarang).getYears()) + 1;
    }

    public double hitungPajak(){
        return 0.1 * this.getPendapatan();
    }

    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void cetakInfo(){
        System.out.println("NIP               : " + NIP);
        super.cetakInfo();
        System.out.println("Masa Kerja        : " + this.hitungMasaKerja());
        System.out.println("Pajak             : " + this.hitungPajak());
    }
    
}
