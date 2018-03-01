public class Elever {
    private String elevNavn;
    private String elevAlder;
    private String elevTlf;

    private Elever[] elever = new Elever[20];

    public Elever(String elevNavn, String elevAlder, String elevTlf) {
        this.elevNavn = elevNavn;
        this.elevAlder = elevAlder;
        this.elevTlf = elevTlf;
    }

    public String getElevNavn() {
        return elevNavn;
    }

    public void setElevNavn(String elevNavn) {
        this.elevNavn = elevNavn;
    }

    public String getElevAlder() {
        return elevAlder;
    }

    public void setElevAlder(String elevAlder) {
        this.elevAlder = elevAlder;
    }

    public String getElevTlf() {
        return elevTlf;
    }

    public void setElevTlf(String elevTlf) {
        this.elevTlf = elevTlf;
    }
}
