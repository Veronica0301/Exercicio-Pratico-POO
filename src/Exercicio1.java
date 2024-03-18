import java.util.Scanner;

public class Exercicio1 {

    static float v1, v2, v3, media;

    public static float calcularMedia(float valor1, float valor2, float valor3) {
        return (valor1 + valor2 + valor3) / 3;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Insira valor 1: ");
         v1 = x.nextFloat();

        System.out.print("Insira valor 2: ");
         v2 = x.nextFloat();

        System.out.print("Insira valor 3: ");
         v3 = x.nextFloat();

         media = calcularMedia(v1,v2,v3);

        System.out.println("A media é de: " +media);
    }

}