/* Nama File    : MGaris.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 20 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik(-2, 3);
        Titik T3 = new Titik();
        Titik T4 = new Titik(3, 2);
        Garis G1 = new Garis(T1, T2);
        Garis G2 = new Garis(T3, T4);

        //Panjang dari garis
        System.out.println("Panjang dari garis tersebut adalah " + G1.getPanjang());
        System.out.println("Panjang dari garis tersebut adalah " + G2.getPanjang());

        //Gradien dari garis 
        System.out.println("Gradien dari garis tersebut adalah " + G1.getGradien());
        System.out.println("Gradien dari garis tersebut adalah " + G2.getGradien());

        //Titik tengah dari garis
        Titik T5 = G1.titikTengah();
        T5.printTitik();

        Titik T6 = G2.titikTengah();
        T6.printTitik();

        //Cek garis sejajar
        System.out.println("Apakah garis sejajar?" + G1.garisSejajar(G2));

        //Cek garis tegak lurus
        System.out.println("Apakah garis tegak lurus?" + G1.garisTegakLurus(G2));

        //Persamaan garis
        G1.persamaanGaris();
       
        


    }
}
