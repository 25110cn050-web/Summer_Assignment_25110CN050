import java.util.*;
public class assign_8{
    //  WAP to check the number is palindrome or not
    public static void main(String args[]){
    System.out.println(("Enter the number to check"));
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int r=n ,original =n, number=0 ; 
    while(r!=0){
    int t=r%10;
        number =number*10 + t;
        r=r/10;

    }
    if(number == original){
    System.out.println("the given number is palindrone");
    }
    else{
        System.out.println("the given number is not palindrone");
    }
}
}
