import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int firstParam = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int secondParam = scanner.nextInt();

        try {
            count(firstParam, secondParam);
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    static void count(int firstParam, int secondParam) throws InvalidParamsException {
        if (firstParam > secondParam) {
            throw new InvalidParamsException();
        }

        int numberCounter = secondParam - firstParam;

        for (int count = 1; count <= numberCounter; count++) {
            System.out.println("Imprimindo o número ".concat(String.valueOf(count)));
        }
    }
}
