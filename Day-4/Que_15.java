
import java.util.*;
public class assign_15{
    // WAP to check the number is armstrong or not 
    public static void main(String args[]){
        System.out.println("Enter the number to check it is armstrong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n , temp = n, sum = 0 , count=0;
        while (temp!=0){
            temp=temp/10;
            count++;
        }


        while(n!=0){
            int r=n%10;
            sum = sum + (int)Math.pow(r,count);
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
