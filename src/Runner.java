import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Benji");
        names.add("Andy");
        String[] moreNames = {"Crystal", "Monica", "Toby"};
        int lengths =  names.size() + moreNames.length + names.get(0).length() + moreNames[1].length();
        System.out.println(lengths);

    }

}