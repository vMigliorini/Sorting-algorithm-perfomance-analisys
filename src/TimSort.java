import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimSort {
    int[] lista;
    int minRun;

    TimSort(int[] lista) {
        this.lista = lista;
        this.minRun = 32;
    }

    private int calcMinRun(int n) {
        int r = 0;
        while (n >= minRun) {
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }

    public void insertionSort(int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = lista[i];
            int j = i - 1;
            while (j >= left && lista[j] > key) {
                lista[j + 1] = lista[j];
                j--;
            }
            lista[j + 1] = key;
        }
    }

    private void merge(int left, int mid, int right) {
        int[] Left = Arrays.copyOfRange(lista, left, mid + 1);
        int[] Right = Arrays.copyOfRange(lista, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < Left.length && j < Right.length) {
            if (Left[i] <= Right[j]) lista[k++] = Left[i++];
            else lista[k++] = Right[j++];
        }
        while (i < Left.length) lista[k++] = Left[i++];
        while (j < Right.length) lista[k++] = Right[j++];
    }

    private int findRun(int start, int n) {
        int end = start + 1;
        if (end == n) return end;

        if (lista[end] < lista[start]) {
            while (end < n && lista[end] < lista[end - 1])
                end++;
            reverse(start, end - 1);

        } else {
            while (end < n && lista[end] >= lista[end - 1])
                end++;
        }
        return end;
    }

    private void reverse(int left, int right) {
        while (left < right) {
            int temp = lista[left];
            lista[left] = lista[right];
            lista[right] = temp;
            left++;
            right--;
        }
    }

    public void sort() {
        int n = lista.length;
        int minRun = calcMinRun(n);
        List<int[]> runs = new ArrayList<>();

        int i = 0;
        while (i < n) {
            int runEnd = findRun(i, n);
            int runLen = runEnd - i;

            // Extend short runs to minRun using insertion sort
            if (runLen < minRun) {
                int end = Math.min(i + minRun, n);
                insertionSort(i, end - 1);
                runEnd = end;
            }
            runs.add(new int[]{i, runEnd});
            i = runEnd;

            // Maintain merge balance
            while (runs.size() > 1) {
                int[] run1 = runs.get(runs.size() - 2);
                int[] run2 = runs.get(runs.size() - 1);

                int l1 = run1[0], r1 = run1[1];
                int l2 = run2[0], r2 = run2[1];
                int len1 = r1 - l1, len2 = r2 - l2;

                if (len1 <= len2) {
                    merge(l1, r1 - 1, r2 - 1);
                    runs.remove(runs.size() - 1);
                    runs.set(runs.size() - 1, new int[]{l1, r2});
                } else break;
            }
        }
    }

    public void showLista(){
        System.out.println(Arrays.toString(lista));
    }
}
