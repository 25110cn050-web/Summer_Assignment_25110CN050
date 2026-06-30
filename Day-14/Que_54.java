import java.util.*;
public class assign_54 {
    //Write a program to Frequency of an element.
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of element");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the number of element");
    for(int i=0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the element to check the frequency");
    int key = sc.nextInt();
    int count=0;
    for(int i=0 ; i<n ; i++){
        if(arr[i]==key){
            count++;
        }
    }
    
    System.out.println("The number "+key+" occur "+count+" times in the array");
    }
    }
