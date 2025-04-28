abstract class Anabul {
    protected String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }

    //Method    
    public abstract void bersuara();
    public abstract void bergerak();
    
    public String getNama() {
        return nama;
    }
}