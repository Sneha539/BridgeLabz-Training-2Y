import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {

        Map<String, Double> bank = new HashMap<>();
        bank.put("AC101", 45000.0);
        bank.put("AC102", 32000.0);
        bank.put("AC103", 78000.0);
        bank.put("AC104", 15000.0);
        bank.put("AC105", 90000.0);
        bank.put("AC106", 21000.0);

        String acc = "AC102";
        bank.put(acc, bank.get(acc) + 5000);

        acc = "AC104";
        double amt = 18000;
        if(bank.get(acc) >= amt){
            bank.put(acc, bank.get(acc) - amt);
        } else {
            System.out.println("Insufficient balance for " + acc);
        }

        List<Map.Entry<String, Double>> list = new ArrayList<>(bank.entrySet());
        list.sort((a,b) -> Double.compare(b.getValue(), a.getValue()));

        for(Map.Entry<String, Double> e : list){
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println("Top 3 customers:");
        for(int i=0; i<3 && i<list.size(); i++){
            Map.Entry<String, Double> e = list.get(i);
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
