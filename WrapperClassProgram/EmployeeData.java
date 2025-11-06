
import java.util.*;
public class EmployeeData {
    public static void main(String[] args){
        int[] a={25,32,28,40,22};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:a)list.add(i);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}
