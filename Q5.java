import java.util.Scanner;
import java.util.Arrays;



//Questão 05 do Desafio Target para criar um programa que reverta uma String.

//Problem to solve: Create a program that reverts a string.

public class Q5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string: ");
        String string = scanner.nextLine();
        
        System.out.println("Sua string: " + string);
        

        System.out.println("String invertida: " + reverseString(string));

    }

    public static String reverseString (String string) {

        char[] array = new char[string.length()];

        int count = 1;

        for (int i = 0; i < string.length(); i++) {

            array[i] = string.charAt(string.length() - count);
            count = count + 1;
        }

        String invertedString = String.valueOf(array);

        return invertedString;
    }
    
}
