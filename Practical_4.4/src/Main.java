import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> namelist = new ArrayList<>();
        namelist.add("Tafsir");
        namelist.add("Mohit");
        namelist.add("Bappi");
        namelist.add("Shuvendu");
        for(String name : namelist){
            System.out.println(name);
        }
        TreeSet<String> nameset = new TreeSet<>();
        nameset.add("Tafsir");
        nameset.add("Mohit");
        nameset.add("Bappi");
        nameset.add("Shuvendu");
        for(String name : nameset){
            System.out.println(name);
        }
    }
}