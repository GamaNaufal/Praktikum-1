public class MataKuliah {
    //atribut
    private String idMatKul;
    private Integer SKS;

    //konstruktor
    public MataKuliah(){
        this.idMatKul = "";
        this.SKS = 0;
    }

    public MataKuliah(String idMatkul, Integer SKS){
        this.idMatKul = idMatkul;
        this.SKS = SKS;   
    }

    //selektor
    public String getIDMatkul(){
        return idMatKul;
    }

    public Integer getSKS(){
        return SKS;
    }

    //mutator
    public void setIDMatkul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setSKS(Integer SKS){
        this.SKS = SKS;
    }
}
