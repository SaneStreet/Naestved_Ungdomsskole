import java.util.ArrayList;

public class KursusList {
    protected static ArrayList<Kursus> KursusArrayList = new ArrayList<Kursus>();

    public static void add(Kursus k){
        KursusArrayList.add(k);
    }

    public static ArrayList<Kursus> getKursusArrayList(){
        return KursusArrayList;
    }
}
