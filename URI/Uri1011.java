import java.util.Scanner;

public class Uri1011{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int raio = in.nextInt();

        double volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f", volume);
    }
}