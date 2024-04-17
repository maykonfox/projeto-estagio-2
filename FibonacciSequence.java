import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSequence {
    
    public static List<Integer> generateFibonacciSequence(int n) {
        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        while (fib.get(fib.size() - 1) < n) {
            int nextFib = fib.get(fib.size() - 1) + fib.get(fib.size() - 2);
            fib.add(nextFib);
        }
        return fib;
    }
    
    public static boolean checkFibonacci(int num) {
        List<Integer> fibSequence = generateFibonacciSequence(num);
        return fibSequence.contains(num);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        if (checkFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }
}
