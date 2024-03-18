import java.util.Scanner;

public class Exercicio5 {

    static int y;

    public static String diaSemana(int v1){
        String resposta;

        switch (v1) {
            case 1:
                resposta="Segunda Feira";
                break;

            case 2:
                resposta="Terça Feira";
                break;

            case 3:
                resposta="Quarta Feira";
                break;

            case 4:
                resposta="Quinta Feira";
                break;

            case 5:
                resposta="Sexta Feira";
                break;

            case 6:
                resposta="Sabado";
                break;

            case 7:
                resposta="Domingo";
                break;

            default:
                resposta="Este numero esta fora do entervalo.";
                break;
        }

        return resposta;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Escolha um numero entre 1 e 7: ");
        int y = x.nextInt();

        System.out.println(diaSemana(y));
    }
}
