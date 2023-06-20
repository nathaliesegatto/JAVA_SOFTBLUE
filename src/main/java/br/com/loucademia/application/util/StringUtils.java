package br.com.loucademia.application.util;

public class StringUtils {
	
	public static boolean isEmpty(String s) {
		if (s == null) {
			return true;
		}
		
		return s.trim().length() == 0;  // corta os espaços em branco do início e do final e verifica se o tamanhho que sobra é zero (string vazia)
	}

	public static String leftZeroes(int value, int finalSize) { // concatena zeros à esquerda para número de matrícula com 8 caracteres
		return String.format("%0" + finalSize + "d", value); // método "format" serve para formatar strings | "%03d" significa colocar 3 zeros à esquerda de um valor númerico (d)
			
		}
	
	public static void main(String[] args) { // método main é o ponto de entrada da aplicação
		String str = "  a  "; // teste do método "isEmpty"
		boolean b = StringUtils.isEmpty(str);
		System.out.println(b);
		
		int v = 100; // teste do método "leftZeroes"
		String c = StringUtils.leftZeroes(v, 8);
		System.out.println(c);
	}
}
