import java.util.Scanner;

public class Exercicio6 {

    static int v1= 0, v2=1, n3;

    public static void fibonace(int n1, int n2){

        for(int i=2; i<=10; i++){
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

    public static void main(String[] args){
      System.out.println("----------------------");
      System.out.println("SEQUENCIA DE FIBONACE");
      System.out.println("-----------------------");


        System.out.print(v1+" "+v2);
        fibonace(v1,v2);
    }
}
