import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("informe um valor:");
        double n1 = ler.nextInt();

        System.out.println("informe outro valor:");
        double n2 = ler.nextInt();

        while (n2 < 0 || n2 == 0){
            System.out.println("informe um valor maior que zero.");

            n2 = ler.nextDouble();
        }

        System.out.println("A divisão entre o primeiro  valor e o segundo é: " + n1/n2);
    }
}