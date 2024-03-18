import java.util.Arrays;

public class Exercicio9 {

    static int i,j, res=1;
    static int[][] matriz = new int[5][5];
    public static void matrizMultiplicacao(){
        //Preencher a matriz
        for(i=0; i<matriz.length; i++){
            for (j=0; j<matriz.length; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }

        //imprimir o resultado da matriz
        for (i=0; i<matriz.length; i++){
            for (j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j] +"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){

        matrizMultiplicacao();
    }
}
