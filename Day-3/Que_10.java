import java.util.*;
public class assign_10{
    //WAP to print the prime number in the range
    public static void main(String args[]){
        System.out.println("enter the range to print prime number");
    Scanner sc = new Scanner (System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();
    for (int num = start; num <= end; num++) {
            if (num < 2) {
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }

    }
    }}
