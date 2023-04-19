import java.util.Scanner;

public class Main {
    public static boolean verificadorFibo(int n) {
        int a = 0, b = 1, c = 0;

        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }

        return c == n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = input.nextInt();

        if (verificadorFibo(n)) {
            System.out.println(n + " é um número de Fibonacci");
        } else {
            System.out.println(n + " não é um número de Fibonacci");
        }
    }
}
