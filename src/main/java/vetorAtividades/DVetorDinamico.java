package vetorAtividades;

import static java.awt.AWTEventMulticaster.add;

public class DVetorDinamico {
    public static void main(String[] args) {
        int[] vetor = new int[0];
        vetor = add(vetor, 1);
        vetor = add(vetor, 2);
        vetor = add(vetor, 3);
        vetor = add(vetor, 4);
        vetor = add(vetor, 5);

        for (int elemento : vetor) {
            System.out.println(elemento);
        }
    }

    public static int[] add(int[] vetorAntigo, int valor) {
        int[] vetorNovo = new int[vetorAntigo.length + 1];

        for (int i = 0; i < vetorAntigo.length; i++) {
            vetorNovo[i] = vetorAntigo[i];
        }

        vetorNovo[vetorAntigo.length] = valor;
        return vetorNovo;
    }

}
