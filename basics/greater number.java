import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number A");
        int a = sc.nextInt();
        System.out.println("Enter a number B");
        int b = sc.nextInt();
        
        if (a>b){
            System.out.println("A is greater");
        } 
        else if(b>a){
            System.out.println("b is greater");
        }
        else{
            System.out.println("They are equal");
        }
}
}
