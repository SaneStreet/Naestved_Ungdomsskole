public class Undervisere {
    private String underviserNavn;
    private String underviserTlf;

    public Undervisere(String underviserNavn, String underviserTlf) {
        this.underviserNavn = underviserNavn;
        this.underviserTlf = underviserTlf;
        UnderviserList.add(this);
    }

    //Get n' Set Underviser Navn
    public String getUnderviserNavn() {
        return underviserNavn;
    }

    public void setUnderviserNavn(String underviserNavn) {
        this.underviserNavn = underviserNavn;
    }

    //Get n' Set Underviser Telefon
    public String getUnderviserTlf() {
        return underviserTlf;
    }

    public void setUnderviserTlf(String underviserTlf) {
        this.underviserTlf = underviserTlf;
    }
}
