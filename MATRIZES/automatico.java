package MATRIZES;

/*
A evolução disso seria ver um metodo para simplismente agregar um valor
a todos os espaços de memoria disponível por uma matriz
*/

public class automatico {
    public static void main(String[] args){

        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];

        //Loop com a primeira matriz
        for(int i = 0; i < mat1.length; i++){
            for(int j = 0; j < mat1[i].length; j++){
                mat1[i][j] = 2;
            }
        }
        //Loop com a segunda matriz:
        for(int i = 0; i < mat2.length; i++){
            for(int j = 0; j < mat2[i].length; j++){
                mat2[i][j] = 2;
            }
        }
        //Soma entre as matrizes:
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){

                int soma = (mat1[i][j] + mat2[i][j]);
                System.out.print(" " + soma);

            }System.out.println();
        }
    }
}


