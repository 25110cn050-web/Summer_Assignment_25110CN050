import java.util.*;
public class assign_45{
    // WAP to Write function for palindrome. 
    public static void palindromeNumber(int n){
        int num=0 , original = n;
        while(n!=0){
            int r=n%10;
                num = num*10 + r;
                n=n/10;
}
if(num == original){
System.out.println("The given number "+num+" is palindrome");
}else{
System.out.println("The given number "+num+" is not palindrome");
}
return ;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check palindrome");
        int n = sc.nextInt();
        palindromeNumber(n);
    }
    
}
