import java.util.*;
public class assign_48 {
    // Write a program to Write function for perfect number.
    public static void perfectNumber(int a){
        int sum=0 , original = a;
    for(int i=1 ; i<=a/2 ; i++){
        if(a%i==0){
        sum = sum + i ;
        }
    }
    if(sum == original){
            System.out.println("the number "+original+" is perfect number");
        }else{
            System.out.println("the number "+original+" is not perfect number");
        }
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check perfect number");
        int a = sc.nextInt();
        perfectNumber(a);
    }
    
}
