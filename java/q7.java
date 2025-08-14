/* Write a program to calculate the perimeter of a rectangle. Take the length
and width as inputs and use the formula:*/

import java.util.*;

public class Ques7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double length = sc.nextInt();
        double width = sc.nextInt();
        double Perimeter =  2 * (length + width);
        System.out.println(Perimeter);
    }
}