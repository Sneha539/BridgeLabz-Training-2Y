
import java.util.*;
public class CharacterCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=0,d=0,sp=0;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c))l++;
            else if(Character.isDigit(c))d++;
            else if(!Character.isWhitespace(c))sp++;
        }
        System.out.println(l+" "+d+" "+sp);
    }
}
