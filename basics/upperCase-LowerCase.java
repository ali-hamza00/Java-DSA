import java.util.Scanner;
public class Main
{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        char ch = sc.next().charAt(0);
        int chr = ch;
        
        if(chr>=65 && chr<=90){
            System.out.println("Character is Uppercase");
        }
        else if(chr>=97 && chr<=122){
            System.out.println("Charater is lowercase");
        }
        else{
            System.out.println("not an alphabet");
        }
    }
}
