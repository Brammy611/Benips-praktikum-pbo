import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        System.out.println("Bramantyo Kunni Nurrisqi/24060123130091");
        for (Pegawai emp:emps){
            emp.tampilData();
        }
    }
}

// 2. Polimorfisme memungkinkan objek Programmer dan Manajer diperlakukan sebagai objek bertipe Pegawai, sehingga semua objek bisa dimasukkan ke dalam satu ArrayList<Pegawai> dan diproses bersama-sama dalam satu loop. Ini membuat kode lebih sederhana, fleksibel, dan mudah dikembangkan tanpa harus mengetahui tipe asli dari setiap objek saat pemanggilan metode tampilData().

// 3. Tanpa polimorfisme, setiap objek harus dideklarasikan dengan tipe spesifiknya (Programmer atau Manajer), sehingga kita tidak bisa menyatukan semua objek dalam satu list bertipe Pegawai. Ini membuat proses pemanggilan metode menjadi lebih rumit, membutuhkan pengecekan tipe secara manual, dan membuat kode sulit dirawat serta diperluas.