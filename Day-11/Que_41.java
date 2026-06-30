import java.util.*;
public class assign_41 {
    // WAP to write function to find sum of two number
    public static int addToNumber(int a , int b){
            int sum = a+b;
            return sum;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("The sum of 2 number is "+addToNumber(a,b));
    }
    
}
