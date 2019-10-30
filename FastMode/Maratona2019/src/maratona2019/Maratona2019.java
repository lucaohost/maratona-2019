package maratona2019;

import com.google.gson.Gson;

public class Maratona2019 {

    public static void main(String[] args) {
        Gson gson = new Gson();

//  Teste NumberSort
        int[] batata = {5, 4, 6, 3, 1};
        NumberSort.Sort(batata);
        System.out.println(gson.toJson(batata));
//  Teste NumberSort

//  Teste Futebol
        String[] a = {"V", "E", "D", "V", "V"};
        String[] b = {"D", "V", "V", "E", "D"};
        String[] c = {"V", "D", "D", "V", "V"};
        String[] d = {"E", "E", "E", "V", "V"};
        System.out.println(Futebol.DoWork(a, b, c, d));
//  Teste Futebol

//  Teste VectorSum
        int vetor[][] = {{1, 2, -1, 2, 3},
        {1, 3, 4, 2, 0},
        {8, 5, 1, 3, 2},
        {1, -2, 3, 4, 5}};
        System.out.println(VectorSum.DoWork(vetor));
//  Teste VectorSum

//  Teste Binario
        System.out.println(Binario.DoWork(4));
        System.out.println(Binario.DoWork(154));
//  Teste Binario

//  Teste Matriz
        float[] result = Equacao.DoWork(1, -10, 24);
        System.out.println(gson.toJson(result));
        int[][] matrizTop = {
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}};
        System.out.println(gson.toJson(Matriz.DoWork(matrizTop)));
//  Teste Matriz

//  Teste troco
        int[] troco = {10, 5};
        int[] fila = {25, 50, 50, 25, 100, 100, 100, 100, 100, 100};
        System.out.println(Change.DoWork(troco, fila));
//  Teste troco
    }

}
