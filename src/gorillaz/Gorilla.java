package gorillaz;

/**
 *
 * @author soola
 */

public class Gorilla {
    private String nev;
    private int kor;
    private double suly;
    private String nem;
    private int kolykok;
    
    public Gorilla(){}

    public Gorilla(String nev, int kor, double suly, String nem, int kolykok) {
        this.nev = nev;
        this.kor = kor;
        this.suly = suly;
        this.nem = nem;
        this.kolykok = kolykok;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public double getSuly() {
        return suly;
    }

    public String getNem() {
        return nem;
    }

    public int getKolykok() {
        return kolykok;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setSuly(double suly) {
        this.suly = suly;
    }

    public void setNem(String nem) {
        this.nem = nem;
    }

    public void setKolykok(int kolykok) {
        this.kolykok = kolykok;
    }

    @Override
    public String toString() {
        return "Név: " + nev + ", kor: " + kor + ", súly: " + suly + ", nem: " + nem + ", Kölykök száma: " + kolykok;
    }
    
}
