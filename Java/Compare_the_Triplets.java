//Compare the Triplets
import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a0 = sc.nextInt();
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b0 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int a=0,b=0;
        if(a0>b0)
            a++;
        else if(a0<b0)
            b++;
        if(a1>b1)
            a++;
        else if(a1<b1)
            b++;
        if(a2>b2)
            a++;
        else if(a2<b2)
            b++;
        System.out.println(a+" "+b);
    }
}