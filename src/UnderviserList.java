import java.util.ArrayList;

public class UnderviserList {
    protected static ArrayList<Undervisere> UnderviserArrayList = new ArrayList<>();

    public static void add(Undervisere u){
        UnderviserArrayList.add(u);
    }

    public static ArrayList<Undervisere> getUnderviserArrayList(){
        return UnderviserArrayList;
    }
}
