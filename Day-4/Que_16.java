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
        int original = n , temp = n , count=0 , sum=0;

        while (temp!=0){
            temp=temp/10;
            count++;
        }
while(n!=0){
    int r=n%10;
            sum = sum + (int)Math.pow(r,count);
            n=n/10;

}
if(sum==original){
    System.out.println(sum);
}
    }
    }
}
