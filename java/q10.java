/* Write a program that takes the distance in kilometers as input from the user
and converts it into miles using the formula:
Miles = Kilometers * 0.621371.*/

import java.util.*;

public class Ques10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double dis_km = sc.nextInt();
        double dis_miles = dis_km * 0.621371;
        System.out.println(dis_miles);
    }
}