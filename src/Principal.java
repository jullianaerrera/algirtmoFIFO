
public class Principal {

	public static void main(String[] args) {
		int[] dadosDeEntrada = {1, 2, 3, 4, 1, 2, 6, 7};
		AlgoritmoFIFO algoritmo = new AlgoritmoFIFO();
		
		algoritmo.incluirNaFilaENaMemoria(dadosDeEntrada);
		
		for (int i = 0; i < dadosDeEntrada.length; i++) {
			algoritmo.incluirMemoriaCheia(dadosDeEntrada[i]);
		}
		
		System.out.println("Imprimindo a memoria fisica!");
		for (int i = 0; i < algoritmo.getMemoriaFisica().length; i++) {
			System.out.println("Posicao " + i + ": " + algoritmo.getMemoriaFisica()[i]);
		}
		
		System.out.println("Imprimindo a fila!");
		for (int i = 0; i < algoritmo.getFila().length; i++) {
			System.out.println("Posicao " + i + ": " + algoritmo.getFila()[i]);
		}
	}

}
