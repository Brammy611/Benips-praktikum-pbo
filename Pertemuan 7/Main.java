public class Main {
    public static void main(String[] args) {
        // Anabul A = new Anjing("Joko");
        // Anabul B = new Burung("Wowo");
        // Kucing K = new Kucing("Fufu");

        System.out.println("Bramantyo Kunni Nurrisqi/24060123130091");
        // A.tampilkanInfo();
        // A.Gerak();
        // A.Bersuara();
        // B.tampilkanInfo();
        // B.Gerak();
        // B.Bersuara();
        // K.tampilkanInfo();
        // K.Gerak();
        // K.Bersuara();

        Datum<Kucing> kucingDatum = new Datum<>(new Kucing());
        Datum<Anjing> anjingDatum = new Datum<>(new Anjing());
        Datum<Burung> burungDatum = new Datum<>(new Burung());

        ContohMetodeGenerik contoh = new ContohMetodeGenerik();

        Anabul kucing = contoh.Fungsi(kucingDatum);
        kucing.Bersuara(); 
        kucing.Gerak();  

        contoh.Prosedur(anjingDatum);  
        contoh.Prosedur(burungDatum); 
    } 
}


