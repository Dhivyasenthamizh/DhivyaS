import java.util.*;
public class p {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        if(n==0||n==1){
            System.out.println("true");
        }
        else{
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
    
}
