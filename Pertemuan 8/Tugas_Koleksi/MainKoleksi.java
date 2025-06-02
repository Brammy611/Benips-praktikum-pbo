/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Koleksi;

/**
 *
 * @author ROG STRIX
 */
public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> karakterKoleksi = new Koleksi<>(10);

        for (char c = 'A'; c < 'K'; c++) {
            karakterKoleksi.add(c);
        }

        System.out.println("Isi koleksi karakter:");
        karakterKoleksi.showAll();
    }
}

