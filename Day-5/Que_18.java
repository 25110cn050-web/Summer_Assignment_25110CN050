import java.util.*;
public class assign_18 {
    //WAP to Check strong number.
    public static void main(String args[]){
    System.out.println("Enter the number to check it strong or not");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int  original=n , temp=n , sum=0;
    while(temp!=0){
        int r=temp%10;
        int fact = 1;
        temp=temp/10;
        for(int i=1 ; i<=r ; i++){
            fact = fact*i;
        }
        sum=sum+fact;
    }
    if (sum==original){
        System.out.println("The number " + n + " is stromg number");
    }else{
        System.out.println("The number " + n + " is not  stromg number");
    }
}}
