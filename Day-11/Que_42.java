import java.util.*;
public class assign_42{
    // WAP to write a function to find maximum
    public static int findMaximum(int a , int b){
            if(a>b){
                return a;
            }
            else{
                return b;
            }
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The maximum of both is "+findMaximum(a,b));
    }
    
}
