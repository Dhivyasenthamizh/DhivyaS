import java.util.*;
public class c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        while(n>0){
            int dig=n%10;
            count+=1;
            n=n/10;
        }
        System.out.println(count);
    }
    
}
