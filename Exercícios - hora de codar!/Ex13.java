import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        for(int i = 0; i <10; i++){
            System.out.print("Digite um numero: ");
            numbers[i] = scanner.nextInt();
        }

        for(int j = 0; j < numbers.length; j++){
            sum+= numbers[j];
        }

        int media = sum / 10;
        System.out.println("A soma dos numeros é: " + media);

    }
}
