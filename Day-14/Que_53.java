import java.util.*;
public class assign_53 {
    //Write a program to Linear search. 
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of element");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the number of element");
    for(int i=0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the element to search in the array");
    int key = sc.nextInt();
    int flag = 0 , index=0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]==key){
                flag = 1;
                index=i+1;
            }}
        if(flag==1){
            System.out.println("The number "+key+" is present in the array at position "+index);
        }else{
            System.out.println("The element is not present in the array");
        }
        }
    }
