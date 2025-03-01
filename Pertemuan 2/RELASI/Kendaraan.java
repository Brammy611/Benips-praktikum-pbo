package RELASI;

/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 27 Februari 2025
 */

public class Kendaraan {
    /********************ATRIBUT**********************/
    public String noPlat;
    public String jenis;

    /*********************METHOD*******************/
    //KONSTRUKTOR
    public Kendaraan(){
        this.noPlat = "-";
        this.jenis = "-";
    }

    public Kendaraan(String plat, String jenis){
        this.noPlat = plat;
        this.jenis = jenis;
    }

    //SELEKTOR DAN MUTATOR
    public void setNoPlat(String plat){
        this.noPlat = plat; 
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void printKendaraan(){
        System.out.println("Nomor plat : " + noPlat + "\n" + "Jenis : " + jenis);
    }
}
