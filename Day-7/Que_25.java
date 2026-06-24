import java.util.*;
public class assign_24 {
    //Write a program to Find x^n without pow().
    public  static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number and its power");
    int x = sc.nextInt();
    int n = sc.nextInt();
    int power = 1;
    for(int i=1 ; i<=n ; i++){
        power = power *x;
    }
    System.out.println("The value of x^n is "+power);
    }
}
