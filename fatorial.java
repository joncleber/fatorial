import java.util.Scanner;

public class fatorial {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor inteiro positivo");
		int n = scanner.nextInt();
		int fatorial = 1;
		
		int [] valores = new int[n + 1];
		
		for(int i = 1; n >= i; i++) {
			
			valores[i] = i;
			fatorial = valores[i] * fatorial;
			
		}
		System.out.println(fatorial);
		}
}
