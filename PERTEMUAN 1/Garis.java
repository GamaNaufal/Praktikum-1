/* Nama File : Garis.java
 * Deskripsi : Berisi atribut dan method dalam class Garis
 * Pembuat : Gama Naufal A / 24060123120015
 * Tanggal : Sabtu, 22 Februari 2025
 */


public class Garis {
    //Atribut
    Titik T1;
    Titik T2;
    static int CounterGaris = 0;

    //Method
    static int getCounterGaris(){
        return CounterGaris;
    }

    //Konstruktor
    Garis(Titik T1, Titik T2){
        this.T1 = T1;
        this.T2 = T2;
        CounterGaris ++;
    }

    //Mengembalikan nilai T1
    Titik getT1Garis(){
        return this.T1;
    }

    //Mengembalikan nilai T2
    Titik getT2Garis(){
        return this.T2;
    }

    //Mengubah T1 pada garis
    void setT1Garis(Titik T1){
        this.T1 = T1;
    }

    //Mengubah T2 pada garis
    void setT2Garis(Titik T2){
        this.T2 = T2;
    }

    //Mengembalikan nilai panjang garis
    double getPanjangGaris(){
        return Math.sqrt(Math.pow(T1.getAbsis() - T2.getAbsis(), 2) + Math.pow(T1.getOrdinat() - T2.getOrdinat(), 2));
    }

    //Mengembalikan nilai gradien garis
    double getGradienGaris(){
        if (T1.getAbsis() - T2.getAbsis() == 0){
            System.out.println("Gradien tidak terdefinisi");
            return Double.NaN;
        } else {
            return (T1.getOrdinat() - T2.getOrdinat()) / (T1.getAbsis() - T2.getAbsis());
        }
    }

    //Mengembalikan titik yang berada di tengah garis
    Titik getTengahGaris(){
        return new Titik((T1.getAbsis() + T2.getAbsis()) / 2.0, (T1.getOrdinat() + T2.getOrdinat()) / 2.0);
    }

    //Mengecek apakah dua garis sejajar
    boolean isSejajar(Garis G1,Garis G2){
        return G1.getGradienGaris() == G2.getGradienGaris();
    }

    //Mengecek apakah dua garis tegak lurus
    boolean isTegakLurus(Garis G1, Garis G2){
        return (G1.getGradienGaris() * G2.getGradienGaris()) == -1;
    }

    //Menampilkan titik awal dan akhr garis
    void PrintTGaris(){
        System.out.println("Titik awal (" + T1.getAbsis() + "," + T1.getAbsis() + "), Titik akhir (" + T2.getAbsis() + ", " + T2.getOrdinat() + ")");
    }

    //Menampilkan persamaan garis
    void PrintPersGaris(){
        System.out.println("y = "+ T1.getAbsis() +"x + "+ T2.getOrdinat() +"");
    }
}
