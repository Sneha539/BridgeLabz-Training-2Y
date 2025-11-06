
public class SafeParseInt {
    public static int safeParseInt(String input){
        try{return Integer.parseInt(input);}catch(Exception e){return -1;}
    }
    public static void main(String[] args){
        String[] s={"123","abc","45.6","0"};
        for(String i:s)System.out.println(safeParseInt(i));
    }
}
