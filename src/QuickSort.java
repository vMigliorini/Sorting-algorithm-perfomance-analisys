import java.util.Arrays;

public class QuickSort {
    int[] lista;
    int abaixo_inicial;
    int acima_inicial;
    QuickSort(int[] entrada_dados){
        this.lista = entrada_dados;
        int n = lista.length;
        this.abaixo_inicial = 0;
        this.acima_inicial = n - 1;
    }

    private int particao(int abaixo, int acima){
        int meio = abaixo + (acima - abaixo) / 2;

        if (lista[abaixo] > lista[meio]) {
            swap(abaixo, meio);
        }
        if (lista[abaixo] > lista[acima]) {
            swap(abaixo, acima);
        }
        if (lista[meio] > lista[acima]) {
            swap(meio, acima);
        }
        swap(meio, acima);

        int pivot = lista[acima];

        int i = abaixo - 1;

        for (int j = abaixo; j <= acima - 1; j++){
            if (lista[j] < pivot){
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, acima);
        return i + 1;
    }

    private void swap(int i, int j) {
        int temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }

    public void sort(){
        sort(abaixo_inicial, acima_inicial);
    }

    private void sort(int abaixo, int acima){

        if (abaixo < acima){
            int indice_de_particao = particao(abaixo, acima);

            sort(abaixo, indice_de_particao - 1);
            sort(indice_de_particao + 1, acima);
        }
    }

    public void showLista(){
        System.out.println(Arrays.toString(lista));
    }
}
