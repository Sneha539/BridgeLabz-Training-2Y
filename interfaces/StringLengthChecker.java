import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> getLength = s -> s.length();
        String msg = "Functional interface example";
        int len = getLength.apply(msg);
        if (len > 20)
            System.out.println("Message too long");
        else
            System.out.println("Message length ok");
    }
}
