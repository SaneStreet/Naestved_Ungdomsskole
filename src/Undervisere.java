public class Undervisere extends Skole{
    private String underviserNavn;
    private String underviserTlf;

    public Undervisere(String underviserNavn, String underviserTlf) {
        this.underviserNavn = underviserNavn;
        this.underviserTlf = underviserTlf;
    }

    public String getUnderviserNavn() {
        return underviserNavn;
    }

    public void setUnderviserNavn(String underviserNavn) {
        this.underviserNavn = underviserNavn;
    }

    public String getUnderviserTlf() {
        return underviserTlf;
    }

    public void setUnderviserTlf(String underviserTlf) {
        this.underviserTlf = underviserTlf;
    }
}
