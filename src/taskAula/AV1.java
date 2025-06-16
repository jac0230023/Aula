package taskAula;
import java.util.Scanner;

public class AV1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double  media = -1; 
		double mediaMelhorAluno = -1;
		String nomeMelhorAluno = "";
		double mediaPiorAluno = 11;
		String nomePiorAluno = "";
				
		
		for (int qtdAluno = 2; qtdAluno != 0; qtdAluno--) {
			
			System.out.print("Nome do Aluno: ");
			String nomeAluno = scan.nextLine();
			double somaMedia = 0;
			for (int i = 1; i < 5; i++) {
				System.out.printf("%d° Nota: ", i);
				double nota = scan.nextDouble();
				
				somaMedia += nota;
				media = nota;
				scan.nextLine();
			}
		media = somaMedia / 4;
			
		if (media > 0 && media < 5) {
			System.out.printf("Aluno %s REPROVADO com %.2f. \n \n", nomeAluno, media);
		} else if (media >= 5 && media < 7) {
			System.out.printf("Aluno %s RECUPERAÇÃO com %.2f. \n \n", nomeAluno, media);
		} else {
			System.out.printf("Aluno %s aprovado com %.2f. \n \n", nomeAluno, media);
		}
			
		
		if (media > mediaMelhorAluno) {
			mediaMelhorAluno = media;
			nomeMelhorAluno = nomeAluno;
		}
		if (media <  mediaPiorAluno) {
			mediaPiorAluno = media;
			nomePiorAluno = nomeAluno;
		}
		}
		
		System.out.println("O melhor aluno é " + nomeMelhorAluno + " com " + mediaMelhorAluno);
		System.out.println("O pior aluno é " + nomePiorAluno + " com " + mediaPiorAluno);
		
		scan.close();
	}

}
