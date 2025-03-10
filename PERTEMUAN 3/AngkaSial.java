public class AngkaSial {
    public void cobaAngka (int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// Baris 4 tidak akan dieksekusi ketika eksepsi terjadi. 
// Baris ini hanya akan dieksekusi jika kondisi pada baris 3 (if(angka==13)) tidak terpenuhi, yaitu ketika angka tidak sama dengan 13. 
// Jika angka adalah 13, maka eksepsi akan dilempar pada baris 4, dan eksekusi program akan langsung melompat ke blok catch, sehingga baris 3 tidak akan dieksekusi.

// Baris 14 akan dieksekusi ketika eksepsi terjadi. 
// Baris ini berada di dalam blok catch, yang akan dieksekusi ketika eksepsi AngkaSialException terjadi. 
// Ketika eksepsi terjadi, program akan melompat ke blok catch dan mengeksekusi kode di dalamnya, termasuk baris 14.