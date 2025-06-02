/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum8;

/**
 *
 * @author ROG STRIX
 */
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<>();
        
        // nambahin elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        
        // hapus elemen
        strings.remove("praktikum");
        
        for(String s : strings){
            System.out.println(s+" ");
        }
    }
}
