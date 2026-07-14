import java.util.*;
public class assign_58 {
    //Write a program to Rotate array left.
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of element");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the element of array");
    for(int i=0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    int temp = arr[0];
    for(int i=0 ; i<n-1 ; i++){
        arr[i] = arr[i+1];
    }
    arr[n-1]=temp;
    System.out.println("The rotated array is :");
    for(int i=0 ; i<n ; i++){
        System.out.print(arr[i]+"\t");
    }
    }
}
