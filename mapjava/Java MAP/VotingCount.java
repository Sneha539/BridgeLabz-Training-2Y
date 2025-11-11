import java.util.*;

public class VotingCount {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        String[] castedVotes = {
            "Riya", "Aman", "Riya", "Karan", "Aman",
            "Riya", "Karan", "Aman", "Aman", "Riya"
        };

        for(String c : castedVotes){
            if(votes.containsKey(c)){
                votes.put(c, votes.get(c) + 1);
            } else {
                votes.put(c, 1);
            }
        }

        String top = null;
        int max = -1;
        for(String name : votes.keySet()){
            int v = votes.get(name);
            if(v > max){
                max = v;
                top = name;
            }
        }

        System.out.println("Winner: " + top);
        System.out.println("All votes:");
        for(String name : votes.keySet()){
            System.out.println(name + " : " + votes.get(name));
        }
    }
}
