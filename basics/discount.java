import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter price of item");
        int price = sc.nextInt();
        System.out.println("enter quantity of item");
        int quantity = sc.nextInt();
        int amount = price * quantity;
        
        if (amount>1000){
            int discount = amount *10 /100;
            amount = amount - discount;
            System.out.println("Amount is:"+amount);
        }  
        else{
            System.out.println("Amount is:"+amount);
        }
        
    }
}
