//Time Conversions
import java.util.*;
import java.text.DecimalFormat;
class Soultion
{
public static void main(String gh[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s1=s.substring(8,10);
	String s2=s.substring(0,2);
	int x=Integer.parseInt(s2);
	if(s1.equals("PM") ||s1.equals("pm"))
        {
        if(x==12)
	     System.out.println("12"+s.substring(2,8));
        else
            System.out.println((x+12)+s.substring(2,8));
        }
	else if(s1.equals("AM") ||s1.equals("am"))
        {
        if(x==12)
	     System.out.println("00"+s.substring(2,8));
        else
            System.out.println(s.substring(0,8));

        }
	}
}                 