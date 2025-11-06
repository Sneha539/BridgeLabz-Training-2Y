
public class GameScoreboard {
    public static void main(String[] args){
        Integer[] s={10,null,20,30,null};
        int c=0,t=0;
        for(Integer i:s){
            if(i==null)c++;else t+=i;
        }
        System.out.println(c+" "+t);
    }
}
