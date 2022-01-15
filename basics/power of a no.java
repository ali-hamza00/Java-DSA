import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number");
        int base = sc.nextInt();
        System.out.println("Enter power number");
        int power = sc.nextInt();
        int ans = base;
        
        for (int i=1;i<power;i++){
            ans = ans * base;
            System.out.println(ans);
        } 
        System.out.println("Ans:" + ans);
}

}
