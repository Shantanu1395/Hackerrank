//Birthday Candles
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author shantanu1395
 */
class birthday_candles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> hm=new HashMap();
        int max=0;
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ele=sc.nextInt();
            if(!hm.containsKey(ele)){
                hm.put(ele,1);
                if(max==0)
                    max=1;
            }
            else{
                hm.put(ele, hm.get(ele)+1);
                if(hm.get(ele)>max)
                    max=hm.get(ele);
            }
        }
        System.out.println(max);
        
    }
}

