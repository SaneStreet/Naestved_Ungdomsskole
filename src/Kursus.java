public class Kursus {
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


}
