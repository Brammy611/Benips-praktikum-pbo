/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Koleksi;

/**
 *
 * @author ROG STRIX
 */
public class MainBangunDatar {
    public static void main(String[] args) {
        BangunDatarGeneric<Persegi> p = new BangunDatarGeneric<>();
        p.set(new Persegi(5));

        BangunDatarGeneric<PersegiPanjang> pp = new BangunDatarGeneric<>();
        pp.set(new PersegiPanjang(4, 6));

        BangunDatarGeneric<Segitiga> s = new BangunDatarGeneric<>();
        s.set(new Segitiga(3, 4, 5));

        System.out.println("Luas Persegi: " + p.hitungLuas());
        System.out.println("Keliling Persegi: " + p.hitungKeliling());

        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + pp.hitungKeliling());

        System.out.println("Luas Segitiga: " + s.hitungLuas());
        System.out.println("Keliling Segitiga: " + s.hitungKeliling());
    }
}

