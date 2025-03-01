package ENKAPSULASI;
/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 27 Februari 2025
 */

public class Garis {
    /***************ATRIBUT*************/
    public Titik TitikAwal;
    public Titik TitikAkhir;
    public static int counterGaris = 0;

    /***************METHOD*************/
    //konstruktor untuk membuat garis
    public Garis(){
        this.TitikAwal.setAbsis(0);
        this.TitikAwal.setOrdinat(0);
        this.TitikAkhir.setAbsis(1);
        this.TitikAkhir.setOrdinat(1);
        counterGaris++;
    }

    public Garis(Titik T1, Titik T2){
        TitikAwal = T1;
        TitikAkhir = T2;
        counterGaris++;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    public void printCounterGaris(){
        System.out.println(this.counterGaris);
    }

    //mengembalikan titik awal
    public Titik getTitikAwal(){
        return TitikAwal;
    }

    //mengembalikan titik akhir
    public Titik getTitikAkhir(){
        return TitikAkhir;
    }

    //mengeset titik awal
    public void setTitikAwal(Titik T){
        TitikAwal = T;
    }

    //mengeset titik akhir
    public void setTitikAkhir(Titik T){
        TitikAkhir = T;
    }

    //mengembalikan panjang dari sebuah garis
    double getPanjang(){
        return Math.sqrt((Math.pow((TitikAkhir.getAbsis() - TitikAwal.getAbsis()),2) + Math.pow((TitikAkhir.getOrdinat() - TitikAwal.getOrdinat()),2)));
    }

    //mengmebalikan gradien dari sebuah garis
    public double getGradien(){
        return (TitikAkhir.getOrdinat()-TitikAwal.getOrdinat())/(TitikAkhir.getAbsis()-TitikAwal.getAbsis());
    }

    //mengembalikan titik tengah dari 2 titik
    public Titik titikTengah(){
        Titik tengah = new Titik();
        tengah.setAbsis((TitikAwal.getAbsis() + TitikAkhir.getAbsis())/2); 
        tengah.setOrdinat((TitikAwal.getOrdinat() + TitikAkhir.getOrdinat())/2);
        return tengah;
    }

    //mengembalikan true jika garis sejajar dan false jika garis tidak sejajar
    public boolean garisSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    //mengembalikan true jika garis tegak lurus dan false jika garis tidak tegak lurus
    public boolean garisTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == (-1);
    }

    //mengembalikan titik awal dan titik akhir
    public void printTitikAwal(){
        System.out.println("Titik (" + TitikAwal.getAbsis() + "," + TitikAwal.getOrdinat() + ")");
    }

    public void printTitikAkhir(){
        System.out.println("Titik (" + TitikAkhir.getAbsis() + "," + TitikAkhir.getOrdinat() + ")");
    }

    //menampilkan persamaan garis dalam bentuk string
    public void persamaanGaris(){
        double m = this.getGradien();
        double c = TitikAwal.getOrdinat() - m * TitikAwal.getAbsis();
        
        String tanda = (c >= 0) ? " + " : " - ";
        double nilaiC = Math.abs(c);
        
        System.out.println("y = " + m + "x" + tanda + nilaiC);
    }
    
    

}
