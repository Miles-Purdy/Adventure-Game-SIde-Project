package com.games;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Chapter_1 {

    private String text = new String();

    private String goIntoWoodsText = "You take the exit. The forest road winding deeper into the shade. Deer warnings and a ‘Welcome to Allegheny National Forest’ sign greet you." + "\n" + "You reflect on the day. Last night. You could have done something different, that much is obvious." + "\n" +  "What that would have been, is not.";



    public Chapter_1(){

    }

    //getters/setters
    public String getText() {return text;}

    public void chapterStart(String selection) {

        text = "Traffic has come to a stop. It has been stopped for forty minutes." + "\n" +
                "The dashboard clock says it’s nearly eight o’clock." + "\n" +
                "The sun is setting behind you, the gleam of the cars would blind you if you were sitting upright."
                + "\n" + "\n" + "You’re not." + "\n" + "\n" + "Currently, you are hunched over the steering wheel. Another migraine is coming on." +
                "\n" + "You check your GPS. The delay time has only been going up and up and up. You see a sign." + "\n" +
                "It says there’s an exit in a quarter mile, into the national forest";
        System.out.println(text);
        System.out.println("\n");
        System.out.println("(1) STAY ON ROAD");
        System.out.println("(2) TAKE THE EXIT");
    }

    public void decisionTree1(String selection) {
        if (selection.equals("1")) {
            System.out.println("Time passes. The air conditioner whines, and then dies." + "\n" + "The heat from the tarmac feels like it’s cooking you through the upholstery. ");
            if (selection.equalsIgnoreCase("1")) {
                System.out.println("");
                System.out.println("(1) Exit Game, because you refused the call to adventure like a big dumb idiot.");
                System.out.println("(2) Get off the highway and enter the forest.");
                System.out.println("");
                if (selection.equalsIgnoreCase("1")) {
                }
                if(selection.equalsIgnoreCase("2")) {
                    System.out.println(goIntoWoodsText);
                }
            }
            else if (selection.equalsIgnoreCase("2")) {
                System.out.println(goIntoWoodsText);
            }
        }
        else if(selection.equalsIgnoreCase("2")) {
            System.out.println(goIntoWoodsText);
        }
    }

    public void decisionTree2 (String selection) {

    }



}
