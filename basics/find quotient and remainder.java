import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number \"A\"");
        int a = sc.nextInt();
        System.out.println("Enter a number \"B\"");
        int b = sc.nextInt();
        int quo = a/b;
        int rem = a%b;
        System.out.println(quo+"Quotient");
        System.out.println(rem+"Remainder");
}
}
