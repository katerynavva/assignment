package part1;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        // Variables of different types
        int intVar = 10;
        double doubleVar = 5.5;
        char charVar = 'A';
        boolean boolVar = true;
        String stringVar = "Hello";

        // Arithmetic operations
        int a = 8;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        a++;
        b--;
        System.out.println("Increment a: " + a);
        System.out.println("Decrement b: " + b);

        // Type casting
        int castInt = (int) doubleVar;
        double castDouble = (double) intVar;
        System.out.println("Double to int: " + castInt);
        System.out.println("Int to double: " + castDouble);

        // String operations
        System.out.println("String: " + stringVar);
        System.out.println("Uppercase: " + stringVar.toUpperCase());
        System.out.println("Contains 'ell': " + stringVar.contains("ell"));
        System.out.println("Starts with 'He': " + stringVar.startsWith("He"));
        System.out.println("Index of 'o': " + stringVar.indexOf('o'));

        // Input/Output
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = sc.nextInt();
        System.out.println("You entered: " + userNumber);

        // Arrays
        int[] arr = {1, 2, 3};
        System.out.println("First element of array: " + arr[0]);

        // Debugger note:
        System.out.println("Debug here!");

        // Compiler error examples:
        // System.out.println("Missing semicolon")   // error: ; expected
        // int wrongName = x + 1; // error: cannot find symbol (x is not defined)
        // System.out.println("Missing bracket"      // error: reached end of file while parsing
    }
}

