import java.util.*;
public class assign_6{
    //WAP to print the reverse of the digit of the given number
    public static void main(String args[]){
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r=n , number=0 ; 
    while(r!=0){
    int t=r%10;
        number =number*10 + t;
        r=r/10;

    }
    System.out.println("the reverse of the given number is "  +  number);

}}
