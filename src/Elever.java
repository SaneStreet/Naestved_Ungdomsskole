public class Elever extends Skole {
    private String elevFornavn;
    private String elevEfternavn;
    private String elevKlasse;
    private String elevAlder;

    public Elever(String elevFornavn, String elevEfternavn, String elevKlasse, String elevAlder) {
        this.elevFornavn = elevFornavn;
        this.elevEfternavn = elevEfternavn;
        this.elevKlasse = elevKlasse;
        this.elevAlder = elevAlder;
    }

    public String getElevFornavn() {
        return elevFornavn;
    }

    public void setElevFornavn(String elevFornavn) {
        this.elevFornavn = elevFornavn;
    }

    public String getElevEfternavn() {
        return elevEfternavn;
    }

    public void setElevEfternavn(String elevEfternavn) {
        this.elevEfternavn = elevEfternavn;
    }

    public String getElevKlasse() {
        return elevKlasse;
    }

    public void setElevKlasse(String elevKlasse) {
        this.elevKlasse = elevKlasse;
    }

    public String getElevAlder() {
        return elevAlder;
    }

    public void setElevAlder(String elevAlder) {
        this.elevAlder = elevAlder;
    }

}
