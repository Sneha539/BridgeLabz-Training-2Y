//Write a program to calculate the area of a circle. Take the radius as input and use the formula:

import java.util.*;

public class Ques4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r=sc.nextInt();
        double area=3.14 *r*r;
        System.out.println(area);
    }
}