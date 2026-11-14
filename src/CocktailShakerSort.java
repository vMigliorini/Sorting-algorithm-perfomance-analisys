import java.util.Arrays;

public class CocktailShakerSort {
    int[] lista;

    CocktailShakerSort(int[] entrada_dados) {
        this.lista = entrada_dados;
    }

    private void swap(int i, int j) {
        int temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }

    public void sort() {
        int inicio = 0;
        int fim = lista.length - 1;
        boolean trocou = true;

        while (trocou) {
            trocou = false;

            // esquerda pra direita: leva o maior para o fim
            for (int i = inicio; i < fim; i++) {
                if (lista[i] > lista[i + 1]) {
                    swap(i, i + 1);
                    trocou = true;
                }
            }
            fim--;

            if (!trocou) break;   // já está ordenado
            trocou = false;

            // direita pra esquerda: leva o menor para o início
            for (int i = fim; i > inicio; i--) {
                if (lista[i] < lista[i - 1]) {
                    swap(i, i - 1);
                    trocou = true;
                }
            }
            inicio++;
        }
    }

    public void showLista() {
        System.out.println(Arrays.toString(lista));
    }
}