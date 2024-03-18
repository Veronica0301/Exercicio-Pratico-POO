import java.util.Scanner;

public class Exercicio8 {

    static int y, result=0;
    public static void somarNumeros(){
        Scanner x= new Scanner(System.in);
        do {
            y= x.nextInt();
            result = result + y;
        }while (y!=0);
        System.out.println("A soma entre os numeros é de: "+result);
    }
    public static void main(String[] args){

        System.out.println("Insira numeros: ");

        somarNumeros();
    }
}
