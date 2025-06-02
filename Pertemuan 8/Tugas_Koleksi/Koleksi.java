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
public class Koleksi<T> {
    private int nbelm;
    private T[] wadah;

    public Koleksi(int kapasitas) {
        wadah = (T[]) new Object[kapasitas];
        nbelm = 0;
    }

    public T getIsi(int index) {
        return wadah[index];
    }

    public void setIsi(int index, T elemen) {
        wadah[index] = elemen;
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        this.nbelm = size;
    }

    public void add(T elemen) {
        if (nbelm < wadah.length) {
            wadah[nbelm++] = elemen;
        } else {
            System.out.println("Koleksi penuh!");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            for (int i = index; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[--nbelm] = null;
        }
    }

    public void showAll() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println(wadah[i]);
        }
    }
    
    
}
