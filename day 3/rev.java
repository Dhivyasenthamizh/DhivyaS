import java.util.*;
public class rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char a[]=s.toCharArray();
        for (int i = a.length-1; i >=0; i--) {
            System.out.print(a[i]);
        }  
    }
}
