package PelaporanPajak;
/* Nama File    : Manusia.java
 * Deskripsi    : kelas abstrak manusia
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 20 Maret 2025
 */

import java.time.LocalDate;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public abstract int hitungMasaKerja();

    public Manusia(){

    }

    public Manusia(String nama, LocalDate TMK, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = TMK;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public static void printCounterMns(){
        System.out.println("Jumlah manusia: " + counterMns);
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String Nama){
        this.nama = Nama;
    }

    public LocalDate getTMK(){
        return tgl_mulai_kerja;
    }

    public void setTMK(LocalDate tanggal){
        this.tgl_mulai_kerja = tanggal;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String Alamat){
        this.alamat = Alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public void setPendapatan(double Gaji){
        this.pendapatan = Gaji;
    }

    public void cetakInfo(){
        System.out.println("Nama                : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tgl_mulai_kerja);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Pendapatan        : " + pendapatan);
    }
}
