/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KEDUA;

/**
 *
 * @author Pongo
 */
import java.util.ArrayList;

public class Koleksi<T> {
    private ArrayList<T> wadah;
    private int nbelm;

    public Koleksi() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    public T getIsi(int index) {
        return wadah.get(index);
    }

    public void setIsi(int index, T value) {
        wadah.set(index, value);
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        this.nbelm = size;
    }

    public void add(T item) {
        wadah.add(item);
        nbelm++;
    }

    public void delete(int index) {
        if (index >= 0 && index < wadah.size()) {
            wadah.remove(index);
            nbelm--;
        }
    }

    public void showAll() {
        for (T item : wadah) {
            System.out.println(item);
        }
    }
}