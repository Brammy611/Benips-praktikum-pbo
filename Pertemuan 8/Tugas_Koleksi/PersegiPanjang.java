/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Koleksi;


/**
 *
 * @author ROG STRIX
 */
public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double x, double y){
        this.panjang = x;
        this.lebar = y;
    }
    
    @Override
    public double hitungkeliling(){
        return (2*panjang) + (2*lebar);
    }

    @Override
    public double hitungluas() {
        return panjang * lebar;
    }
}
