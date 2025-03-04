import java.util.*;
public class z {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int dig=n%10;
            if(dig==0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            n=n/10;
        }
    }
    
}
