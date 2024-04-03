package vetorAtividades;

import java.util.Random;

public class EVetorDinamicoAleatorio {
    public static void main(String[] args) {
        int[] vetor = new int[0];

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            vetor = adicionar(vetor, random.nextInt());
        }

        System.out.println("Número de elementos no vetor: " + vetor.length);
    }

    public static int[] adicionar(int[] vetorAntigo, int novoElemento) {
        int[] novoVetor = new int[vetorAntigo.length + 1];

        for (int i = 0; i < vetorAntigo.length; i++) {
            novoVetor[i] = vetorAntigo[i];
        }

        novoVetor[vetorAntigo.length] = novoElemento;
        return novoVetor;
    }
}
