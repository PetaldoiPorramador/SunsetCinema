

import java.util.ArrayList;

public class EdukiZerrenda {

    private ArrayList<Eduki> edukiak;

    public EdukiZerrenda() {
        this.edukiak = new ArrayList<Eduki>();
    }

    public int getIraupenOsoa() {
        int totala = 0;
        for (Eduki edukia : edukiak) {
            totala += edukia.getIraupena();
        }
        return totala;
    }

    public void sartuEdukia(Eduki edukia) {
        if (sartuDauiteke(edukia)) {
            edukiak.add(edukia);
        }
    }

    private boolean sartuDauiteke(Eduki edukia) {
        for (Eduki eduki : edukiak) {
            if (eduki.generoTituluaKonparatu(edukia)) {
                return false;
            }
        }
        return true;
    }

    public void ezabatuById(int id) {
        for (Eduki edukia : edukiak) {
            if (edukia.getId() == id) {
                this.edukiak.remove(edukia);
                break;
            }
        }
    }

    public void editatu(Eduki edukia) {
        int i = 0;
        for (Eduki eduki : edukiak) {
            if (eduki.equals(edukia)) {
                edukiak.set(i, edukia);
                break;
            }
            i++;
        }
    }
    
}
