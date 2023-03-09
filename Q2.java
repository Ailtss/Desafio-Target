import java.util.Scanner;


//Questão sobre calcular a sequência de Fibonacci e verificar se o número fornecido pelo usuário pertence a ela.

//Problem to solve: Calculate the Fibonacci sequence and verify if the number typed by the user belongs to it.
public class Q2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int number = Integer.valueOf(scanner.nextLine());

        boolean isTrue = fibo(number);


        if (isTrue) {

            System.out.println("Pertence a sequência de Fibonacci.");
        } else {

            System.out.println("Não pertence a sequência de Fibonacci.");
        }
    

    }

    public static boolean fibo(int number) {

        int first = 0;
        int second = 1;

        int sum = 0;

        if (number == first || number == second) {

            return true;
        } 


        while (true) {

            sum = first + second;
            first = second;
            second = sum;

            if (number == first || number == second) {

                return true;

            } else if (number > first && number < second) {

                return false;
            }

        }
        
    }

    
}