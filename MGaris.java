/* Nama File : MGaris.java
 * Deskripsi : Berisi aplikasi file MGaris.java
 * Pembuat : Gama Naufal A / 24060123120015
 * Tanggal : Sabtu, 22 Februari 2025
 */


public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(2,6); 
        Titik T2 = new Titik(2,1);
        Garis G1 = new Garis(T1,T2);
        Garis G2 = G1;
        Titik T3 = new Titik(2,8);
        G1.PrintTGaris();
        G1.setT1Garis(new Titik(4, 16));
        G1.PrintTGaris(); 
        G1.setT2Garis(T3);
        G1.PrintTGaris();
        System.out.println("Panjang garis :" + G1.getPanjangGaris());
        System.out.println("Gradien garis :" + G1.getGradienGaris());
        System.out.println("Titik tengah garis :" + G1.getTengahGaris());
        System.out.println("Apakah garis G1 dan G2 sejajar? : " + G1.isSejajar(G1,G2));
        System.out.println("Apakah garis G1 dan G2 saling Tegak Lurus? : " + G1.isTegakLurus(G1,G2));
        G1.PrintPersGaris();
    }
}
