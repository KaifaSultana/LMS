

// Java Program to Illustrate students Class
// To Do all the Operations related to students:
// add Students,check-in books,check out books,ValidStudent

// Importing required classes
import java.util.Scanner;

// Class
public class LibrarianOperation extends StudentOperation{

	// Creating objects of Scanner and students class
	Scanner input = new Scanner(System.in);
	User theLibrarian[] = new User[50];

	public static int count = 0;

	// Method 1
	// To add Librarian
	public void addLibrarian(User s)
	{
		for (int i = 0; i < count; i++) {

			if (s.Name.equalsIgnoreCase(
					theLibrarian[i].Name)) {

				// Print statement
				System.out.println(
					"Librarian is Already Registered.");

				return;
			}
		}
		if (count <= 50) {
			theLibrarian[count] = s;
			count++;
		}
	}

	// Method 3
	// To check the Student
	
	public int isLibrarian()
	{
		// Display message only
		System.out.println("Enter Librarian Name:");

		String LbName = input.nextLine();
		System.out.println("Enter Password:");

		String LbPassword = input.nextLine();

		for (int i = 0; i < count; i++) {

			if (theLibrarian[i].Name.equalsIgnoreCase(
					LbName)) {
						if (theLibrarian[i].Password.equals(LbPassword)) {
							// Password is valid, return the index
							return i;		
				
			}
			else{
                // Password is invalid, display a message
                System.out.println("Invalid password for the Librarian.");
                return -1; // Return -1 to indicate an invalid the Librarian
            }
		}
		
	}
		// Print statements
		System.out.println("Librarian is not Registered.");
		System.out.println("Get Registered First.");

		return -1;
	}

	

}

