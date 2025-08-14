//Write a program that takes the temperature in Celsius as input and converts it to Fahrenheit using the formula:

import java.util.*;

public class Ques3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextInt();
        float feh = (temp *9/5)+32;
        System.out.println(feh);
    }
}