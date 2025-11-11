import java.util.*;

public class CourseRegistrationSystem {
    public static void main(String[] args) {

        Map<String, Integer> reg = new HashMap<>();
        reg.put("CS101", 48);
        reg.put("CS102", 10);
        reg.put("CS103", 3);
        reg.put("CS104", 55);
        reg.put("CS105", 2);

        reg.put("CS101", reg.get("CS101") + 3);
        reg.put("CS103", reg.get("CS103") - 2);
        if(reg.get("CS103") < 0) reg.put("CS103", 0);
        reg.put("CS105", reg.get("CS105") + 6);

        System.out.println("Near full:");
        for(String c : reg.keySet()){
            if(reg.get(c) >= 50){
                System.out.println(c + " : " + reg.get(c));
            }
        }

        System.out.println("Under-subscribed:");
        for(String c : reg.keySet()){
            if(reg.get(c) < 5){
                System.out.println(c + " : " + reg.get(c));
            }
        }
    }
}
