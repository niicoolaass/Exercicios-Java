import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("informe o primeiro valor:");
        double n1 = ler.nextInt();

        System.out.println("informe o primeiro valor:");
        double n2 = ler.nextInt();

        System.out.println("informe o primeiro valor:");
        double n3 = ler.nextInt();

        System.out.println("informe o primeiro valor:");
        double n4 = ler.nextInt();

        double media = (n1 + n2 + n3 + n4) / 4;

        if(media >= 6) {
            System.out.println("PARABÉNS! Você foi aprovado! sua media foi: " + media);

        } else
            System.out.println("Infelizmente você não foi aprovado. Sua media foi: " + media);
    }
}