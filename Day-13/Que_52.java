import java.util.*;
public class assign_52 {
//Write a program to Count even and odd elements.  
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of element");
    int n = sc.nextInt();
    int arr[] = new int[n];
    int even =0 , odd = 0;
    System.out.println("Enter the element of array");
    for(int i=0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    for(int i=0 ; i<n ; i++){
    if(arr[i]%2==0){
        even++;
    }else{
        odd++;
    }
    }
    System.out.println("The number of even element is "+even);
    System.out.println("The number of odd element is "+odd);
}
}
