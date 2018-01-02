//Between Two Sets
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package code;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author shantanu1395
 */
public class between_two_sets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        
        for (int i = 0; i <n; i++) 
        arr1[i]=sc.nextInt();
        for (int i = 0; i <m; i++) 
        arr2[i]=sc.nextInt();
        int min=arr1[0]<arr2[0]?arr1[0]:arr2[0];
        int max=arr2[arr2.length-1]>arr1[arr1.length-1]?arr2[arr2.length-1]:arr1[arr1.length-1];
        
        int count=0;
        for (int i = min; i <=max; i++) {
            int flag=0,innerflag=0;
            for (int j : arr2) {
                if(i!=0 && j%i!=0)
                    flag=1;
            }
                if(flag==0){
                    for (int j : arr1) {
                        if(j!=0 && i%j!=0)
                            innerflag=1;
                    }
                }
                if(innerflag==0 && flag==0)
                        count++;
        }
        System.out.println(count);
    }
}
