import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite o tamanho da escada: \n");
		int x = scan.nextInt();
		
		escada(x);
	}
	
	public static void escada(int n) {
		int x = n;
		if(n > 0 && n <= 100) {
			for(int i = 0; i < n; i++) {
				for(int y = 1; y < x; y++) {
					System.out.print(" ");
				}
				x--;
				for(int j = 0; j <= i; j++) {
					System.out.print("#");
				}
				System.out.println("");
			}
		}
	}
}
