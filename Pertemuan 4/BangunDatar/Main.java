public class Main {
    public static void main(String[] args) {
        Persegi p = new Persegi(5, "Merah", "Hitam");
        System.out.println("Persegi:");
        p.printInfo();
        System.out.println("Sisi: " + p.getSisi());
        System.out.println("Luas: " + p.getLuas());
        System.out.println("Keliling: " + p.getKeliling());
        System.out.println("Diagonal: " + p.getDiagonal());

        Lingkaran l = new Lingkaran(10, "Biru", "Putih");
        System.out.println("Lingkaran:");
        l.printInfo();
        System.out.println("Jari-jari: " + l.getJari());
        System.out.println("Luas: " + l.getLuas());
        System.out.println("Keliling: " + l.getKeliling());
        
    }
}