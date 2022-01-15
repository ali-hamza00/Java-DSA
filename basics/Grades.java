import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int x = sc.nextInt();
        if (x<25){
            System.out.println("F grade");
        } 
        else if (x>25 && x<=45){
            System.out.println("E grade");
        }
        else if(x>45 && x<=50){
            System.out.println("D grade");
        }
        else if(x>50 && x<=70){
            System.out.println("C grade");
        }
        else if(x>70 && x<=80){
            System.out.println("B grade");
        }
        else{
            System.out.println("A grade");
        }
    }
}
