import java.util.*;
public class assign_9 {
    //WAP to check the number is prime or not
    public static void main(String args[]){
    System.out.println("Enter the number to check the the prime number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int flag =1;
    if(n==0||n==1){
        System.out.println("0 and 1 is not prime number");
    }
   else if(n==2){ 
        System.out.println("2 is prime number");
    }
    else{
        for(int i = 2 ; i<n ; i++){
            if(n%i==0){
            flag=0;
            break;
            }
           
        }
    }
    if(flag==1){
        System.out.println("the given number " + n + " is " + "prime");
    }else{
        System.out.println("the given number " + n + " is not " + "prime");
    }
    }
    
}
