/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Bramantyo Kunni Nurrisqi
 * Tanggal      : 20 Februari 2025
 */


public class Titik {
    /***************ATRIBUT*************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***************METHOD*************/
    //konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
        counterTitik++;
    }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    //mengembalikan absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejuh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak ordinat
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //mengembalikan kuadran titik
    double getKuadran(){
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
    double getJarakPusat(){
        return Math.sqrt(Math.pow(absis,2)+Math.pow(ordinat,2));
    }

    //mengembalikan jarak antara 2 titik
    double getJarak(Titik T){
        return Math.sqrt(Math.pow((this.absis - T.absis),2) + Math.pow((this.ordinat - T.ordinat),2));
    }

    //Refleksi terhadap sumbu x
    void refleksiX(){
        ordinat = ordinat * (-1);
    }

    //Refleksi terhadap sumbu y
    void refleksiY(){
        absis = absis * (-1);
    }

    //Mengembalikan titik yang direfleksikan terhadap sumbu x
    Titik getRefleksiX(){
        Titik T1 = new Titik();
        T1.absis = absis;
        T1.ordinat = ordinat * (-1);
        return T1;
    }

    //Mengembalikan titik yang direfleksikan terhadap sumbu y
    Titik getRefleksiY(){
        Titik T1 = new Titik();
        T1.absis = absis * (-1);
        T1.ordinat = ordinat;
        return T1;
    }
}
