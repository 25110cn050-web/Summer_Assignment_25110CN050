import java.util.*;
public class assign_17 {
    //WAP to check the perfect number
    public static void main(String args[]){
        System.out.println("Enter the number to check the perfect number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    int original = n , sum = 0 ;
    for(int i=1 ; i<=n/2 ; i++){
        int r=n%i;
        if (r==0){
            sum = sum + i;
        }
    }
    if(original == sum){
        System.out.println("The given number " + n + " is perfect number");
    }else{
        System.out.println("The given number " + n + " is not perfect number");
    }
    }
    
}
