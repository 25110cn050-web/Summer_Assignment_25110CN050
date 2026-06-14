import java.util.*;
public class assign_13 {
    //WAP to generate the fibonacci series
    public static void main(String args[]){
    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a=0 , b=1;
    System.out.println("the fibonacci series: \n0\n1");
    for(int i=0 ; i<n ; i++){
        int c = a+b;
        a=b;
        b=c;
        System.out.println(c);
    }
    }
    
}
