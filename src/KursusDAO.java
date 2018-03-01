import java.util.List;
public interface KursusDAO {
    public void gemElever(String Navn, String telefon);
    public void indlæsElever(String Navn, String telefon);
    public List<Lokale> getAllLokale();
}
