
// Java Program to Illustrate students Class
// To Do all the Operations related to students:
// add Students,check-in books,check out books,ValidStudent

// Importing required classes
import java.util.Scanner;

// Class
public class StudentOperation {

	// Creating objects of Scanner and students class
	Scanner input = new Scanner(System.in);
	User theStudents[] = new User[50];
	Book borrowedBooks[] = new Book[3];
 	public int booksCount = 0;
	public static int count = 0;

	// Method 3
	// To check the Student
	public int isStudent()
	{
		// Display message only
		System.out.println("Enter Student Name:");

		String studentName = input.nextLine();
		System.out.println("Enter Password:");

		String SdPassword = input.nextLine();

		for (int i = 0; i < count; i++) {

			if (theStudents[i].Name.equalsIgnoreCase(
					studentName)) {
						if (theStudents[i].Password.equals(SdPassword)) {
							// Password is valid, return the index
							return i;		
				
			}
			else{
                // Password is invalid, display a message
                System.out.println("Invalid password for the student.");
                return -1; // Return -1 to indicate an invalid student
            }
		}
		
	}
		// Print statements
		System.out.println("Student is not Registered.");
		System.out.println("Get Registered First.");

		return -1;
	}

		// To add Librarian
	public void addStudent(User s)
		{
			for (int i = 0; i < count; i++) {
	
				if (s.Name.equalsIgnoreCase(
						theStudents[i].Name)) {
	
					// Print statement
					System.out.println(
						"Student is Already Registered.");
	
					return;
				}
			}
			if (count <= 50) {
				theStudents[count] = s;
				count++;
			}
		}
	// 	public void checkInBook(BookOperations book)
	// {
	// 	int studentIndex = this.isStudent();
	// 	if (studentIndex != -1) {

	// 		// Printing credentials corresponding to student
	// 		System.out.println(
	// 			"S.No\t\t\tBook Name\t\t\tAuthor Name");

    //             User s = theStudents[studentIndex];

	// 		for (int i = 0; i < s.booksCount; i++) {

	// 			System.out.println(
	// 				s.borrowedBooks[i].sNo + "\t\t\t"
	// 				+ s.borrowedBooks[i].bookName + "\t\t\t"
	// 				+ s.borrowedBooks[i].authorName);
	// 		}

	// 		// Display message only
	// 		System.out.println(
	// 			"Enter Serial Number of Book to be Checked In:");

	// 		int sNo = input.nextInt();

	// 		for (int i = 0; i < s.booksCount; i++) {
	// 			if (sNo == s.borrowedBooks[i].sNo) {
	// 				book.checkInBook(s.borrowedBooks[i]);
	// 				s.borrowedBooks[i] = null;

	// 				return;
	// 			}
	// 		}

	// 		System.out.println("Book of Serial No " + sNo
	// 						+ "not Found");
	// 	}
	// }
}
