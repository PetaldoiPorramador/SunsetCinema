package objektuak;

import java.time.LocalTime;

enum AstekoEguna {
    ASTELEHENA, ASTEARTEA, ASTEAZKENA, OSTEGUNA, OSTIRALA, LARUNBATA, IGANDEA
}

public class Eguna {
    private AstekoEguna izena;
    private boolean beteta;
    private EdukiZerrenda edukiak;
    private int orduDisMax;

    private Eguna() {
        this.beteta = false;
        this.edukiak = new EdukiZerrenda();
    }

    private Eguna(AstekoEguna izena) {
        this.izena = izena;
        this.beteta = false;
        this.edukiak = new EdukiZerrenda();
        switch (this.izena) {
            case ASTELEHENA:
            case ASTEARTEA:
            case ASTEAZKENA:
                this.orduDisMax = 5;
                break;
            case OSTEGUNA:
            case OSTIRALA:
                this.orduDisMax = 6;
                break;
            case LARUNBATA:
            case IGANDEA:
                this.orduDisMax = 6;
                break;
            default:
                this.orduDisMax = -1;
                break;
        }
    }

    public void laburpena(){
        
    }

    public void edukiaGehitu(Eduki edukia) {
        this.edukiak.gehitu(edukia);
    }

    public void edukiaKendu(Eduki edukia) {
        this.edukiak.kendu(edukia);
    }

    public void edukiaEditatu(Eduki edukia) {
        this.edukiak.editatu(edukia);
    }

    public LocalTime getAzkenOrdua() {
        return LocalTime.of(orduDisMax, 0).plusMinutes(this.edukiak.getIraupenTotala());
    }

}
