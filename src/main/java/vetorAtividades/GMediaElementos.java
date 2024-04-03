package vetorAtividades;

public class GMediaElementos {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int soma = 0;
        for (int i = 0;i<vetor.length;i++) {
            soma += vetor[i];
        }
        float media = (float) soma/vetor.length;
            System.out.println("A média é: " + media );

}


}
