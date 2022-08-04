package com.games;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Chapter_1 chapter_1 = new Chapter_1();

        Scanner userInput = new Scanner(System.in);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("            GAME TITLE");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        //Variable used to store user input
        String answer;

        do {

            System.out.println();
            System.out.println("MAIN MENU");
            System.out.println();
            System.out.println("(1) Start Game");
            System.out.println("(2) Exit");
            System.out.println();
            System.out.print("Please enter selection: ");

            answer = userInput.nextLine();

            //Checks if valid choice was entered from menu. If input is invalid, will prompt user and
            //loop back to MAIN MENU
            if (!isValidInput(new String[]{"1", "2"}, answer)) {
                System.out.println("Invalid choice: please enter '1', or '2'");
                System.out.println("\n");
            }

            // CHAPTER ONE SELECTIONS

            //GAME START
            if (answer.equalsIgnoreCase("1")) {
                chapter_1.chapterStart(answer);
                while (true) {
                    do {

                        String secondAnswer;
                        secondAnswer = userInput.nextLine();
                        if (!isValidInput(new String[]{"1", "2"}, answer)) {
                            System.out.println("Invalid choice: please enter '1', or '2'");
                            System.out.println("\n");
                        }
                        while (!isValidInput(new String[]{"1", "2"}, answer)) ;
                        // STAY ON ROAD
                        if (secondAnswer.equalsIgnoreCase("1")) {
                            chapter_1.decisionTree1(secondAnswer);
                            secondAnswer = userInput.nextLine();
                            //EXIT GAME
                            if (secondAnswer.equalsIgnoreCase("1")){
                                System.exit(0);
                            }
                            // GO INTO WOODS
                            else if(secondAnswer.equalsIgnoreCase("2")) {
                                chapter_1.decisionTree1(secondAnswer);
                            }
                        // GO INTO WOODS
                        } else if (secondAnswer.equalsIgnoreCase("2")) {
                            chapter_1.decisionTree1(answer);
                        }

                        // IF YOU TAKE THE EXIT
                    } while (!isValidInput(new String[]{"1", "2"}, answer));
                }
            }

            } while (!isValidInput(new String[]{"1", "2"}, answer)) ;

        }



            // Method used to validate user input
            // Takes an array of Strings of valid inputs and the user's input as arguments
            // Returns true if user's input is found in array of valid inputs. Otherwise returns false.
    public static boolean isValidInput (String[]validInputs, String userInput){
        for (String input : validInputs) {
            if (userInput.equalsIgnoreCase(input)) {
                return true;
            }
        }
        return false;
    }

}
