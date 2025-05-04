/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMedium;

/**
 *
 * @author Pongo
 */
public class TestSenjata {
    public static void main(String[] args) {
        Senjata ShotgunJamsut = new Senjata("TAR");
        Senjata ShotgunKocok = new Senjata("DOR");

        KontrolSenjata kontrolA = new KontrolSenjata(ShotgunJamsut);
        KontrolSenjata kontrolB = new KontrolSenjata(ShotgunKocok);
        
        kontrolA.isiPeluru(5);
        kontrolA.menembak(6);
        kontrolA.isiPeluru(5);
        kontrolA.menembak(5);

        System.out.println("===========================");
        
        kontrolB.isiPeluru(7);
        kontrolB.menembak(4);
        kontrolB.isiPeluru(2);
        kontrolB.menembak(5);
    }
}