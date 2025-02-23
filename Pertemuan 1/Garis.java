/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 20 Februari 2025
 */

public class Garis {
    /***************ATRIBUT*************/
    Titik TitikAwal;
    Titik TitikAkhir;
    static int counterGaris = 0;

    /***************METHOD*************/
    //konstruktor untuk membuat garis
    Garis(){
        this.TitikAwal.absis = 0;
        this.TitikAwal.ordinat = 0;
        this.TitikAkhir.absis = 1;
        this.TitikAkhir.ordinat = 1;
        counterGaris++;
    }

    Garis(Titik T1, Titik T2){
        TitikAwal = T1;
        TitikAkhir = T2;
        counterGaris++;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    void printCounterGaris(){
        System.out.println(this.counterGaris);
    }

    //mengembalikan titik awal
    Titik getTitikAwal(){
        return TitikAwal;
    }

    //mengembalikan titik akhir
    Titik getTitikAkhir(){
        return TitikAkhir;
    }

    //mengeset titik awal
    void setTitikAwal(Titik T){
        TitikAwal = T;
    }

    //mengeset titik akhir
    void setTitikAkhir(Titik T){
        TitikAkhir = T;
    }

    //mengembalikan panjang dari sebuah garis
    double getPanjang(){
        return Math.sqrt((Math.pow((TitikAkhir.absis - TitikAwal.absis),2) + Math.pow((TitikAkhir.ordinat - TitikAwal.ordinat),2)));
    }

    //mengmebalikan gradien dari sebuah garis
    double getGradien(){
        return (TitikAkhir.ordinat-TitikAwal.ordinat)/(TitikAkhir.absis-TitikAwal.absis);
    }

    //mengembalikan titik tengah dari 2 titik
    Titik titikTengah(){
        Titik tengah = new Titik();
        tengah.absis = (TitikAwal.absis + TitikAkhir.absis)/2;
        tengah.ordinat = (TitikAwal.ordinat + TitikAkhir.ordinat)/2;
        return tengah;
    }

    //mengembalikan true jika garis sejajar dan false jika garis tidak sejajar
    boolean garisSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    //mengembalikan true jika garis tegak lurus dan false jika garis tidak tegak lurus
    boolean garisTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == (-1);
    }

    //mengembalikan titik awal dan titik akhir
    void printTitikAwal(){
        System.out.println("Titik (" + TitikAwal.absis + "," + TitikAwal.ordinat + ")");
    }

    void printTitikAkhir(){
        System.out.println("Titik (" + TitikAkhir.absis + "," + TitikAkhir.ordinat + ")");
    }

    //menampilkan persamaan garis dalam bentuk string
    void persamaanGaris(){
        double m = this.getGradien();
        double c = TitikAwal.ordinat - m * TitikAwal.absis;
        
        String tanda = (c >= 0) ? " + " : " - ";
        double nilaiC = Math.abs(c);
        
        System.out.println("y = " + m + "x" + tanda + nilaiC);
    }
    
    

}
