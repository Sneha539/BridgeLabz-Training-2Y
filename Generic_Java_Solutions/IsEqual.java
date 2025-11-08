public class IsEqual {
    public static <T> boolean isEqual(T a, T b){
        if (a==null) return b==null;
        return a.equals(b);
    }
    public static void main(String[] args){
        System.out.println(isEqual("hi","hi")); // true
        System.out.println(isEqual(10, 20)); // false
        System.out.println(isEqual(null, null)); // true
    }
}
