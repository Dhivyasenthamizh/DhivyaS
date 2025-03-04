import java.util.*;
public class ss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        while(n>0){
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
