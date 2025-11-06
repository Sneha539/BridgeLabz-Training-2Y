
public class WrapperToPrimitiveConversion {
    public static void main(String[] args){
        Double d=45.67;
        double x=d;
        int y=(int)d.doubleValue();
        System.out.println(x);
        System.out.println(y);
    }
}
