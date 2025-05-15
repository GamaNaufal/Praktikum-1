/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KEDUA;

/**
 *
 * @author Pongo
 */
public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>();
        for (char c = 'A'; c < 'K'; c++) {
            koleksiKarakter.add(c);
        }
        koleksiKarakter.showAll();
    }
}
