import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice");
        int choice = sc.nextInt();
        int r = 0;
        int l = 0;
        int b = 0;
        
        if (choice==1){
            System.out.println("Enter radius");
            r = sc.nextInt();
        } 
        else if(choice == 2){
            System.out.println("Enter length breadth");
            b = sc.nextInt();
            System.out.println("Enter length");
            l = sc.nextInt();
        }
        else{
            System.out.println("Invalid input");
        }
        
        switch(choice){
            case 1: System.out.println("area is:"+ (3.14*r*r));
            break;
            case 2:System.out.println("area is:"+ (l*b));
            break;
        }
    }
}
