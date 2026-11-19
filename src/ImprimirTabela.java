public class ImprimirTabela {
    public static void imprimir(String nomeConjunto, long... tempos) {
        String[] algoritmos = {"QuickSort", "ShellSort", "MergeSort", "HeapSort", "TimSort", "CocktailShakerSort"};

        System.out.println("\nTempos - " + nomeConjunto);
        System.out.println("---------------------------------------");
        System.out.printf("%-22s %12s%n", "Algoritmo", "Tempo (s)");
        System.out.println("---------------------------------------");

        for (int i = 0; i < algoritmos.length; i++) {
            System.out.printf("%-22s %12.9f%n",
                    algoritmos[i], tempos[i] / 1_000_000_000.0);
        }

        System.out.println("---------------------------------------");
    }
}
