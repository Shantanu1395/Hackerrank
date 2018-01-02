//divisible sum pairs
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 

/**
 *
 * @author Administrator
 */
class divisiblesumpairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) 
            arr[i]=sc.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if((arr[i]+arr[j])%k==0)
                    count++;
            }
        }
        System.out.println(count);
    }
    
}
