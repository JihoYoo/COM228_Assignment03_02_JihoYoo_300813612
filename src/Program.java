/*
 * JihoYoo(300813612)
 * November 13, 2015
 * Assignment 3-2 : Airline Reservations System
 */
import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args)  {
        int selection = 0;
        Random rnd = new Random();
        Airplane air = new Airplane();
        Scanner userInput = new Scanner(System.in);



        while (selection != 3)
        {
        	System.out.println("++++++++++++++++++++++++++++++++++");
        	System.out.println("+                                +");
        	System.out.println("+    1. For first class          +");
        	System.out.println("+    2. For economy              +");
        	System.out.println("+    3. Exit                     +");
        	System.out.println("+                                +");
        	System.out.println("++++++++++++++++++++++++++++++++++");
        	System.out.println("Please make your selection: ");
            
            try
            {
                selection = userInput.nextInt();

            }
            catch (Exception error)
            {
            	System.out.println(error.getMessage());
                selection = 0;
            }

            switch (selection)
            {
                case 1:
                    air.chooseFirstSeats();
                    break;
                case 2:
                    air.chooseSecSeats();
                    break;
                case 3:
                	System.out.println();
                    break;
                default:
                	System.out.println();
                	System.out.println("Incorrect entry. Please try again....\n");
                    break;
            }
        }
    }   

}
