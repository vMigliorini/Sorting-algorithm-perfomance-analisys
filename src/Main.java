
import java.util.Arrays;

public static void main(String[] args) {

    int tamanho = 100;

    // Conjuntos Quase Ordenados CQO
    int[] conjuntoQuaseOrdenado = GeradorConjunto.gerarConjuntoQuaseOrdenado(tamanho);
    System.out.println(Arrays.toString(conjuntoQuaseOrdenado));

    QuickSort quickSortCQO = new QuickSort(Arrays.copyOf(conjuntoQuaseOrdenado, conjuntoQuaseOrdenado.length));
    ShellSort shellSortCQO = new ShellSort(Arrays.copyOf(conjuntoQuaseOrdenado, conjuntoQuaseOrdenado.length));
    MergeSort mergeSortCQO = new MergeSort(Arrays.copyOf(conjuntoQuaseOrdenado, conjuntoQuaseOrdenado.length));
    HeapSort heapSortCQO = new HeapSort(Arrays.copyOf(conjuntoQuaseOrdenado, conjuntoQuaseOrdenado.length));
    TimSort timSortCQO = new TimSort(Arrays.copyOf(conjuntoQuaseOrdenado, conjuntoQuaseOrdenado.length));
    CocktailShakerSort cocktailShakerSortCQO = new CocktailShakerSort(Arrays.copyOf(conjuntoQuaseOrdenado, conjuntoQuaseOrdenado.length));

    long tempoQuickSortQOD = Cronometro.medir(quickSortCQO::sort);

    long tempoShellSortQOD = Cronometro.medir(shellSortCQO::sort);

    long tempoMergeSortQOD = Cronometro.medir(mergeSortCQO::sort);

    long tempoHeapSortQOD = Cronometro.medir(heapSortCQO::sort);

    long tempoTimSortQOD = Cronometro.medir(timSortCQO::sort);

    long tempoCocktailShakerSortQOD = Cronometro.medir(cocktailShakerSortCQO::sort);

    ImprimirTabela.imprimir("Conjunto quase ordenado", tempoQuickSortQOD, tempoShellSortQOD, tempoMergeSortQOD, tempoHeapSortQOD, tempoTimSortQOD, tempoCocktailShakerSortQOD);

    // Conjuntos Desordenados CD

    int[] conjuntoDesordenado = GeradorConjunto.gerarConjuntoDesordenado(tamanho);
    System.out.println(Arrays.toString(conjuntoQuaseOrdenado));

    QuickSort quickSortCD = new QuickSort(Arrays.copyOf(conjuntoDesordenado, conjuntoDesordenado.length));
    ShellSort shellSortCD = new ShellSort(Arrays.copyOf(conjuntoDesordenado, conjuntoDesordenado.length));
    MergeSort mergeSortCD = new MergeSort(Arrays.copyOf(conjuntoDesordenado, conjuntoDesordenado.length));
    HeapSort heapSortCD = new HeapSort(Arrays.copyOf(conjuntoDesordenado, conjuntoDesordenado.length));
    TimSort timSortCD = new TimSort(Arrays.copyOf(conjuntoDesordenado, conjuntoDesordenado.length));
    CocktailShakerSort cocktailShakerSortCD = new CocktailShakerSort(Arrays.copyOf(conjuntoDesordenado, conjuntoDesordenado.length));

    long tempoQuickSortCD = Cronometro.medir(quickSortCD::sort);

    long tempoShellSortCD = Cronometro.medir(shellSortCD::sort);

    long tempoMergeSortCD = Cronometro.medir(mergeSortCD::sort);

    long tempoHeapSortCD = Cronometro.medir(heapSortCD::sort);

    long tempoTimSortCD = Cronometro.medir(timSortCD::sort);

    long tempoCocktailShakerSortCD = Cronometro.medir(cocktailShakerSortCD::sort);

    ImprimirTabela.imprimir("Conjunto desordenado", tempoQuickSortCD, tempoShellSortCD, tempoMergeSortCD, tempoHeapSortCD, tempoTimSortCD, tempoCocktailShakerSortCD);

    // Conjuntos em Ordem Decrescente COD

    int[] conjuntoDecrescente = GeradorConjunto.gerarConjuntoDecrescente(tamanho);
    System.out.println(Arrays.toString(conjuntoDecrescente));

    QuickSort quickSortCOD = new QuickSort(Arrays.copyOf(conjuntoDecrescente, conjuntoDecrescente.length));
    ShellSort shellSortCOD = new ShellSort(Arrays.copyOf(conjuntoDecrescente, conjuntoDecrescente.length));
    MergeSort mergeSortCOD = new MergeSort(Arrays.copyOf(conjuntoDecrescente, conjuntoDecrescente.length));
    HeapSort heapSortCOD = new HeapSort(Arrays.copyOf(conjuntoDecrescente, conjuntoDecrescente.length));
    TimSort timSortCOD = new TimSort(Arrays.copyOf(conjuntoDecrescente, conjuntoDecrescente.length));
    CocktailShakerSort cocktailShakerSortCOD = new CocktailShakerSort(Arrays.copyOf(conjuntoDecrescente, conjuntoDecrescente.length));

    long tempoQuickSortCOD = Cronometro.medir(quickSortCOD::sort);

    long tempoShellSortCOD = Cronometro.medir(shellSortCOD::sort);

    long tempoMergeSortCOD = Cronometro.medir(mergeSortCOD::sort);

    long tempoHeapSortCOD = Cronometro.medir(heapSortCOD::sort);

    long tempoTimSortCOD = Cronometro.medir(timSortCOD::sort);

    long tempoCocktailShakerSortCOD = Cronometro.medir(cocktailShakerSortCOD::sort);

    ImprimirTabela.imprimir("Conjunto decrescente", tempoQuickSortCOD, tempoShellSortCOD, tempoMergeSortCOD, tempoHeapSortCOD, tempoTimSortCOD, tempoCocktailShakerSortCOD);


    

    ImprimirTabelaFinal.imprimir(
        tamanho,
        new long[]{tempoQuickSortQOD, tempoShellSortQOD, tempoHeapSortQOD,
                tempoMergeSortQOD, tempoTimSortQOD, tempoCocktailShakerSortQOD},
        new long[]{tempoQuickSortCD, tempoShellSortCD, tempoHeapSortCD,
                tempoMergeSortCD, tempoTimSortCD, tempoCocktailShakerSortCD},
        new long[]{tempoQuickSortCOD, tempoShellSortCOD, tempoHeapSortCOD,
                tempoMergeSortCOD, tempoTimSortCOD, tempoCocktailShakerSortCOD});

}
