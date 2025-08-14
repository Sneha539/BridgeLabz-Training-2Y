/*Write a program that takes three numbers as input from the user and prints
their average. */

import java.util.*;

public class Ques9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double average = (a+b+c)/3;
        System.out.println(average);
    }
}