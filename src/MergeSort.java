import java.util.Arrays;

public class MergeSort {
    int[] lista;
    int intial_left;
    int initial_right;

    MergeSort(int[] lista) {
        this.lista = lista;
        this.initial_right = lista.length - 1;
        this.intial_left = 0;
    }

    private void merge(int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] Left = new int[n1];
        int[] Right = new int[n2];

        for (int i = 0; i < n1; i++){
            Left[i] = lista[left + i];
        }
        for (int j = 0 ; j < n2; j++){
            Right[j] = lista[mid + 1 + j];
        }

        int i = 0;
        int j = 0;

        int k = left;

        while(i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                lista[k] = Left[i];
                i++;
            }
            else {
                lista[k] = Right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            lista[k] = Left[i];
            i++;
            k++;
        }

        while(j < n2) {
            lista[k] = Right[j];
            j++;
            k++;
        }
    }

    public void sort() {
        sort(intial_left, initial_right);
    }

    private void sort(int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            sort(left, mid);
            sort(mid + 1, right);

            merge(left, mid, right);
        }
    }

    public void showLista() {
        System.out.println(Arrays.toString(lista));
    }
}
