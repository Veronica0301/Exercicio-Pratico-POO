import java.util.Scanner;

public class Exercicio3 {
    static float y,z, res;

    public static float maiorValor(float valor1, float valor2){
       float result= (y>z)? y:z;
        return result;
    }

    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        System.out.print("Valor 1: ");
        y=x.nextFloat();

        System.out.print("Valor 2: ");
        z=x.nextFloat();

        float res = maiorValor(y,z);
        System.out.println("O maior valor é: "+res);
    }
}
