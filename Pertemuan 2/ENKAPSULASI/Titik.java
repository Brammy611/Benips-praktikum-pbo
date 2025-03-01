package ENKAPSULASI;
/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 27 Februari 2025
 */


public class Titik {
    /***************ATRIBUT*************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************METHOD*************/
    //konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
        counterTitik++;
    }

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    //mengembalikan absis
    public double getAbsis() {
        return absis;
    }

    //mengembalikan ordinat
    public double getOrdinat(){
        return ordinat;
    }

    //mengset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //mengset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejuh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak ordinat
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //mengembalikan kuadran titik
    public double getKuadran(){
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0) {
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else {
            return 4;
        }
    }

    //mengembalikan jarak titik ke pusat
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(absis,2)+Math.pow(ordinat,2));
    }

    //mengembalikan jarak antara 2 titik
    public double getJarak(Titik T){
        return Math.sqrt(Math.pow((this.absis - T.absis),2) + Math.pow((this.ordinat - T.ordinat),2));
    }

    //Refleksi terhadap sumbu x
    public void refleksiX(){
        ordinat = ordinat * (-1);
    }

    //Refleksi terhadap sumbu y
    public void refleksiY(){
        absis = absis * (-1);
    }

    //Mengembalikan titik yang direfleksikan terhadap sumbu x
    public Titik getRefleksiX(){
        Titik T1 = new Titik();
        T1.absis = absis;
        T1.ordinat = ordinat * (-1);
        return T1;
    }

    //Mengembalikan titik yang direfleksikan terhadap sumbu y
    public Titik getRefleksiY(){
        Titik T1 = new Titik();
        T1.absis = absis * (-1);
        T1.ordinat = ordinat;
        return T1;
    }
}
