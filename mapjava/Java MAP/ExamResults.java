import java.util.*;

public class ExamResults {
    public static void main(String[] args) {

        Map<String, Map<String, Integer>> data = new HashMap<>();

        Map<String, Integer> maths = new HashMap<>();
        maths.put("Riya", 92);
        maths.put("Aman", 78);
        maths.put("Karan", 88);

        Map<String, Integer> science = new HashMap<>();
        science.put("Riya", 85);
        science.put("Aman", 91);
        science.put("Karan", 67);

        Map<String, Integer> english = new HashMap<>();
        english.put("Riya", 74);
        english.put("Aman", 95);
        english.put("Karan", 89);

        data.put("Maths", maths);
        data.put("Science", science);
        data.put("English", english);

        for(String sub : data.keySet()){
            Map<String, Integer> m = data.get(sub);
            String top = null;
            int max = -1;
            for(String s : m.keySet()){
                if(m.get(s) > max){
                    max = m.get(s);
                    top = s;
                }
            }
            System.out.println("Topper in " + sub + ": " + top + " - " + max);
        }

        for(String sub : data.keySet()){
            Map<String, Integer> m = data.get(sub);
            double sum = 0;
            for(int v : m.values()){
                sum += v;
            }
            double avg = sum / m.size();
            System.out.println("Average in " + sub + ": " + avg);
        }

        System.out.println("Subjects with score above 90:");
        for(String sub : data.keySet()){
            Map<String, Integer> m = data.get(sub);
            boolean ok = false;
            for(int v : m.values()){
                if(v > 90){
                    ok = true;
                    break;
                }
            }
            if(ok){
                System.out.println(sub);
            }
        }
    }
}
