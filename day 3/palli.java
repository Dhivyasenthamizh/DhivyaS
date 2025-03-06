import java.util.*;
public class palli {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char a[]=str.toCharArray();
        String sum="";
        int count=0;
        for(int i=a.length-1;i>=0;i--){
            sum=sum+a[i];
        }
        char s[]=sum.toCharArray();
        for(int i=0;i<s.length;i++){
            if(a[i]==s[i]){
                  count=count+1;
            }
        }
        if(count==sum.length()-1)
                 System.out.println("pallindrome");
            else
                System.out.println("not pallindrome");
        
        
        }
    }
    
