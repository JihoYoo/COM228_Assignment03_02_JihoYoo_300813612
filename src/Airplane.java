/*
 * JihoYoo(300813612)
 * November 13, 2015
 * Assignment 3-2 : Airline Reservations System
 */
import java.util.Scanner;
public class Airplane {
	// PRIVATE PROPERTIES +++++++++++++++++++++++++++++++++++++++++
    private boolean[] seats = new boolean[10];
    Scanner userInput = new Scanner(System.in);
    // CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++
    public Airplane()
    {
        initializeArray();
    }

    // PRIVATE METHODS ++++++++++++++++++++++++++++++++++++++++++++
    // Initializes the value of checkValueArray as false
    private void initializeArray()
    {
        for (int index = 0; index < seats.length; index++)
        {
            this.seats[index] = false;
        }
    }

    // PUBLIC METHODS +++++++++++++++++++++++++++++++++++++++++++++
    // Assign a seat in the first-class section (seats 1–5).
    public void chooseFirstSeats() {
		 {
		        int index = 0;
		        while (index < 5)
		        {
		            if (seats[index] == false)
		            {
		                this.seats[index] = true;
		                this.printSeats();
		                break;
		            }
		            else if (index == 4)
		            {
		            	System.out.println();
		            	System.out.println("*** Every First class seats are not available ***");
		            	System.out.println("Next flight leaves in 3 hours");
		            	System.out.println();
		            }
		            index++;
		        }
		 }
		 }

   

    // Assign a seat in the economy section (seats 6–10).
    public void chooseSecSeats()
    {
        int index = 5;
        String changeSeat;

        while (index < 10)
        {
            if (seats[index] == false)
            {
                this.seats[index] = true;
                this.printSeats();
                break;
            }

            //When the economy section is full, ask the person about first­‐class section
            else if (index == 9)
            {
            	System.out.println();
            	System.out.println("*** Every Economy class seats are not available ***");
            	System.out.println("Do you want to reserve a first class seat? (y/n) : ");
                changeSeat = userInput.next();

                if (changeSeat == "y")
                    chooseFirstSeats();     
                else
                {
                	System.out.println("Next flight leaves in 3 hours");
                	System.out.println();
                }
         }
            index++;
        }
    }

    // Display seats state
    public void printSeats()
    {
    	System.out.println();
    	System.out.println("____FIRST CLASS____|____ECONOMY CLASS____");
    	System.out.println(" 1   2   3   4   5 | 6   7   8   9   10 ");
    	System.out.println("-----------------------------------------");
        for (int index = 0; index < seats.length; index++)
        {
            if (this.seats[index] == true)
            	System.out.print(" O  ");
            else
            	System.out.print(" X  ");
        }
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();
    }

	
	
}
