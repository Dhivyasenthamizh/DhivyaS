import java.util.*;
public class s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pass=50;
        System.out.print("English:");
        int English =sc.nextInt();
        System.out.print("Tamil:");
        int Tamil =sc.nextInt();
        System.out.print("Maths:");
        int Maths =sc.nextInt();
        System.out.print("Science:");
        int Science =sc.nextInt();
        System.out.print("SS:");
        int SS =sc.nextInt();
        if(English>= pass){
            System.err.println("English"+" "+ English+" "+"pass");
        }
        else{
            System.err.println("English"+" "+ English+" "+"fail");
        }
        if(Tamil>= pass){
            System.err.println("Tamil"+" "+ Tamil+" "+"pass");
        }
        else{
            System.err.println("Tamil"+" "+ Tamil+" "+"fail");
        }
        if(Maths>= pass){
            System.err.println("Maths"+" "+ Maths+" "+"pass");
        }
        else{
            System.err.println("Maths"+" "+ Maths+" "+"fail");
        }
        if(Science>= pass){
            System.err.println("Science"+" "+ Science+" "+"pass");
        }
        else{
            System.err.println("Science"+" "+ Science+" "+"fail");
        }
        if(SS>= pass){
            System.err.println("SS"+" "+ SS+" "+"pass");
        }
        else{
            System.err.println("SS"+" "+ SS+" "+"fail");
        }



        
        
        
    }
}
