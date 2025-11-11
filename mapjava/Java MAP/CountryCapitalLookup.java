import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("India", "New Delhi");
        map.put("USA", "Washington DC");
        map.put("Japan", "Tokyo");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("Italy", "Rome");
        map.put("Canada", "Ottawa");
        map.put("Brazil", "Brasilia");

        String input = "Japan";
        if(map.containsKey(input)){
            System.out.println(map.get(input));
        } else {
            System.out.println("Unknown country");
        }

        TreeMap<String,String> sorted = new TreeMap<>(map);
        for(String c : sorted.keySet()){
            System.out.println(c + " : " + sorted.get(c));
        }
    }
}
