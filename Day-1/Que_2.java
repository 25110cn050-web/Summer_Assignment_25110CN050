import java.util.*;
public class assign_2 {
    // WAP to prit multipication table of the goven number
    public static void main(String args[]){
        System.out.println("enter the value of n to print table ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1 ; i<=10 ; i++){
            System.out.println(n + "X" + i + "=" + (n*i));
        }
    }   
}
