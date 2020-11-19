package Kwiatek;

public class Kwiatek {
    String nazwa;
    String nazwaLacinska;
    String kolorPlatkow;
    String kolorLisci = "Zielony";
    String rzadkoscWystepowania;

    boolean czyTrujacy;

    public Kwiatek(String nazwa, String nazwaLacinska, String kolorPlatkow, String rzadkoscWystepowania, boolean czyTrujacy){
        this.nazwa = nazwa;
        this.nazwaLacinska = nazwaLacinska;
        this.kolorPlatkow = kolorPlatkow;
        this.rzadkoscWystepowania = rzadkoscWystepowania;
        this.czyTrujacy = czyTrujacy;
        System.out.println("Utworzylismy wlasnie kwiatek: ");
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setNazwaLacinska(String nazwaLacinska) {
        this.nazwaLacinska = nazwaLacinska;
    }

    public void setKolorPlatkow(String kolorPlatkow) {
        this.kolorPlatkow = kolorPlatkow;
    }

    public void setKolorLisci(String kolorLisci) {
        this.kolorLisci = kolorLisci;
    }

    public void setRzadkoscWystepowania(String rzadkoscWystepowania) {
        this.rzadkoscWystepowania = rzadkoscWystepowania;
    }

    public void setCzyTrujacy(boolean czyTrujacy) {
        this.czyTrujacy = czyTrujacy;
    }
}