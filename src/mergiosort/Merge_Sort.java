package mergiosort;

public class Merge_Sort {

	public Merge_Sort() {
		super();
	}
public int[] MergeSort(int[] vetor, int inicio, int fim) {
	if (inicio < fim) {
		int meio = (inicio + fim)/2;
		MergeSort(vetor, inicio, meio);// á esquerda
		MergeSort(vetor, meio + 1, fim);// á direita
		intercal(vetor, inicio, meio,fim);
	}
	return vetor;
}
private void intercal(int[] vetor, int inicio, int meio, int fim) {
	int vetnovo[] = new int[vetor.length];
	for (int i = inicio; i <= fim; i++) {
		vetnovo[i] = vetor[i];
	}
	int esquerda = inicio;
	int direita = meio+1;
	for (int cont = inicio; cont <= fim; cont++) {
		if(esquerda > meio) {
			vetor[cont] = vetnovo[direita];
			direita++;
		}
			else if(direita > fim) {
				vetor[cont] = vetnovo[esquerda];
				esquerda++;
			}
				else if(vetnovo[esquerda] < vetnovo[direita]) {
					vetor[cont] = vetnovo[esquerda];
					esquerda++;
				}
				else {
					vetor[cont] = vetnovo[direita];
					direita++;
				}
			}
		}
	}