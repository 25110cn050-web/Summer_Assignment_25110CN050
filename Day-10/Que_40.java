import java.util.*;
public class assign_40 {
    //Write a program to Print character pyramid. 
    public static void main(String args[]){
    System.out.println("enter the number of row");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++){
            for(int j=n-i ; j>=1 ; j--){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print((char)(64+j));
            }
            for(int j=i-1 ; j>=1 ; j--){
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
    }
    
    
}
