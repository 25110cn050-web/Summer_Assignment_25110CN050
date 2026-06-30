import java.util.*;
public class assign_46{
    // 
    public static void armstrongNumber(int a){
        int sum = 0 , original = a , count=0 , temp = a;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        while(a!=0){
            int r=a%10;
            sum =sum + (int)Math.pow(r,count);
            a=a/10;
}
    if (sum == original){
        System.out.println("The given number "+sum+" is armstrong");
    }else{
        System.out.println("The given number "+sum+" is not armstrong");
    }
return ;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check armstrong");
        int a = sc.nextInt();
        
        armstrongNumber(a);
    }
    
}
