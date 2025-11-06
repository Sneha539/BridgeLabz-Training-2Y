
public class AgeValidator {
    public static boolean check(String age){
        try{int a=Integer.parseInt(age);return a>=18;}catch(Exception e){return false;}
    }
    public static void main(String[] args){
        System.out.println(check("20"));
        System.out.println(check("abc"));
        System.out.println(check("17"));
    }
}
