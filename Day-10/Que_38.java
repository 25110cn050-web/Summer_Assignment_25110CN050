import java.util.*;
public class assign_38 {
    //Write a program to Print reverse pyramid. 
    public static void main(String args[]){
    System.out.println("enter the number of row");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n ; i>=1 ; i--){
            for(int j=n-i ; j>=1 ; j--){
                System.out.print(" ");
            }
            for(int j=1 ; j<=2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
