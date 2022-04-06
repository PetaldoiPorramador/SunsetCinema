package objektuak;

import java.util.ArrayList;

public class EdukiZerrenda {

    private ArrayList<Eduki> edukiak;

    public EdukiZerrenda() {
        this.edukiak = new ArrayList<Eduki>();
    }

    public int getIraupenTotala() {
        int totala = 0;
        for (Eduki edukia : edukiak) {
            totala += edukia.getIraupena();
        }
        return totala;
    }
    
}
