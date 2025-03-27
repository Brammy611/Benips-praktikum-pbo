import java.util.Arrays;


public class main {
    public static void main(String[] args) {
        // Membuat objek RuangKelas
        RuangKelas kelas1 = new RuangKelas("K101", 10, 8, 4, 30, 25, 5);
        System.out.println("==============================");
        kelas1.printInfo();
        System.out.println("==============================\n");
        
        // Membuat objek LabKomputer
        LabKomputer labKom = new LabKomputer("L201", 12, 10, 4, 25, "Lab Komputer A", 150000, 20);
        System.out.println("==============================");
        labKom.printInfo();
        System.out.println("==============================\n");
        
        // Membuat objek LabNonKomputer
        LabNonKomputer labBio = new LabNonKomputer("L301", 10, 9, 4, 20, "Lab Biologi", 120000, Arrays.asList("Biologi Dasar", "Genetika"));
        System.out.println("==============================");
        labBio.printInfo();
        System.out.println("==============================\n");
        
        // Membuat objek RuangDepartment
        RuangDepartment ruangDep = new RuangDepartment("D401", 15, 12, 4, 10, "Department Informatika", "Dr. Budi", 5, 10, 3, 7000);
        System.out.println("==============================");
        ruangDep.printInfo();
        System.out.println("==============================\n");
        
        // Membuat objek RuangDosen
        RuangDosen ruangDosen = new RuangDosen("D501", 8, 6, 4, 3, "Dr. Siti", 2, 1, 6000);
        System.out.println("==============================");
        ruangDosen.printInfo();
        System.out.println("==============================\n");

        System.out.println("Jumlah Ruang Kelas : " + RuangKelas.getCounterRuangKelas());
        System.out.println("Jumlah Ruang Dosen : " + RuangDosen.getCounterRuangDosen());
        System.out.println("Jumlah Ruang Department : " + RuangDepartment.getCounterRuangDepartment());
        System.out.println("Jumlah Laboratorium : " + Laboratorium.getCounterLab());
        System.out.println("Jumlah Lab Komputer : " + LabKomputer.getCounterLabKom());
        System.out.println("Jumlah Lab Non Komputer : " + LabNonKomputer.getCounterNonLabKom());
    }
}