package RELASI;

/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class MMahasiswa
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 27 Februari 2025
 */

public class MMahasiswa {
    public static void main(String[] args) {
        Dosen D1 = new Dosen("24060123130091", "Bramantyo Kunni", "Informatika");
        // D1.printDosen();

        MataKuliah MK1 = new MataKuliah("1", "PBO", 3);
        // MK1.printMatkul();

        Kendaraan K1= new Kendaraan("H 2404", "Motor");
        // K1.printKendaraan();

        Mahasiswa M1 = new Mahasiswa("234", "Bramantyo", "Informatika");
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah ASA = new MataKuliah("ASA", "Analisa Strategi Algoritma", 3);
        MataKuliah KJI = new MataKuliah("KJI", "Keamanan dan Jaminan Informasi", 3);
        
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        M1.addMatKul(ASA);
        M1.addMatKul(KJI);
        
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.printDetailMhs();
        System.out.println("Jumlah SKS Kuliah = " + M1.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
    }
}