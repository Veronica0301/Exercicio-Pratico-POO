import java.util.Scanner;

public class Exercicio2 {

    static int y;
    static int z;
    static boolean result;

    static boolean w;

    public static boolean verificarValor(int valor1, int valor2){
        if(valor1>0 && valor2>0){
            return true;
        }else {
           return false;
        }

    }

    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);

        System.out.println("Valor 1: ");
        y= x.nextInt();

        System.out.println("valor 2: ");
        z=x.nextInt();

       result= verificarValor(y,z);
        System.out.println(result);

    }
}
