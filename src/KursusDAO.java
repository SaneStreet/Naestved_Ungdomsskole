import java.util.ArrayList;
public interface KursusDAO {
    ArrayList<Lokale> getAllLokale();
    ArrayList<Kursus> getKursusArrayList();
    ArrayList<Elever> getEleverArrayList();
    ArrayList<Undervisere> getAllUndervisere();
    void gemElever(String Navn, String telefon);
    void indlaesElever(String Navn, String telefon);
    void sletElever(String Navn, String telefon);
}
