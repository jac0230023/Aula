package taskAula;
import java.util.Scanner;

public class exemploPraticoS5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[5];
		
		for (int i = 0; i < names.length; i++) {
			System.out.printf("Digite o nome %d: ", i + 1);
			names[i] = input.nextLine();
		}
		System.out.println("\nLista de nomes");
		for (String name : names) {
			System.out.print("Nome: ");
			System.out.println(name);
		}
	}

}
