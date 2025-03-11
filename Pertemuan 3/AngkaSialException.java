/*
 * File         : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, mnolak masukan angka 13
 *                
 */
public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan masukkan angka 13 karena angka sial!!!");
    }
}
