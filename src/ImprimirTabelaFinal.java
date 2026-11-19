public class ImprimirTabelaFinal {
    private static final String[] ALGORITMOS = {"QuickSort", "ShellSort", "HeapSort","MergeSort", "TimSort", "CocktailShakerSort"};

    public static void imprimir(int tamanho, long[] quaseOrdenado,
                                long[] desordenado, long[] ordemDecrescente) {
        System.out.println("\nTamanho do conjunto: " + tamanho);
        System.out.println("Tempos obtidos pelos algoritmos:");
        System.out.printf("%-22s %-25s %-25s %-25s%n",
                "Algoritmo", "Quase ordenado (s)",
                "Desordenado (s)", "Ordem decrescente (s)");

        for (int i = 0; i < ALGORITMOS.length; i++) {
            System.out.printf("%-22s %-25.6f %-25.6f %-25.6f%n",
                    ALGORITMOS[i],
                    quaseOrdenado[i] / 1_000_000_000.0,
                    desordenado[i] / 1_000_000_000.0,
                    ordemDecrescente[i] / 1_000_000_000.0);
        }
    }
}
