public class HeapSort {

    public static void heapify(int[] vetor, int tamanhoHeap, int indiceAtual) {
        int maior = indiceAtual;

        int esquerdo = 2 * indiceAtual + 1;
        int direito = 2 * indiceAtual + 2;

        // verifica o filho esquerdo
        if (esquerdo < tamanhoHeap && vetor[esquerdo] > vetor[maior]) {
            maior = esquerdo;
        }

        // verifica o filho direito
        if (direito < tamanhoHeap && vetor[direito] > vetor[maior]) {
            maior = direito;
        }

        // se algum filho for maior que o pai
        if (maior != indiceAtual) {
            int aux = vetor[indiceAtual];
            vetor[indiceAtual] = vetor[maior];
            vetor[maior] = aux;

            // corrige o restante da subárvore
            heapify(vetor, tamanhoHeap, maior);
        }
    }

    public static void heapSort(int[] vetor) {
        int tamanhoHeap = vetor.length;

        // constrói o Max-Heap
        for (int indiceAtual = tamanhoHeap / 2 - 1; indiceAtual >= 0; indiceAtual--) {
            heapify(vetor, tamanhoHeap, indiceAtual);
        }

        // extrai os elementos do Heap
        for (int indiceAtual = tamanhoHeap - 1; indiceAtual > 0; indiceAtual--) {

            // coloca o maior elemento no final
            int aux = vetor[0];
            vetor[0] = vetor[indiceAtual];
            vetor[indiceAtual] = aux;

            // reconstrói o Heap
            heapify(vetor, indiceAtual, 0);
        }
    }
}
