
// Java Program to Illustrate Application CLass
// To Create The Menu For the Program

// Importing required classes
import java.util.Scanner;

// Class
public class Library {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating object of Scanner class
		// to take input from user
		Scanner input = new Scanner(System.in);

		// Displaying menu
		System.out.println(
			"********************Welcome to the Digital Library!********************");
		System.out.println(
			"				 Select From The Following Options:			 ");
		System.out.println(
			"**********************************************************************");

		// Creating object of book class
		BookOperations ob = new BookOperations();
		// Creating object of students class
		StudentOperation obStudent = new StudentOperation();
        // Creating object of Libraryoperation class
        LibrarianOperation obLibrary = new LibrarianOperation();

		int choice;
		int choice0;
		int choice1;
		int searchChoice;
		
		do{
			ob.dispMenu1();
			choice1 = input.nextInt();

			// Switch case for registration or login
			switch (choice1) {

				// Case
			case 1:
			//login options
			do{
				ob.dispMenu2();
				choice1 = input.nextInt();
				switch (choice1) {
					//login as student
					case 1:
					int studentIndex = obStudent.isStudent();
					if (studentIndex > -1)
					do{
						ob.dispMenuStudent();
						choice = input.nextInt();
						switch (choice) {
							
							case 1:
				
								System.out.println(
									" press 1 to Search with Book Serial No.");
								System.out.println(
									" Press 2 to Search with Book's Author Name.");
								searchChoice = input.nextInt();
				
								// Nested switch
								switch (searchChoice) {
				
									// Case
								case 1:
									ob.searchBySno();
									break;
				
									// Case
								case 2:
									ob.searchByAuthorName();
									break;
								}break;
								
				
								// Case
							case 2:
								ob.showAllBooks();
								break;
				
								// Case
							
							case 3:
								ob.checkOutBook();
								break;
				
								// Case
							case 4:
								ob.checkInBook();
								break;
				
								// Default case that will execute for sure
								// if above cases does not match
							default:
				
								// Print statement
								System.out.println("ENTER BETWEEN 0 TO 4.");
							}
							
					}
					// Checking condition at last where we are
					// checking case entered value is not zero
					while (choice != 0);	
					break;
					//login as Librarian
					case 2:
					int LibrarianIndex = obLibrary.isLibrarian();
					if (LibrarianIndex > -1)
					do{
						ob.dispMenuLibratian();
						choice0 = input.nextInt();
						switch (choice0) {
							case 1:
		
							Book b = new Book();
							ob.addBook(b);
							break;
			
							// Case
							case 2:
							ob.upgradeBookQty();
							break;
			
							// Case search book
							case 3:
				
								System.out.println(
									" press 1 to Search with Book Serial No.");
								System.out.println(
									" Press 2 to Search with Book's Author Name.");
								searchChoice = input.nextInt();
				
								// Nested switch
								switch (searchChoice) {
				
									// Case
								case 1:
									ob.searchBySno();
									break;
				
									// Case
								case 2:
									ob.searchByAuthorName();
								}
								break;
				
								// Case
							case 4:
								ob.showAllBooks();
								break;
				
								// Case
							case 5:
								User s = new User();
								obStudent.addStudent(s);
								break;
				
								// Case
							// case 6:
							// 	obLibrary.showAllStudents(s);
							// 	break;
				
								// Case for book borrowing
							
				
								// Default case that will execute for sure
								// if above cases does not match
							default:
				
								// Print statement
								System.out.println("ENTER BETWEEN 0 TO 5.");
							}
							
					}
					// Checking condition at last where we are
					// checking case entered value is not zero
					while (choice0 != 0);	
					
					}
					break;//to get out of Student not register condition
				}
				while (choice1 != 0);
					break;			
			case 2:
				// obUser.User1();
				// obStudent.addStudent();
				
				User s = new User();
				obStudent.addStudent(s);
				break;
			case 3:
				// register as librarian;
				User l = new User();
				obLibrary.addLibrarian(l);
				break;
			default:

				// Print statement
			System.out.println("ENTER 1,2 or 3.");
				
}
}
while (choice1 != 0);
		
		// Creating menu
		// using do-while loop
}}