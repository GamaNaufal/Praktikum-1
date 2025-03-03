public class Kendaraan {
    //atribut
    private String noPlat;
    private String Jenis;

    //konstruktor
    public Kendaraan(){
        this.noPlat = "";
        this.Jenis = "";
    }

    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;  
    }

    //selektor
    public String getNOPlat(){
        return noPlat;
    }

    public String getJenis(){
        return Jenis;
    }

    //mutator
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setSKS(String Jenis){
        this.Jenis = Jenis;
    }
}
