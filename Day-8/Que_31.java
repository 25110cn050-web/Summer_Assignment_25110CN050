import java.util.*;
public class assign_31 {
    //Write a program to Print character triangle.
    public static void main(String args[]){
        System.out.println("Enter the number of row");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print((char)(64+j));
            }
            System.out.println();
        }

    }
}
