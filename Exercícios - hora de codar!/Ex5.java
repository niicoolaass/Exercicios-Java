import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("informe um valor:");
        double n = ler.nextInt();

        if (n > 0) {
            System.out.println("o valor: " + n + " é positivo.");

        } else if (n == 0) {
            System.out.println("o valor: " + n + " é neutro.");

        } else {
            System.out.println("o valor: " + n + " é negativo.");

        }

    }
}