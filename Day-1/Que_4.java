import java.util.*;
//count the number of digit in number
public class assign_4{
    public static void main(String args[]){
    System.out.println("Enter the number to count the digit");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
int  r=n , count = 0;
    while(r!=0){
        r=r/10;
        count++;
    }
    System.out.println("the number of digit is  " + count);
    }
}
