import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("informe o primeiro valor:");
        double n1 = ler.nextInt();

        System.out.println("informe o segundo valor:");
        double n2 = ler.nextInt();

        System.out.println("informe o terceiro valor:");
        double n3 = ler.nextInt();

        if (n1 == n2 || n1 == n3 || n2 == n1 || n2 == n3 || n3 == n1 || n3 == n2) {
            System.out.println("Não informe valores iguais.");

        } else if (n1 > n2) {
            System.out.println("A soma dos dois maiores é o primeiro e o terceiro: " + (n1 + n3));

        } else if (n2 > n1) {
            System.out.println("A soma dos dois maiores é o segundo e o terceiro: " + (n2 + n3));

        } else {
            System.out.println("A soma dos dois maiores é o primeiro e o terceiro: " + (n1 + n2));

        }

    }
}