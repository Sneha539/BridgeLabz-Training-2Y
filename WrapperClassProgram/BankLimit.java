
public class BankLimit {
    public static double remaining(Double limit){
        if(limit==null)return 0.0;
        return limit;
    }
    public static void main(String[] args){
        Double a=null,b=5000.0;
        System.out.println(remaining(a));
        System.out.println(remaining(b));
    }
}
