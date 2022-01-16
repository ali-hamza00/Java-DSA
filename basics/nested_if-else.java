import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter age");
    int age = sc.nextInt();
      System.out.println ("Enter Male or female");
    char sex = sc.next().charAt (0);
      System.out.println("Are you married? is it a yes!?");
    char engage = sc.next().charAt(0);
    
    if (sex == 'M' || sex == 'm'){
        if(age>=20 && age<=40){
            System.out.println("Work Anywhere");
        }else if(age>=40 && age<=60){
            System.out.println("Work only in Urban areas");
        }else{
            System.out.println("Invalid Age");
        }
    } else {
        System.out.println("Female worker - Work in Urban Area");
    }
  }
}
