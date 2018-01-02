//Apple and Orange
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
public class apple_orange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt(),t=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),m=sc.nextInt(),n=sc.nextInt(),apples=0,oranges=0;
        int arra[]=new int[m];
        int arro[]=new int[n];
        
        for (int i = 0; i < m; i++){
        int x=sc.nextInt();
        if((a+x)>=s && (a+x)<=t)
            apples++;
        }
        
        for (int i = 0; i < n; i++){
        int x=sc.nextInt();
        if((b+x)>=s && (b+x)<=t)
            oranges++;
        } 
        
        System.out.println(apples);
        System.out.println(oranges);
        
    }
}
