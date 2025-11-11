import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String s = "Java is fun and Java is powerful";
        s = s.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = s.split("\\s+");

        Map<String, Integer> freq = new HashMap<>();

        for(String w : words){
            if(freq.containsKey(w)){
                freq.put(w, freq.get(w) + 1);
            } else {
                freq.put(w, 1);
            }
        }

        for(String w : freq.keySet()){
            System.out.println(w + " : " + freq.get(w));
        }
    }
}
