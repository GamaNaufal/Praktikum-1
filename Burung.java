class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " suaranya Cukurukuk");
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }
}