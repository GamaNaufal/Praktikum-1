package Generic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pongo
 */
public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    //Getter
    public String getNama() {
        return nama;
    }

    //Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Mutator
    public void ubahNama(String namaBaru) {
        System.out.println("Mengubah nama " + this.nama + " menjadi " + namaBaru);
        this.nama = namaBaru;
    }

    public abstract void bersuara();
    public abstract void bergerak();
}