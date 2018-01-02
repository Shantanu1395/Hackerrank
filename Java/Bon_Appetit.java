//Bon Appetit
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package code;

import java.util.Scanner;

/**
 *
 * @author shantanu1395
 */
public class bon_appetite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int actual=0;
        for (int i = 0; i < n; i++){
            int var=sc.nextInt();
        if(i==k)
            continue;
        else
            actual+=var;
        }
            
        int b=sc.nextInt();
        if(b==actual/2)
            System.out.println("Bon Appetit");
        else
            System.out.println(b-actual/2);
    }
}
