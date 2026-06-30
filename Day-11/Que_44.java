import java.util.*;
public class assign_44{
    // WAP to write a function to find factorial
    public static int factorial(int n){
        int fact=1;
        for(int i=1 ; i<=n ; i++){
            fact = fact * i;
        }
        return fact;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        int n = sc.nextInt();
        
        System.out.println("The factorial of the "+n+" is "+factorial(n));
    }
    
}
    

