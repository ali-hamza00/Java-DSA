import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal");
        int principal = sc.nextInt();
        System.out.println("Enter Time");
        int time=sc.nextInt();
        System.out.println("Enter rate");
        int rate=sc.nextInt();
        int simpleIntrest=(principal*time*rate)/100;
        System.out.println("simpleIntrest="+simpleIntrest);
}
}
