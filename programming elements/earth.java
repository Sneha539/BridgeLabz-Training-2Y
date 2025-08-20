public class Earth{
    public static void main(String[] args) {
        int radius = 6378;
        float  pi = 22 / 7;
        float volume = (4/3)*pi*radius*radius*radius;
        float volumeMile = volume * 0.239913f;
        System.out.println("The volume of earth in cubic kilometers is"+ volume +" and cubic miles is"+volumeMile );

        
    }
}