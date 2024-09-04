import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();
        
        if (isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }

    public static boolean isFibonacci(int n) {
        if (n < 0) return false;

        int a = 0;
        int b = 1;
        
        while (a < n) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        
        return a == n;
    }
}
