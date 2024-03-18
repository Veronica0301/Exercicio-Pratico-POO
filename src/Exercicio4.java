import java.util.Scanner;

public class Exercicio4 {
    static int y;


    public static void classificarNumero(int num){
        if(num>0){
            System.out.println("O mumero " +num+ " é POSITIVO.");
        }
        else if (num<0){
            System.out.println("O numero "+num+ " é NEGATIVO.");
        }
        else{
            System.out.println("O numero é ZERRO.");
        }
    }

    public static void main(String[] args){
        Scanner x= new Scanner(System.in);

        System.out.println("Insira um numero para classificar: ");
        y = x.nextInt();

       classificarNumero(y);
    }
}
