package RELASI;

/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class Mata Kuliah
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 27 Februari 2025
 */

public class MataKuliah {
    /*********************ATRIBUT*********************/
    private String idMatKul;
    private String nama;
    private int sks;

    /**********************METHOD*******************/
    //KONSTRUKTOR
    public MataKuliah(){
        this.idMatKul = "-";
        this.nama = "-";
        this.sks = 0;
    }

    public MataKuliah(String id, String namaMatkul, int sks){
        this.idMatKul = id;
        this.nama = namaMatkul;
        this.sks = sks;
    }

    //SELEKTOR DAN MUTATOR
    public void setIdMatkul(String id){
        this.idMatKul = id;
    }

    public void setNamaMatkul(String nama){
        this.nama = nama;
    }

    public void setSksMatkul(int sks){
        this.sks = sks;
    }

    public String getIdMatkul(){
        return idMatKul;
    }

    public String getNamaMatkul(){
        return nama;
    }

    public int getSksMatkul(){
        return sks;
    }

    public void printMatkul(){
        System.out.println("Nama Mata Kuliah : " + nama + "\n" + "Id Mata Kuliah : " + idMatKul + "\n" + "Jumlah SKS Mata Kuliah : " + sks);
    }
}
