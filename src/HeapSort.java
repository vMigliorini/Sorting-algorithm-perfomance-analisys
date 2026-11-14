import java.util.Arrays;

public class HeapSort {
    int[] lista;

    HeapSort(int[] lista) {
        this.lista = lista;
    }

    private void heapify(int tamanhoHeap, int indiceAtual) {
        int maior = indiceAtual;

        int esquerdo = 2 * indiceAtual + 1;
        int direito = 2 * indiceAtual + 2;

        // verifica o filho esquerdo
        if (esquerdo < tamanhoHeap && lista[esquerdo] > lista[maior]) {
            maior = esquerdo;
        }

        // verifica o filho direito
        if (direito < tamanhoHeap && lista[direito] > lista[maior]) {
            maior = direito;
        }

        // se algum filho for maior que o pai
        if (maior != indiceAtual) {
            int aux = lista[indiceAtual];
            lista[indiceAtual] = lista[maior];
            lista[maior] = aux;

            // corrige o restante da subárvore
            heapify(tamanhoHeap, maior);
        }
    }

    public void sort() {
        int tamanhoHeap = lista.length;

        // constrói o Max-Heap
        for (int indiceAtual = tamanhoHeap / 2 - 1; indiceAtual >= 0; indiceAtual--) {
            heapify(tamanhoHeap, indiceAtual);
        }

        // extrai os elementos do Heap
        for (int indiceAtual = tamanhoHeap - 1; indiceAtual > 0; indiceAtual--) {
            // coloca o maior elemento no final
            int aux = lista[0];
            lista[0] = lista[indiceAtual];
            lista[indiceAtual] = aux;

            // reconstrói o Heap
            heapify(indiceAtual, 0);
        }
    }

    public void showLista() {
        System.out.println(Arrays.toString(lista));
    }
}