public class Main {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Owo");
        Anabul anjing = new Anjing("Owi");
        Anabul burung = new Burung("ElManuk");
        
        Anabul[] daftarAnabul = {kucing, anjing, burung};
        
        System.out.println("Simulasi Anabul:\n");
        
        for (Anabul anabul : daftarAnabul) {
            System.out.println("Nama: " + anabul.getNama());
            anabul.bersuara();
            anabul.bergerak();
            System.out.println();
        }
    }
}