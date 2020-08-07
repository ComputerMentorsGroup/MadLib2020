package org.computermentors.NyjelDukes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Hello World! Enter your name: ");
        String name = getInput();

        System.out.print("Whats your favorite car? ");
        String car = getInput();

        System.out.println("Hello " + name + ". It's nice to meet you! Have you ever ridden in a " + car + "?");

        System.out.printf("Hello %s. It's nice to meet you! Have you ever ridden in a %s?", name, car);

    }

    public static String getInput(){
        Scanner scanner = new Scanner(System.in);
        String input;
        do{
            input = scanner.nextLine();
            try {
                if (input.isEmpty()) {
                    throw new IllegalArgumentException("input a name");
                }
            } catch (IllegalArgumentException iae){
                System.out.print(iae);
            }

        }while (input.isEmpty());
        return input;
    }
}
