public class Kursus extends Skole {
    private String kursusNavn;
    private String kursusInfo;
    private String kursusFag;
    

    public Kursus(String kursusNavn, String kursusInfo, String kursusFag) {
        this.kursusNavn = kursusNavn;
        this.kursusInfo = kursusInfo;
        this.kursusFag = kursusFag;
    }

    public String getKursusNavn() {
        return kursusNavn;
    }

    public void setKursusNavn(String kursusNavn) {
        this.kursusNavn = kursusNavn;
    }

    public String getKursusInfo() {
        return kursusInfo;
    }

    public void setKursusInfo(String kursusInfo) {
        this.kursusInfo = kursusInfo;
    }

    public String getKursusFag() {
        return kursusFag;
    }

    public void setKursusFag(String kursusFag) {
        this.kursusFag = kursusFag;
    }

    //private int antalElever;
    //private String underviserNavn;
    //private String kursusLokale;



    private Lokale[] lokaler = new Lokale[10];

    public Kursus(){
        Lokale lokale1 =  new Lokale("lokale1");
        Lokale lokale2 =  new Lokale("lokale2");
        Lokale lokale3 =  new Lokale("lokale3");
        Lokale lokale4 =  new Lokale("lokale4");
        Lokale lokale5 =  new Lokale("lokale5");
        Lokale lokale6 =  new Lokale("lokale6");
        Lokale lokale7 =  new Lokale("lokale7");
        Lokale lokale8 =  new Lokale("lokale8");
        Lokale lokale9 =  new Lokale("lokale9");
        Lokale lokale10 = new Lokale("lokale10");
    }
}
