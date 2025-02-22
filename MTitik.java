/* Nama File : MTitik.java
 * Deskripsi : Berisi aplikasi file MTitik.java
 * Pembuat : Gama Naufal A / 24060123120015
 * Tanggal : Selasa, 18 Februari 2025
 */

 public class MTitik {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Titik==========");
        // Membuat titik T1
        System.out.println("Titik T1:");
        Titik T1 = new Titik();
        Titik T2 = new Titik(1,3);
        Titik T3 = T2;
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        System.out.println("Titik T2:");
        T2.printTitik();
        System.out.println("Titik T3:");
        T3.printTitik();
        Titik.printCounterTitik();
        System.out.println("Kuadran titik T1 adalah = "+ T1.getKuadran());
        System.out.println("Jarak titik T1 ke pusat adalah = "+ T1.getJarakPusat());
        System.out.println("Kuadran titik T1 adalah = "+ T1.getKuadran());
        System.out.println("Jarak T1 ke T3 adalah = "+ T1.getJarak(T3));
        Titik X = T1.getRefleksiX();
        X.printTitik();
        Titik Y = T1.getRefleksiY();
        Y.printTitik();
    }
}