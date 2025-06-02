/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Koleksi;


/**
 *
 * @author ROG STRIX
 */
public class Segitiga extends BangunDatar{
    private double alas, tinggi, sisiMiring;

    public Segitiga(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double hitungluas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungkeliling() {
        return alas + tinggi + sisiMiring;
    }
}
