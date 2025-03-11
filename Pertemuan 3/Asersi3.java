import java.util.Scanner;

/**
 * File         : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari jari lingkaran yang bernilai 0
 * 
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jari-jari");
        double jariJari = scanner.nextInt();
        assert(jariJari > 0) : "Jari-jari tidak boleh nol!!!!";
        Lingkaran L1 = new Lingkaran(jariJari);
        double kelilingLingkaran = L1.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran); 
    }
}


// Asersi pada kode di atas tidak berjalan, walaupun kondisi inputan jari-jari = 0, namun di output tetap mengeluarkan keliling lingkaran, seharusnya mengeluarkan "Jari-jari tidak boleh nol!!!!"