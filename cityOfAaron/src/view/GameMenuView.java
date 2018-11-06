/*
 * GameMenuView.java
 *
 * The Player Class for the cityOfAaron project
 * Created in the view package.
 * 
 * Created on Nov 5, 2018, 4:15:01 PM
 * Created by Nick H
 *
 * CIT-260: 08
 * Fall 2018
 * Team members: Shane Artman, Nick Hammond, Jonathan Unga
 *
 * Purpose: <What is the purpose of the file?>
 */
package view;

import cityofaaron.CityOfAaron;
import java.util.Scanner;
import model.*;

public class GameMenuView {

    private String gameMenu;
    private int max;
    private static Scanner keyboard = new Scanner(System.in);
    private Game theGame = CityOfAaron.getGame();

    public GameMenuView() {
        gameMenu = "\n"
                + "*********************************\n"
                + "** CITY OF AARON: IN-GAME MENU **\n"
                + "*********************************\n"
                + " 1 - View the map\n"
                + " 2 - View/Print a list\n"
                + " 3 - Move to a new location\n"
                + " 4 - Manage the crops\n"
                + " 5 - Return to the Main menu\n";
        max = 5;
    }

    /**
     * displayMenuView Method 
     * Purpose: Dislay the Game Menu
     * Pre-Conditions:
     * @param
     * @returns none
     * ====================================================================
     */
    public void displayMenuView() {
        int menuOption;
        do {
            // display the game menu
            System.out.println(gameMenu);            
            // get user input
            menuOption = getMenuOption();
            // perform user action
            doAction(menuOption);

        } while (menuOption != max);
    }

    /**
     * getMenuOption Method 
     * Purpose:  Get users input for menu option
     * Pre-Conditions:
     * @param
     * @returns none
     * ====================================================================
     */
    public int getMenuOption() {
        int userInput = 0;
        final int MAX = 5;

        // begin loop
        do
        {
            // get user input from the keyboard
            userInput = keyboard.nextInt();
            // if it is not a valid value, output an error message
            if(userInput < 1 || userInput > MAX) {
                 System.out.println("Error: you must select 1, 2, 3, 4, or 5");
            }
            // loop back to the top of the loop if input was not valid
            // end loop
        } while (userInput < 1 || userInput > MAX);
        
        // return userinput
        return userInput;
    }

    /**
     * doAction Method 
     * Purpose: Perform action selected by user
     * Pre-Conditions:
     * @param option user input 1-5
     * @returns none
     * ====================================================================
     */
    public void doAction(int option) {
        switch(option)
        {
            case 1: // view map
                viewMap();
                break;
            case 2: // view lists menu
                viewList();
                break;
            case 3: // move to new location
                moveToNewLocation();
                break;
            case 4: // manage crops
                manageCrops();
                break;
            case 5: // return to main menu
                return;
        }
    }

    /**
     * viewMap Method 
     * Purpose: View map locations
     * Pre-Conditions:
     * @param
     * @returns none
     * ====================================================================
     */
    public void viewMap() {
        System.out.println("This is the viewMap method.");
    }

    /**
     * viewList Method 
     * Purpose: view list menu
     * Pre-Conditions:
     * @param
     * @returns none
     * ====================================================================
     */
    public void viewList() {
        System.out.println("This is the viewList method");
    }

    /**
     * moveToNewLocation Method 
     * Purpose: Change players location
     * Pre-Conditions:
     * @param
     * @returns none
     * ====================================================================
     */
    public void moveToNewLocation() {
        System.out.println("This is the moveToNewLocation method.");
    }

    /**
     * manageCrops Method 
     * Purpose: manage crops
     * Pre-Conditions:
     * @param
     * @returns none
     * ====================================================================
     */
    public void manageCrops() {
        System.out.println("This is the manageCrops method.");
    }

}
