import java.util.Random;

public class GeradorConjunto {
    //Gera número aleatório para 
    private static Random random = new Random();

    //Cria lista de números ordenados para usar de base para os outros
    public static int[] gerarConjuntoOrdenado(int tamanho) {
        int[] lista = new int[tamanho];
        for(int i = 0; i<tamanho; i++) {
            lista[i] = i; //+ 1_000_000_000
        }
        return lista;
    }

    public static int[] gerarConjuntoQuaseOrdenado(int tamanho) {
        int[] lista = gerarConjuntoOrdenado(tamanho);
        //int quantidade = (tamanho/100) * 7;
        int quantidade = Math.max(2, (int) Math.ceil(tamanho * 0.07));
        for(int i = 0; i<quantidade; i++) {
            int numeroAleatorio = i + random.nextInt(tamanho - i);
            int elemento = lista[i];
            lista[i] = lista[numeroAleatorio];
            lista[numeroAleatorio] = elemento;
        }
        return lista;
    }

    public static int[] gerarConjuntoDesordenado(int tamanho) {
        int[] lista = gerarConjuntoOrdenado(tamanho);
        for(int i = tamanho-1; i>0; i--) {
            int numeroAleatorio = random.nextInt(i+1);
            int elemento = lista[i];
            lista[i] = lista[numeroAleatorio];
            lista[numeroAleatorio] = elemento;
        }
        return lista;
    }

    public static int[] gerarConjuntoDecrescente(int tamanho) {
        int[] lista = gerarConjuntoOrdenado(tamanho);
        for(int i = 0; i<tamanho/2; i++) {
            int elemento = lista[i];
            lista[i] = lista[tamanho-1-i];
            lista[tamanho-1-i] = elemento;
        }
        return lista;
    }
}

