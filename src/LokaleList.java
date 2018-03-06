import java.util.ArrayList;

public class LokaleList {
    protected static ArrayList<Lokale> LokaleArrayList = new ArrayList<>();

    public static void add(Lokale l){
        LokaleArrayList.add(l);
    }

    public static ArrayList<Lokale> getLokaleArrayList(){
        return LokaleArrayList;
    }
}
