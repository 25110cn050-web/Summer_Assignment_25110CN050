import java.util.*;
 public class  assign_11 {
   //WAP to find GCD of two number
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter first number ");
        int a = sc.nextInt();

        System.out.print("Enter second number ");
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);
    }
}
