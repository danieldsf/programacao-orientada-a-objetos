import java.util.Scanner;

public class Uri1005{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double notaA = 0, pesoA = 3.5, notaB = 0, pesoB = 7.5, media = 0;
        
        notaA = in.nextDouble();
        in.nextLine();
        
        notaB = in.nextDouble();
        in.nextLine();
        
        media = ((notaA * pesoA) + (notaB * pesoB)) / (pesoA + pesoB);
        
        System.out.printf("MEDIA = %.5f\n", media);
    }
}