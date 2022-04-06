

import java.io.*;

public class LaburMe extends Eduki{
    private String fabula;

    public LaburMe() {
    }

    public LaburMe(int id, String titulua, int iraupena, String fabula) {
        super(id, titulua, iraupena);
        this.fabula = fabula;
    }

    public String getFabula() {
        return fabula;
    }

    public void setFabula(String fabula) {
        this.fabula = fabula;
    }

    public void getCSV() throws IOException {
        File fitxCSV = new File("../../../../datuak/Pelikulak1.csv");
        FileReader fr = new FileReader(fitxCSV);
        BufferedReader br = new BufferedReader(fr);

        String lerroa;
        String emaitza="";
        while ((lerroa=br.readLine())!=null) {
            if(lerroa=="LaburMetraia;"+super.getId()+";"+super.getTitulua()+";"+super.getIraupena()+";"+fabula+";;;;"){
                emaitza+="LaburMetraia;"+super.getId()+";"+super.getTitulua()+";"+super.getIraupena()+";"+fabula+";;;;\n";
            }
        }

        System.out.println(emaitza);
        br.close();
    }
}
