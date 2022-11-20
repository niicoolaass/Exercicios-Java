import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("informe o primeiro valor:");
        double n1 = ler.nextInt();

        System.out.println("informe o segundo valor:");
        double n2 = ler.nextInt();

        System.out.println("informe o terceiro valor:");
        double n3 = ler.nextInt();

        if (n1 == n2 || n1 == n3 || n2 == n1 || n2 == n3 || n3 == n1 || n3 == n2){
            System.out.println("Não informe valores iguais.");

        } else if (n1 > n2 && n1 > n3) {
            System.out.println("O maior valor é o primeiro: " + n1);

        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior valor é o segundo: " + n2);

        } else {
            System.out.println("O maior valor é o terceiro: " + n3);
        }
    }
}