
public class AlgoritmoFIFO {
	
	private int[] memoriaFisica = new int[4];
	private int[] fila = new int[4];
	
	public int[] getMemoriaFisica() {
		return memoriaFisica;
	}

	public int[] getFila() {
		return fila;
	}

	public void incluirNaFilaENaMemoria(int[] dadosDeEntrada) {
		incluirFilaVazia(dadosDeEntrada);
		incluirMemoriaVazia();
	}
	
	private void incluirFilaVazia(int[] dadosDeEntrada){
		for(int x = 0; x < fila.length; x++) {
			fila[x] = dadosDeEntrada[x];			
		}
	}
	
	private void incluirMemoriaVazia(){
		for(int y = 0; y < memoriaFisica.length; y++) {
			memoriaFisica[y]=fila[y];
		}
	}
	
	public void incluirMemoriaCheia(int novoValor) {
		boolean pageFaults = false;
		for (int x = 0; x < memoriaFisica.length; x++) {
			if (novoValor == memoriaFisica[x]) {
				pageFaults = true;
				break;
			}
		}
		if (pageFaults == false) {
			int valorParaExcluir = gerenciarFila(novoValor);
			for (int x = 0; x < memoriaFisica.length; x++) {
				if (valorParaExcluir == memoriaFisica[x]) {
					memoriaFisica[x] = novoValor;
				}
			}
		}
	}
	
	private int gerenciarFila(int novoValor) {
		int valorExcluir = fila[0];
		
		//andar a fila
		for (int i = 0; i < fila.length - 1; i++) {
			fila [i] = fila[i+1];
		}
		
		fila[fila.length-1] = novoValor;
		
		return valorExcluir;
	}
	
}