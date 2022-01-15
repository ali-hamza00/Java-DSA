import java.util.Scanner;
class Main{
    public static void main(String[] args){
        boolean isVowel=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to check vovel");
        char vovel=sc.next().charAt(0);
        switch(vovel){
        
        case 'a':isVowel=true;
        
        case 'e':isVowel=true;
        
        case 'i':isVowel=true;
        
        case 'o':isVowel=true;
        
        case 'u':isVowel=true;
        
        case 'A':isVowel=true;
        
        case 'E':isVowel=true;
        
        case 'I':isVowel=true;
        
        case 'O':isVowel=true;
        
        case 'U':isVowel=true;
    }
    if (isVowel==true){
        System.out.println("Its a vowel");
    } 
    else{
        System.out.println("Not a vowel");
    }
}
}
