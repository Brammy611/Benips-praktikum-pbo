/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Koleksi;
/**
 *
 * @author ROG STRIX
 */
public class Persegi extends BangunDatar{
    private double sisi;
    
    public Persegi(double x){
        this.sisi = x;
    }
    
    @Override
    public double hitungkeliling(){
        return 4*sisi;
    }

    @Override
    public double hitungluas() {
        return sisi*sisi;
    }
}
