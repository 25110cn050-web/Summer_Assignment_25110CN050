import java.util.*;
public class assign_50 {
    //WAP to find sum and average of array
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the element of the array");

    for(int i=0 ; i<n ; i++){
        arr[i]=sc.nextInt();
    }
    int sum = 0;
    for(int i=0 ; i<n ; i++){
        sum = sum + arr[i];
    }
    System.out.println("The sum of the element of array is "+sum);
    float avg = (float)sum/n;
    System.out.println("The average of the element is "+avg);
} }  
