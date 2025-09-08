package part2;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi! Let's talk a little");

        System.out.print("1) What is your name? ");
        String name = sc.nextLine();

        System.out.print("2) How old are you? ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("3) What is your favorite color? ");
        String color = sc.nextLine();

        System.out.print("4) What is your favorite food? ");
        String food = sc.nextLine();

        System.out.print("5) What city do you live in? ");
        String city = sc.nextLine();

        System.out.print("6) What is your favorite number? ");
        double favNum = sc.nextDouble();
        sc.nextLine();

        System.out.print("7) Do you like cats? (true/false) ");
        boolean likesCats = sc.nextBoolean();
        sc.nextLine();

        System.out.print("8) Write any short word you like: ");
        String shortWord = sc.nextLine();

        System.out.print("9) What is your email? ");
        String email = sc.nextLine();

        System.out.print("10) What year were you born? ");
        int year = sc.nextInt();

        boolean emailHasAt = email.contains("@");
        boolean nameStartsWithA = name.startsWith("A");
        int indexOfO = shortWord.indexOf("o");

        System.out.println("\n--- Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favorite color: " + color);
        System.out.println("Favorite food: " + food);
        System.out.println("City: " + city);
        System.out.println("Favorite number: " + favNum);
        System.out.println("Likes cats: " + likesCats);
        System.out.println("Short word: " + shortWord);
        System.out.println("Email has '@'? " + emailHasAt);
        System.out.println("Does your name start with A? " + nameStartsWithA);
        System.out.println("Index of 'o' in your short word: " + indexOfO);
        System.out.println("Year of birth: " + year);

        System.out.println("\nIt was nice to chat with you");

    }
}

