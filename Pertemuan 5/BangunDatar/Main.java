package BangunDatar;

public class Main {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar(); 
        //Masalah : karena bangun datar adalah abstrak maka tidak bisa membuat objek secara langsung dari kelas ini
        BangunDatar P1 = new Persegi(10, "putih", "solid");
        Persegi P2 = new Persegi(5,  "putih", "solid");
        BangunDatar L1 = new Lingkaran(7,  "putih", "solid");
        Lingkaran L2 = new Lingkaran (14,  "putih", "solid");

        System.out.println("--------------Persegi 1----------\n");
        P1.printInfo();
        double LP1 = P1.getLuas();
        double KP1 = P1.getKeliling();
        System.out.println("Luas: " + LP1);
        System.out.println("Keliling: " + KP1);

        System.out.println("\n--------------Persegi 2----------\n");
        P2.printInfo();
        double LP2 = P2.getLuas();
        double KP2 = P2.getKeliling();
        System.out.println("Luas: " + LP2);
        System.out.println("Keliling: " + KP2);

        System.out.println("\n--------------Lingkaran 1----------\n");
        L1.printInfo();
        double LP3 = L1.getLuas();
        double KP3 = L1.getKeliling();
        System.out.println("Luas: " + LP3);
        System.out.println("Keliling: " + KP3);

        System.out.println("\n--------------Lingkaran 2----------\n");
        L2.printInfo();
        double LP4 = L2.getLuas();
        double KP4 = L2.getKeliling();
        System.out.println("Luas: " + LP4);
        System.out.println("Keliling: " + KP4);

        System.out.println("\n---------------Membandingkan Luas-------------");
        System.out.println("Apakah P1 memiliki luas sama dengan P2? " + P1.isEqualLuas(P2));
        System.out.println("Apakah P1 memiliki luas sama dengan L1? " + P1.isEqualLuas(L1));

        // Jika BangunDatar tidak dijadikan sebagai abstract class, method isEqualLuas() dan isEqualKeliling() bisa dibuat di BangunDatar.java, namun tidak bisa diimplementasikan ke kode main karena pada method isEqualLuas() dan isEqualKeliling() terdapat getLuas dan getKeliling yang tidak diimplementasikan pada class BangunDatar

        // Memanggil method zoomIn()
        P2.zoomIn();
        System.out.println("Setelah zoomIn (10% lebih besar): " + P2.getSisi());

        L2.zoom(150);
        System.out.println("Setelah zoomIn (15% lebih besar): " + L2.getJari());

        // interface IResize tidak bisa digunakan ke variabel dengan type BangunDatar karena interface IResize tidak diimplementasikan pada class BangunDatar

        // Keuntungan dikemas menjadi interface adalah lebih fleksibel, tidak mempertimbangkan hubungan pewarisan, yang penting memiliki behaviour serupa
    }
}