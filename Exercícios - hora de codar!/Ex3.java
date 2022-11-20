import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("informe seu nome: ");
        String nome = ler.nextLine(); 

        Scanner numero = new Scanner(System.in);
        System.out.println("informe sua idade: ");
        int idade = numero.nextInt(); 

        System.out.println("Olá, " + nome + ", sua idade é " + idade + " anos.");
    }
}