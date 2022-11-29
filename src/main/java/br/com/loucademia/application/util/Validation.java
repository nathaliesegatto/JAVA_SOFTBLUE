package br.com.loucademia.application.util;

public class Validation {
	// método para saber se o usuário preencheu algo / obrigatoriedade de
	// preenchimento
	public static void assertNotEmpty(Object obj) { // Object é a super classe do Java. Todas as classes herdam dela
													// direta ou indiretamente. Significa que posso passar qualquer
													// coisa como parâmetro
		if (obj instanceof String) { // instanceof mostra se a variável valor é equivalente ao tipo da esquerda
			String s = (String) obj; // casting: transforma de Object para String e armazena em s. É possível se o
										// resultado do instanceof é verdadeiro.
			if (StringUtils.isEmpty(s)) {
				throw new ValidationException("O texto não pode ser nulo");
			}
		}

		if (obj == null) {
			throw new ValidationException("O valor não pode ser nulo."); // crio um objeto de exceção e lanço para quem
																			// o chamou
		}
	}
}
