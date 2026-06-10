import java.util.*;
public class assign_5{
    //WAP to print the sum of digit of the gine number
    public static void main(String args[]){
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();


int r=n , s=0 ;
    while(r!=0){
        int t=r%10;
        s=s+t;
        r=r/10;
    }
    System.out.println("the sum of the digit of " + n + "is " + s);
}}
