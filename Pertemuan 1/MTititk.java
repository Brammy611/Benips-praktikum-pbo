/* Nama File    : MTitik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 20 Februari 2025
 */

public class MTititk {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(4);
        T1.setOrdinat(6);
        T1.printTitik();
        T1.geser(-5, 4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(-2);
        T1.setOrdinat(9);
        T2.printTitik();

        Titik T3 = new Titik(); //Membuat object titik (0,0)
        Titik T4 = new Titik(3,5); //Membuat object titik (3,5)

        System.out.println("Jumlah object Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah object Titik = " + T4.getCounterTitik());

        //Mengembalikan kuadran titik
        System.out.println("Titik terletak di kuadran " + T1.getKuadran());

        //Mengembalikan jarak titik ke titik pusat
        System.out.println("Jarak ke titik pusat adalah " + T1.getJarakPusat());

        //Mengembalikan jarak antara 2 titik
        System.out.println("Jarak antara kedua titik adalah " + T1.getJarak(T4));

        //Merefleksikan titik terhadap sumbu x
        T1.refleksiX();
        T1.printTitik();

        //Merefleksikan titik terhadap sumbu y
        T1.refleksiY();
        T1.printTitik();

        //Mengembalikan titik yang direfleksikan 
        Titik T8 = T4.getRefleksiX();
        T8.printTitik();

        Titik T9 = T4.getRefleksiY();
        T9.printTitik();
    }
}
