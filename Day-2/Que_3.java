import java.util.*;
public class assign_7{
    //WAP to print the product of the digit of the given number
    public static void main(String args[]){
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r=n , product=1;
    while(r!=0){
        int t=r%10;
            product =product*t;
            r=r/10;
    }
    System.out.println("the prouduct of the digit is  "+ product);
}
