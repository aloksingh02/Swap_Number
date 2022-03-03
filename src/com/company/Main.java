package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        swap(4,5);
    }
    public static void swap(int a, int b){
        int c=a;
        a = b;
        b =c;
        System.out.println("the value of a and b is "+a+" "+b);
    }
}
