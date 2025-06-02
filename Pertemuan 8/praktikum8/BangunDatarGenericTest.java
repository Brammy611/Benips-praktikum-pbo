/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum8;

/**
 *
 * @author ROG STRIX
 */
public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran L1 = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<>();
        
        bdg.set(L1);
        System.out.println("Keliling lingkaran : " + bdg.hitungkeliling());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());
    }
    
}
