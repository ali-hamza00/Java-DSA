import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your x age");
        int x = sc.nextInt();
        System.out.println("Enter your y age");
        int y = sc.nextInt();
        System.out.println("Enter your z age");
        int z = sc.nextInt();
        
        if (x>y && x>z)
        {
            System.out.println("x is great");
        }
        else if(y>x && y>z)
        {
            System.out.println("y is great");
        }
        else if (z>y && z>x)
        {
            System.out.println("z is great");
        }
        else
        {
            System.out.println("They are equal!!!!");
        }
        
        if (x<y && x<z){
            System.out.println("x is smallest");
        }
        else if (y<x && y<z){
            System.out.println("y is smallest");
        }
        else if(z<x && z<y){
            System.out.println("z is smallest");
        }
        else{
            System.out.println( "they are equal");
        }
    }
}
