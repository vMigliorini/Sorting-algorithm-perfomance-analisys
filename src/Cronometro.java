public class Cronometro {
    public static long medir(Runnable operacao) {
        long inicio = System.nanoTime();
        operacao.run();
        return System.nanoTime() - inicio;
    }
}
