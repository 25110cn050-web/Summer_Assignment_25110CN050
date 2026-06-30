import java.util.*;
public class assign_43{
    // WAP to write a function to check the prime
    public static void prime(int a){
        int flat =1;
        if(a==1 || a==0 ){
            System.out.println("not prime");
            return ;
        }else if(a==2){
            System.out.println("prime");
        }else{
            for(int i=2 ; i<=a-1 ; i++){
                if(a%i == 0){
                    flat = 0;
                }}
            if(flat ==1){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        return ;
        }
            
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime");
        int a = sc.nextInt();
        prime(a);
        
        
    }
    
}
    

