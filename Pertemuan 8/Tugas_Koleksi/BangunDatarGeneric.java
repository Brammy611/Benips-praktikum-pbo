/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Koleksi;

/**
 *
 * @author ROG STRIX
 * @param <T>
 */
public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangun;

    public void set(T bangun) {
        this.bangun = bangun;
    }

    public T get() {
        return bangun;
    }

    public double hitungLuas() {
        return bangun.hitungluas();
    }

    public double hitungKeliling() {
        return bangun.hitungkeliling();
    }
}

