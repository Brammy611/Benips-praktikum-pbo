package Koleksi_Anabul;

import Tugas_Koleksi.Koleksi;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>(10);
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int tipe = rand.nextInt(3);
            Anabul hewan;
            switch (tipe) {
                case 0 -> hewan = new Kucing("Kucing" + i);
                case 1 -> hewan = new Anjing("Anjing" + i);
                default -> hewan = new Burung("Burung" + i);
            }
            koleksiAnabul.add(hewan);
        }

        System.out.println("Daftar Anabul:");
        for (int i = 0; i < koleksiAnabul.getSize(); i++) {
            Anabul a = koleksiAnabul.getIsi(i);
            System.out.println(a.getNama());
            a.Bersuara();
            a.Gerak();
            System.out.println();
        }
    }
}
