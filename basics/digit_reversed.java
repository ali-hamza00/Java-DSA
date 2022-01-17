import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int num = sc.nextInt();
        int temp = num;
        int rev=0;
        // 123
        while(temp>0)
        {
	    int remainder = temp % 10;
	    rev = rev * 10 + remainder;
            temp /= 10;
        }
        System.out.println(rev);
    }
}
