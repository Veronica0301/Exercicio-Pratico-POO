public class Exercicio10 {

    public static void triangulo(){
        for (int i= 2; i<8; ++i){
            for(int j=1; j<i; ++j){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        triangulo();
    }
}
