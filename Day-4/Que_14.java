import java.util.*;
public class assign_14{
    //WAP to find the nth term of fibonacci series
    public static void main(String args[]){
    System.out.println("enter the number to terms");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        int a=0 , b=1 , c=0;
        for(int i=0 ; i<=n ; i++){
    c=a+b;
        a=b ;
        b=c;
        }
        System.out.println("the nth term of the fibonacci series is " + c);
    }

}
