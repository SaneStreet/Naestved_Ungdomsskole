public class Elever {
    private String elevFornavn;
    private String elevEfternavn;
    private String elevKlasse;
    private int elevAlder;
    private String loginNavn;
    private String loginPass;

    public Elever(String elevFornavn, String elevEfternavn, String elevKlasse, int elevAlder) {
        this.elevFornavn = elevFornavn;
        this.elevEfternavn = elevEfternavn;
        this.elevKlasse = elevKlasse;
        this.elevAlder = elevAlder;
        EleverList.add(this);
    }

    //Get n' Set Elevens Fornavn
    public String getElevFornavn() {
        return elevFornavn;
    }
    public void setElevFornavn(String elevFornavn) {
        this.elevFornavn = elevFornavn;
    }

    //Get n' Set Elevens Efternavn
    public String getElevEfternavn() {
        return elevEfternavn;
    }
    public void setElevEfternavn(String elevEfternavn) {
        this.elevEfternavn = elevEfternavn;
    }

    //Get n' Set Elevens Klasse
    public String getElevKlasse() {
        return elevKlasse;
    }
    public void setElevKlasse(String elevKlasse) {
        this.elevKlasse = elevKlasse;
    }

    //Get n' Set Elevens Alder
    public int getElevAlder() {
        return elevAlder;
    }
    public void setElevAlder(int elevAlder) {
        this.elevAlder = elevAlder;
    }

    //Get n' Set Login Navn
    public String getLoginNavn() {
        return loginNavn;
    }
    public void setLoginNavn(String loginNavn) {
        this.loginNavn = loginNavn;
    }

    //Get n' Set Login Password
    public String getLoginPass() {
        return loginPass;
    }
    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }

}
