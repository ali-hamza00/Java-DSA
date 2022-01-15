import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year of service");
        int serv = sc.nextInt();
        System.out.println("Enter salary");
        int salary = sc.nextInt();
        
        if (serv>=5){
            int bonus = (salary * 5) / 100;
            salary = bonus + salary;
            System.out.println(salary);
        } 
        else{
            System.out.println("salary you get "+salary);
        }
    }
}
