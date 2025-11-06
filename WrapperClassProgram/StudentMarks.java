
import java.util.*;
public class StudentMarks {
    public static void main(String[] args){
        Object[] m={"85",95,Integer.valueOf(88),"null"};
        ArrayList<Integer> list=new ArrayList<>();
        for(Object o:m){
            try{
                if(o==null||o.equals("null"))continue;
                list.add(Integer.valueOf(o.toString()));
            }catch(Exception e){}
        }
        double avg=list.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(avg);
    }
}
