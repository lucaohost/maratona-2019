package maratona2019;

class Matriz {

    static int[] DoWork(int[][] matriz) {
        int maiorValor = matriz[0][0];
        maiorValor = matriz[1][1] > maiorValor ? matriz[1][1] : maiorValor;
        maiorValor = matriz[2][2] > maiorValor ? matriz[2][2] : maiorValor;
        maiorValor = matriz[3][3] > maiorValor ? matriz[3][3] : maiorValor;
        maiorValor = matriz[4][4] > maiorValor ? matriz[4][4] : maiorValor;
        maiorValor = matriz[6][6] > maiorValor ? matriz[5][5] : maiorValor;
        maiorValor = matriz[7][7] > maiorValor ? matriz[7][7] : maiorValor;
        maiorValor = matriz[8][8] > maiorValor ? matriz[8][8] : maiorValor;
        maiorValor = matriz[9][9] > maiorValor ? matriz[9][9] : maiorValor;
        int somaDiagonalSecundaria = 0;
        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                if (coluna == 10 - 1 - linha) {
                    somaDiagonalSecundaria += matriz[linha][coluna];
                }
            }

        }
        int[] resultado = {maiorValor, somaDiagonalSecundaria};
        return resultado;
    }
}
