import java.util.*;
public class assign_15{
    // WAP to check the number is armstrong or not 
    public static void main(String args[]){
        System.out.println("Enter the number to check it is armstrong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n , sum = 0;
        while(n!=0){
            int r=n%10;
            sum = sum + (r*r*r);
            n=n/10;
        }
        if(sum == original){
            System.out.println("the given number is armstrong number");
        }
        else{
            System.out.println("the given number is not armstrong number");
        }
    }
}
