//Min-Max Sum
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author shantanu1395
 */
 class min_max_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long arr[]=new long[5];
        long min=Long.MAX_VALUE,max=Long.MIN_VALUE;
        for(int i=0;i<5;i++)
            arr[i]=sc.nextLong();
        for (int i = 0; i < 5; i++) {
            long locmin=0,locmax=0;
            for (int j = 0; j < 5; j++) {
                if(i==j)
                    continue;
                else{
                locmin+=arr[j];
                locmax+=arr[j];
                }
            }
            if(locmin<=min)
                    min=locmin;
                if(locmax>=max)
                    max=locmax;
        }
        System.out.println(min+" "+max);
    }
    
}
