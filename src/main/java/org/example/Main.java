package org.example;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        String computerChoice;
        String result;

        do {
            System.out.print("\nWelcome to the Rock Paper Scissors Game! \n Play the Game Have Fun\n");

            System.out.print("Enter your choice(rock, paper, scissors): ");
            String userChoice = sc.nextLine().toLowerCase();


            computerChoice = choices[rd.nextInt(3)];

            System.out.println("Computer Chose: " + computerChoice);


            if(userChoice.equals("rock") && computerChoice.equals("rock")){
                System.out.println("Its a TIE");
            } else if (userChoice.equals("paper") && computerChoice.equals("rock") ||
                    userChoice.equals("scissors") && computerChoice.equals("paper") ||
                    userChoice.equals("rock") && computerChoice.equals("scissors")) {
                System.out.println("Lets Go you WIN");

            }
            else {
                System.out.println("You LOOSE Boi");
            }

            System.out.print("Would you like to Play Again?(yes/no): ");
            result = sc.nextLine().toLowerCase();


        } while (result.equals("yes"));

            System.out.println("BYE BYE Thanks...");








    }
}