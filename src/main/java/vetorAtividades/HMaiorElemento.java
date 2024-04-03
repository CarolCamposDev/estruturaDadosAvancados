package vetorAtividades;

public class HMaiorElemento {
    public static void main(String[] args) {
        int[] vetor = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};

        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println(maior);
    }
}
