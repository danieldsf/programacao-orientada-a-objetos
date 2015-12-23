import java.util.Scanner;

public class Uri1004{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int prod = 0, a = 0, b = 0;
        
        a = in.nextInt();
        in.nextLine();
        
        b = in.nextInt();
        in.nextLine();
        
        prod = a * b;
        
        System.out.println("PROD = " + prod); 
    }
}
