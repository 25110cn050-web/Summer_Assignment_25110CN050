import java.util.*;
public class assign_34 {
    //Write a program to Print reverse number triangle. 
    public static void main(String args[]){
        System.out.println("Enter the number of row");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n ; i>=1; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
