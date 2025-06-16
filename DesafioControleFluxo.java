import java.util.Scanner;

public class DesafioControleFluxo {

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			count(parametroUm, parametroDois);
		} catch (CountException exception) {
			System.err.println(exception.getMessage());
			;
		}

		terminal.close();
	}

	public static void count(int val1, int val2) throws CountException {
		if (val1 > val2) {
			throw new CountException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int contagem = val2 - val1;

		for (int i = 0; i < contagem; i++) {
			System.out.println("imprimindo o número " + (i + 1));
		}

	}

}
