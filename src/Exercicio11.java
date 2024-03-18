public class Exercicio11 {

    static int n1= 0, n2=1, n3, i, multiplo;
    public static void fibonaceSemMUltiploDe4(){
        for( i=2; i<70; i++){
            n3 = n1+n2;
            n1=n2;
            n2=n3;

            multiplo= n3%4;
            if (multiplo==0){
                continue;
            }
            if(n3>100){
                break;
            }
            System.out.print(" "+n3);
        }
    }

    public static void main(String[] args) {

        System.out.print(n1+" "+n2);
        fibonaceSemMUltiploDe4();


    }
}
