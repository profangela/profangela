import java.util.Scanner;
public class TabuadaFor {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, r;
		System.out.print("Informe um número inteiro: ");
		n = s.nextInt();
		for (int i = 1; i <= 10; i++) {
			r = n * i;
			System.out.println(n + " x " + i + " = " + r);
		}	
		s.close();	
	}
}