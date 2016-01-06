import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x, y;
		
		while(true){
			x = in.nextInt();
			y = in.nextInt();
			
			if(x == 0 || y == 0){
				break;
			}
			
			//
			if(x > 0 && y > 0){
				System.out.println("primeiro");
			}else if(x < 0 && y > 0){ //2
				System.out.println("segundo");
			}else if(y < 0 && x > 0){
				System.out.println("quarto");
			}else{ //3
				System.out.println("terceiro");
			}
			
		}
	}
}
