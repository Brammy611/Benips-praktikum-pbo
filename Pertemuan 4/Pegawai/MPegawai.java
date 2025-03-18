package Pegawai;

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        // Pegawai P1 = new Pegawai("24060123130091", "Bramantyo Kunni", LocalDate.parse("1988-09-29"), LocalDate.parse("1998-09-29") , 200000);
        Pegawai D1 = new DosenTetap("24060123130091", "Bramantyo Kunni", LocalDate.parse("1988-09-29"), LocalDate.parse("1998-09-29") , 200000, "FSM", "Dosen Tetap", "24060123130091");
        Pegawai D2 = new DosenTamu("24060123130092", "Andi Wijaya", LocalDate.parse("1990-05-15"), LocalDate.parse("2015-01-01"), 5000000, "Fakultas Teknik", "Dosen Tamu", "1902912382981082", LocalDate.parse("2026-08-15"));
        Pegawai T1 = new Tendik("24060123130093", "Siti Rahma", LocalDate.parse("1985-07-20"), LocalDate.parse("2010-06-10"), 3500000, "Akademik");
        
        System.out.println("--------------------Dosen Tetap--------------------------\n");
        D1.printInfo();

        System.out.println("\n--------------------Dosen Tamu--------------------------\n");
        D2.printInfo();

        System.out.println("\n--------------------Tendik--------------------------\n");
        T1.printInfo();
        // System.out.println("Tunjangan dari dosen " + D1.getNama() + " adalah " + D1.getTunjangan());
        // P1.getMasaKerja();
    }
}
