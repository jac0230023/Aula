package taskAula;
import java.util.Scanner;
public class exPraticoS5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[3];
		
		for (int i = 0; i < names.length; i++) {
			System.out.printf("Nome aluno %d: ", i + 1);
			names[i] = input.nextLine();
		}
	}

}
