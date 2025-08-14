//Write a program to calculate the volume of a cylinder. Take the radius and height as inputs and use the formula:

import java.util.*;

public class Ques5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();
        double height = sc.nextInt();
        double volume = 3.14 * radius * radius * height;
        System.out.println(volume);
    }
}