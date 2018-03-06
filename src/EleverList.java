import java.util.ArrayList;

public class EleverList {
    protected static ArrayList<Elever> EleverArrayList = new ArrayList<>();

    public static void add(Elever k){
        EleverArrayList.add(k);
    }

    public static ArrayList<Elever> getEleverArrayList(){
        return EleverArrayList;
    }
}
