package gorillaz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author soola
 */

public class Gorillak {
    private List<Gorilla> GorillaLista;
    public Gorillak(String fajl){
        this.GorillaLista = new ArrayList<Gorilla>();
        try {
            FileReader fr = new FileReader(fajl);
            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            String sor = br.readLine();
            String[] adat;
            while(sor != null){
                adat = sor.split(";");
                this.GorillaLista.add(new Gorilla(adat[0],Integer.parseInt(adat[1]),Double.parseDouble(adat[2]),adat[3],Integer.parseInt(adat[4])));
                sor = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
    }
    public void GorillaListaKiir(){
        for (Gorilla i : GorillaLista) {
            System.out.println(i);
        }
    }
    public int HanyNosteny(){
        int x = 0;
        for (int i = 0; i < GorillaLista.size(); i++) {
            if ("nosteny".equals(GorillaLista.get(i).getNem())) {
                x++;
            }
        }
        return x;
    }
     public void Parositas(){
        Collections.sort(GorillaLista, Comparator.comparingInt((utod) -> utod.getKolykok()));
        for (int i = 0; i < GorillaLista.size()-1; i++) {
            if (this.GorillaLista.get(i).getKolykok() == this.GorillaLista.get(i+1).getKolykok() && this.GorillaLista.get(i).getKolykok() > 0) {
                System.out.println(this.GorillaLista.get(i).getNev() + " és " + this.GorillaLista.get(i+1).getNev());
            }
        }
    }
    public int HimekKolykeinekSzama(){
        int x = 0;
        for (int i = 0; i < GorillaLista.size(); i++) {
            if ("him".equals(GorillaLista.get(i).getNem())) {
                x += GorillaLista.get(i).getKolykok();
            }
        }
        return x;
    }
    public List<Gorilla> RendezesEletkorNov(){
        Collections.sort(GorillaLista, Comparator.comparingInt((gorillak) -> gorillak.getKor()));
        return this.GorillaLista;
    }
    public void FajlbaIr(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("him.txt"));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("nosteny.txt"));
            for (int i = 0; i < GorillaLista.size(); i++) {
                if ("him".equals(GorillaLista.get(i).getNem())) {
                        String content = GorillaLista.get(i).getNev()+";"+GorillaLista.get(i).getKor()+";"+GorillaLista.get(i).getSuly()+";"+GorillaLista.get(i).getKolykok();
                        bw.write(content);
                        bw.newLine();
                }
                else{
                    if ("nosteny".equals(GorillaLista.get(i).getNem())) {
                        String content = GorillaLista.get(i).getNev()+";"+GorillaLista.get(i).getKor()+";"+GorillaLista.get(i).getSuly()+";"+GorillaLista.get(i).getKolykok();
                        bw2.write(content);
                        bw2.newLine();
                    }
                }
            }
            bw.close();
            bw2.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
