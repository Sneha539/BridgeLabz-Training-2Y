import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CopyList {
    public static void copyList(List<? super Number> dest, List<? extends Number> src){
        for(Number n: src) dest.add(n);
    }
    public static void main(String[] args){
        List<Number> dest = new ArrayList<>();
        List<Integer> src = Arrays.asList(1,2,3);
        copyList(dest, src);
        System.out.println(dest);
        List<Object> dest2 = new ArrayList<>();
        copyList(dest2, Arrays.asList(4.5,5.5));
        System.out.println(dest2);
    }
}
