public class Dosen {
    //atribut 
    private String NIP;
    private String nama;
    private String prodi;
    
    //konstruktor
    public Dosen(){
        this.NIP = "";
        this.nama = "";
        this.prodi = "";
    }

    public Dosen(String NIP, String nama, String prodi){
        this.NIP = NIP;
        this.nama = nama;
        this.prodi = prodi;
    }

    //selektor
    public String getNIP(){
        return NIP;
    }

    public String getnama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    //mutator
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}

