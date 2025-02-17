package controller;

public class MultiSomaController {

	public int SomaMulti(int a, int b) {
		
		// Condição de parada = quando o b chegar a zero, ou seja, "a" já foi somado a
		// quantidade
		// de vezes necessária, retorna o resultado
		if (b == 1) {

			return a;

		}
		
		

		return a + SomaMulti(a , b - 1);

		// 2 * 3 = 6; O primeiro fator irá somar consigo mesmo a quantidade de vezes do
		// outro, igual ocorre em uma multiplicação;

	}

}
