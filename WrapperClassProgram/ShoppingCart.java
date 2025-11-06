
public class ShoppingCart {
    public static void main(String[] args){
        String[] p={"250","499","abc","99"};
        int t=0;
        for(String x:p){
            try{t+=Integer.parseInt(x);}catch(Exception e){}
        }
        System.out.println(t);
    }
}
