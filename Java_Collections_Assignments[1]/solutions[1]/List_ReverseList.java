
import java.util.*;
public class List_ReverseList {
    // Reverse a list without using built-in reverse methods
    public static <T> List<T> reverseList(List<T> input) {
        List<T> result = new ArrayList<>(input.size());
        for (int i = input.size() - 1; i >= 0; i--) result.add(input.get(i));
        return result;
    }
    public static void main(String[] args){
        List<Integer> a = Arrays.asList(1,2,3,4,5);
        System.out.println("Input: " + a);
        System.out.println("Reversed: " + reverseList(a));
    }
}
