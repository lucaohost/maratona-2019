package maratona2019;

class VectorSum {

    static int DoWork(int[][] vetor) {
        int sumLinha0 = vetor[0][0] + vetor[0][1] + vetor[0][2] + vetor[0][3] + vetor[0][4];
        int sumLinha1 = vetor[1][0] + vetor[1][1] + vetor[1][2] + vetor[1][3] + vetor[1][4];
        int sumLinha2 = vetor[2][0] + vetor[2][1] + vetor[2][2] + vetor[2][3] + vetor[2][4];
        int sumLinha3 = vetor[3][0] + vetor[3][1] + vetor[3][2] + vetor[3][3] + vetor[3][4];
        int[] linha = {sumLinha0, sumLinha1, sumLinha2, sumLinha3};
        int total = 0;
        for (int sumLinha : linha) {
            total += sumLinha;
        }
        return total;
    }
}
