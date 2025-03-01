package RELASI;

/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 27 Februari 2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    /********************ATRIBUTE******************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    /********************METHOD********************/
    //KONSTRUKTOR
    public Mahasiswa(){
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public void addMatkul(MataKuliah newMataKul){
        listMatkul.add(newMataKul);
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // Metode untuk mengatur Kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Dosen Wali: " + dosenWali.getNama());
        System.out.println("Kendaraan: " + kendaraan.getJenis() + " - " + kendaraan.getNoPlat());
        int i;
        for(i = 0; i<listMatkul.size();i++){
            System.out.println(listMatkul.get(i).getNamaMatkul());
        }
    }

    public void addMatKul(MataKuliah n){
        listMatkul.add(n);
    }

    public int getJumlahSKS(){
        int totalSKS = 0;
        for(int i = 0; i<listMatkul.size();i++){
            totalSKS += listMatkul.get(i).getSksMatkul();
        }
        return totalSKS;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    public void printMhs(){
        System.out.println("Nim: " + nim + "\n" + "Nama: " + nama + "\n" + "Prodi: " + prodi);
    }

}
