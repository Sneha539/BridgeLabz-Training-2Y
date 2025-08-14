//Write a program that takes two numbers as input from the user and prints their sum.

import java.util.*;

public class Ques2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum =" + sum);
    }
}