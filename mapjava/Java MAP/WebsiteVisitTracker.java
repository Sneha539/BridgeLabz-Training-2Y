import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {

        Map<String, Integer> visits = new HashMap<>();

        String[] pages = {
                "home", "about", "products", "home",
                "products", "contact", "home", "products",
                "home", "about"
        };

        for(String p : pages){
            if(visits.containsKey(p)){
                visits.put(p, visits.get(p) + 1);
            } else {
                visits.put(p, 1);
            }
        }

        List<Map.Entry<String,Integer>> list = new ArrayList<>(visits.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        for(Map.Entry<String,Integer> e : list){
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        String top = null;
        int max = -1;
        for(String p : visits.keySet()){
            if(visits.get(p) > max){
                max = visits.get(p);
                top = p;
            }
        }

        System.out.println("Most visited: " + top);
    }
}
