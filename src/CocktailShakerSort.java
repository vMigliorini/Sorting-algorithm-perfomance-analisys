public class CocktailShakerSort {

    public static void cocktailSort(int[] vetor) {

        int inicio = 0;
        int fim = vetor.length - 1;

        boolean trocou = true;

        while (trocou) {

            trocou = false;

            // esquerda pra direita
            for (int i = inicio; i < fim; i++) {

                if (vetor[i] > vetor[i + 1]) {

                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;

                    trocou = true;
                }
            }

            fim--;

            // direita pra esquerda
            if (trocou) {

                trocou = false;

                for (int i = fim; i > inicio; i--) {

                    if (vetor[i] < vetor[i - 1]) {

                        int temp = vetor[i];
                        vetor[i] = vetor[i - 1];
                        vetor[i - 1] = temp;

                        trocou = true;
                    }
                }

                inicio++;
            }
        }
    }
}