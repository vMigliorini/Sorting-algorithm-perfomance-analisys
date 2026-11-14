void main() {
    int[] lista = {1, 54, 23, 5, 3, 7, 1, 9, 0};

    QuickSort quickSort = new QuickSort(lista);
    ShellSort shellSort = new ShellSort(lista);

    quickSort.sort();
    quickSort.showLista();

    shellSort.sort();
    ShellSort.showLista();
}
