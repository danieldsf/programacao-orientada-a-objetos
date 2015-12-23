import java.util.Scanner;

public class Uri1007{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int a = 0, b = 0, c = 0, d = 0;
        
        a = in.nextInt();
        in.nextLine();
        
        b = in.nextInt();
        in.nextLine();
        
        c = in.nextInt();
        in.nextLine();
        
        d = in.nextInt();
        in.nextLine();
        
        int diff = (a * b) - (c * d);
        System.out.printf("DIFERENCA = %d\n", diff);
    }
}