public class Lokale {
    private String lokalenr;

    public Lokale(String lokalenr) {
        this.lokalenr = lokalenr;
        LokaleList.add(this);
    }

    //Get n' Set Lokale nummer
    public String getLokalenr() {
        return lokalenr;
    }

    public void setLokalenr(String Lokale) {
        this.lokalenr = lokalenr;
    }
}
