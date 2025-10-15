package MATRIZES;

//Duas formas de preencher o espaço das minhas matrizes de forma manual

public class manual {
    public static void main(String[] args){

        //PRIMEIRA FORMA:
        /*int[][] mat1 = new int[2][2];
        mat1[0][0] = 2;
        mat1[0][1] = 2;
        mat1[1][0] = 2;
        mat1[1][1] = 2;

        int[][] mat2 = new int[2][2];
        mat2[0][0] = 2;
        mat2[0][1] = 2;
        mat2[1][0] = 2;
        mat2[1][1] = 2;*/

        //SEGUNDA FORMA:
        int[][] mat1 = new int[][]{
                {2, 2},
                {2, 2}
        };

        int[][] mat2 = new int[][]{ {2, 2}, {2, 2}};

        //Soma entre as matrizes
        for(int i = 0; i < mat1.length; i++){
            for(int j = 0; j < mat1[1].length; j++){
                int soma = (mat1[i][j] + mat2[i][j]);
                System.out.print(" " + soma);
            }System.out.println();
        }
    }
}

