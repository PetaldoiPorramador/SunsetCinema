package objektuak;

public class Pelikula extends LargoMe{
    private String generoa;
    private Pegi pegi;
    
    public Pelikula() {
    }

    public Pelikula(int id, String titulua, int iraupena, String generoa, Pegi pegi) {
        super(id, titulua, iraupena);
        this.generoa = generoa;
        this.pegi = pegi;
    }

    public String getGeneroa() {
        return generoa;
    }

    public void setGeneroa(String generoa) {
        this.generoa = generoa;
    }

    public Pegi getPegi() {
        return pegi;
    }

    public void setPegi(Pegi pegi) {
        this.pegi = pegi;
    }

    public void getCSV() {

    }

    public boolean gehituDaiteke() {
        return true;
    }
}
