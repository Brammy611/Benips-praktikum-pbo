package RELASI;

/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 27 Februari 2025
 */

public class Dosen {
    /**************************ATRIBUTE**************/
    private String nip;
    private String nama;
    private String prodi;

    /************************METHOD********************/
    //KONSTRUKTOR
    public Dosen(){
        this.nip = "-";
        this.nama = "-";
        this.prodi = "-";
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //SELEKTOR DAN MUTATOR
    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNip(String n){
        this.nip = n;
    }

    public void setNama(String n){
        this.nama = n;
    }

    public void setProdi(String n){
        this.prodi = n;
    }

    public void printDosen(){
        System.out.println(" Nama Dosen : " + nama + "\n" +  "NIP Dosen : " + nip + "\n" + "Prodi Dosen : " + prodi);
    }
}
