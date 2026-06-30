import java.util.*;
public class assign_47 {
    // Write a program to Write function for Fibonacci. 
    public static  void fibonacciNumber(int n){
        int a=0 , b=1 , c;
        System.out.println("The fibonacci series:\n0\n1");
        for(int i=1 ; i<=n ; i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        return ;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        fibonacciNumber(n);
        
    }
    
}
