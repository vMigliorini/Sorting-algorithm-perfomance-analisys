import java.util.Arrays;

public class ShellSort {
    static int[] lista;
    ShellSort(int[] lista) {
        this.lista = lista;
    }

    public void sort() {
        int n = lista.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {
                int temp  = lista[i];
                int j = i;

                while (j >= gap && lista[j - gap] > temp) {
                    lista[j] = lista[j - gap];
                    j -= gap;
                }

                lista[j] = temp;
            }
        }
    }

    public static void showLista(){
        System.out.println(Arrays.toString(lista));
    }
}
