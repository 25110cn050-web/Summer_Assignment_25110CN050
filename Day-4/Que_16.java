import java.util.*;
public class assign_16 {
    // WAP to print armstrong number in a range
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the first number");
    int a = sc.nextInt();
    System.out.println("Enter the second number");
    int b = sc.nextInt();
    System.out.println("The armstrong number in the given range:");
    for(int i=a ; i<=b ; i++){
        int n=i;
        int original = n , sum=0;
while(n!=0){
    int r=n%10;
            sum = sum + (r*r*r);
            n=n/10;

}
if(sum==original){
    System.out.println(sum);
}
    }
    }
}
