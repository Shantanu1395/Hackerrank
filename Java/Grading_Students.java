//Grading Students
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
class grading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            if(x>38 && (x+1)%5==0)
                System.out.println(x+1);
            else if(x>=38 && (x+2)%5==0)
                System.out.println(x+2);
            else
                System.out.println(x);
        }
    }
}
