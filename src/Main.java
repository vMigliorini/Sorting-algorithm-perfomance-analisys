void main() {
    int[] lista = {1, 54, 23, 5, 3, 7, 1, 9, 0};

    QuickSort quickSort = new QuickSort(lista);
    ShellSort shellSort = new ShellSort(lista);
    MergeSort mergeSort = new MergeSort(lista);
    HeapSort heapSort = new HeapSort(lista);
    TimSort timSort = new TimSort(lista);
    CocktailShakerSort cocktailShakerSort = new CocktailShakerSort(lista);

    quickSort.sort();
    quickSort.showLista();

    shellSort.sort();
    ShellSort.showLista();

    mergeSort.sort();
    mergeSort.showLista();

    heapSort.sort();
    heapSort.showLista();

    timSort.sort();
    timSort.showLista();

    cocktailShakerSort.sort();
    cocktailShakerSort.showLista();

}
