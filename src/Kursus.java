public class Kursus {
    private String kursusNavn;
    private String kursusInfo;


    public Kursus(String kursusNavn, String kursusInfo) {
        this.kursusNavn = kursusNavn;
        this.kursusInfo = kursusInfo;
        KursusList.add(this);
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

}
