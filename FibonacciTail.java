import java.util.Scanner;

public class FibonacciTail {
    public static void main(String args[]) {
        System.out.print("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Fibonacci: ");

        for(int i=1; i<=number; i++){
            System.out.print(fib2(i) +" ");
        }
    }

    public static long fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n -1) + fib(n -2); //tail recursion
    }

    public static long fib2(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        int n1 =1, n2 =1, fibonacci=1;
        for(int i = 3; i<= n; i++){


            fibonacci = n1 + n2;
            n1 = n2;
            n2 = fibonacci;

        }
        return fibonacci;

    }

}