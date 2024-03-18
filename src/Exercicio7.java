import java.util.Scanner;

public class Exercicio7 {

    public static void adicao(int num){
        for(int i=1; i<=10 ; i++){
            int res= num + i;
            System.out.println(num +" + "+ i+  " = " +res);
        }
    }

    public static void subtracao(int num){
        for(int i=1; i<=10 ; i++){
            int res= num - i;
            System.out.println(num +" - "+ i+  " = " +res);
        }
    }

    public static void divisao(int num) {
        for(float i=1; i<=10 ; i++){
            float res= num / i;
            System.out.println(num +" / "+ i+  " = " +res);
        }
    }

    public static void multiplicacao(int num){
        for(int i=1; i<=10 ; i++){
            int res= num * i;
            System.out.println(num +" x "+ i+  " = " +res);
        }
    }

    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        Scanner y= new Scanner(System.in);

        System.out.println("Insira um numero da casa de tabuada que deseja: ");
        int valor = x.nextInt();

        System.out.println("Insira um operador aritmetico (+, -, /, *): ");
        String op= y.nextLine();

        System.out.println("-----------------");
        System.out.println("|TABUADA CASA "+valor+ "|");
        System.out.println("------------------");

        switch (op){
            case "+":
                adicao(valor);
                break;

            case "-":
                subtracao(valor);
                break;

            case "/":
               divisao(valor);
                break;

            case "*":
                multiplicacao(valor);
                break;

            default:
                System.out.println("Operador Incorreto.");
        }
    }
}
