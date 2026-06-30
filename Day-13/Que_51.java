import java.util.*;
public class assign_51 {
//Write a program to Find largest and smallest element. 
public static void main(String args[]){
    int arr[] = {2,7,4,1,9,5,3};
    int largest = arr[0];
    int smallest = arr[0];
    for(int i=0 ; i<7 ; i++){
        if(arr[i]>largest){
            largest = arr[i];
        }
        if(arr[i]<smallest){
            smallest = arr[i];
        }
    }
    System.out.println("The largest element of array is "+largest);
    System.out.println("The smallest element of array is "+smallest);
}
}
