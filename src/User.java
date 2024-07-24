
    
// Java Program to Illustrate Student Class
// to take Input from the student and related Information

// Importing required classes
import java.util.Random;
import java.util.Scanner;

// Class
public class User {

	// Class member variables
	String Name;
	String Password;
	String mobileNumber;
	String emailId;
	String id;
	Book borrowedBooks[] = new Book[3];
	public int booksCount = 0;

	// Creating object of Scanner class to
	// take input from user
	Scanner input = new Scanner(System.in);

	// Constructor
	public User()
	{
		// Print statement
		System.out.println("Enter Name:");

		// This keywords refers to current instance
		this.Name = input.nextLine();
		System.out.println("Enter mobile Number:");
		this.mobileNumber = input.nextLine();
		System.out.println("Enter email Id:");
		this.emailId = input.nextLine();
		// Print statement
		System.out.println("Enter Password:");
		this.Password = input.nextLine();
		this.id = generateRandomID();
		System.out.println("Generated ID: " + this.id); // Display the generated ID
	}
	// Method to generate a 2-digit numerical ID
    public String generateRandomID() {
        Random random = new Random();
        int randomID = random.nextInt(90) + 10; // Generates a number between 10 and 99
        return String.valueOf(randomID);
    }
}


