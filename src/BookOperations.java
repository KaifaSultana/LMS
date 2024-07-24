
// Java Program to Illustrate books class
// To Do all the Operations related to Books such as
// add, check-in, check-out,Valid books,Update books

// Importing required classes
import java.util.Scanner;

// CLass 
public class  BookOperations{

	// Class data members
	Book theBooks[] = new Book[50];
	public static int count;

	Scanner input = new Scanner(System.in);


	// Method 2
	// To add book
	public void addBook(Book b)
	{

		if (count < 50) {

			theBooks[count] = b;
			count++;
		}
		else {

			System.out.println(
				"No Space to Add More Books.");
		}
	}

	// Method 3
	// To search book by serial number
	public void searchBySno()
	{

		// Display message
		System.out.println(
			"\t\t\t\tSEARCH BY SERIAL NUMBER\n");

		// Class data members
		int sNo;
		System.out.println("Enter Serial No of Book:");
		sNo = input.nextInt();

		int flag = 0;
		System.out.println(
			"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {
			if (sNo == theBooks[i].sNo) {
				System.out.println(
					theBooks[i].sNo + "\t\t"
					+ theBooks[i].bookName + "\t\t"
					+ theBooks[i].authorName + "\t\t"
					+ theBooks[i].bookQtyCopy + "\t\t"
					+ theBooks[i].bookQty);
				flag++;
				return;
			}
		}
		if (flag == 0)
			System.out.println("No Book for Serial No "
							+ sNo + " Found.");
	}

	// Method 4
	// To search author by name
	public void searchByAuthorName()
	{

		// Display message
		System.out.println(
			"\t\t\t\tSEARCH BY AUTHOR'S NAME");

		System.out.println("Enter Author Name:");
		String authorName = input.nextLine();

		int flag = 0;

		System.out.println(
			"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {

			// if author matches any of its book
			if (authorName.equalsIgnoreCase(
					theBooks[i].authorName)) {

				// Print below corresponding credentials
				System.out.println(
					theBooks[i].sNo + "\t\t"
					+ theBooks[i].bookName + "\t\t"
					+ theBooks[i].authorName + "\t\t"
					+ theBooks[i].bookQtyCopy + "\t\t"
					+ theBooks[i].bookQty);
				flag++;
			}
		}

		// Else no book matches for author
		if (flag == 0)
			System.out.println("No Books of " + authorName
							+ " Found.");
	}

	// Method 5
	// To display all books
	public void showAllBooks()
	{

		System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
		System.out.println(
			"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {

			System.out.println(
				theBooks[i].sNo + "\t\t"
				+ theBooks[i].bookName + "\t\t"
				+ theBooks[i].authorName + "\t\t"
				+ theBooks[i].bookQtyCopy + "\t\t"
				+ theBooks[i].bookQty);
		}
	}

	// Method 6
	// To edit the book
	public void upgradeBookQty()
	{

		System.out.println(
			"\t\t\t\tUPGRADE QUANTITY OF A BOOK\n");
		System.out.println("Enter Serial No of Book");

		int sNo = input.nextInt();

		for (int i = 0; i < count; i++) {

			if (sNo == theBooks[i].sNo) {

				// Display message
				System.out.println(
					"Enter No of Books to be Added:");

				int addingQty = input.nextInt();
				theBooks[i].bookQty += addingQty;
				theBooks[i].bookQtyCopy += addingQty;

				return;
			}
		}
	}

	// Method 7
	// To create menu
	public void dispMenu1(){
		System.out.println("Press 1 to login");
		System.out.println("Press 2 for Register as Student");
		System.out.println("Press 3 for Register as Librarian");
	}
	public void dispMenu2(){
		System.out.println("Press 1 to login as Student");
		System.out.println("Press 2 for login as Librarian ");
	}
	public void dispMenuStudent()
	{

		// Displaying menu for student
		System.out.println(
			"----------------------------------------------------------------------------------------------------------");
		// System.out.println("Press 1 to Add new Book.");
		System.out.println("Press 0 to Exit Application.");
		// System.out.println(
		// 	"Press 2 to Upgrade Quantity of a Book.");
		System.out.println("Press 1 to Search a Book.");
		System.out.println("Press 2 to Show All Books.");
		// System.out.println("Press 5 to Register Student.");
		// System.out.println(
		// 	"Press 6 to Show All Registered Students.");
		System.out.println("Press 3 to Check Out Book. ");
		System.out.println("Press 4 to Check In Book");
		System.out.println(
			"-------------------------------------------------------------------------------------------------------");
	}
	public void dispMenuLibratian()
	{

		// Displaying menu for Librarian 
		System.out.println(
			"----------------------------------------------------------------------------------------------------------");
		System.out.println("Press 1 to Add new Book.");
		System.out.println("Press 0 to Exit Application.");
		System.out.println(
			"Press 2 to Upgrade Quantity of a Book.");
		System.out.println("Press 3 to Search a Book.");
		System.out.println("Press 4 to Show All Books.");
		System.out.println("Press 5 to Register Student.");
		System.out.println(
			"Press 6 to Show All Registered Students.");
		System.out.println("Press 7 to Check Out Book. ");
		System.out.println("Press 8 to Check In Book");
		System.out.println(
			"-------------------------------------------------------------------------------------------------------");
	}

	// Method 8
	// To search the library
	public int isAvailable(int sNo)
	{

		for (int i = 0; i < count; i++) {
			if (sNo == theBooks[i].sNo) {
				if (theBooks[i].bookQtyCopy > 0) {

					System.out.println(
						"Book is Available.");
					return i;
				}
				System.out.println("Book is Unavailable");
				return -1;
			}
		}

		System.out.println("No Book of Serial Number "
						+ " Available in Library.");
		return -1;
	}

	// Method 9
	// To borrow the book from the library
	public Book checkOutBook()
	{
		showAllBooks();
		System.out.println(
			"Enter Serial No of Book to be Checked Out.");
		int sNo = input.nextInt();

		int bookIndex = isAvailable(sNo);

		if (bookIndex != -1) {
			theBooks[bookIndex].bookQtyCopy--;
			System.out.println("Book is given to you");
			return theBooks[bookIndex];
			
		}
		
		return null;
	}

	// Method 10
	// To add the Book to the Library
	public Book checkInBook()
		
	{
		showAllBooks();
		System.out.println(
			"Enter Serial No of Book to be Checked In.");
		int sNo = input.nextInt();

		int bookIndex = isAvailable(sNo);

		if (bookIndex != -1) {
			theBooks[bookIndex].bookQtyCopy++;
			System.out.println("Book is Returned");
			return theBooks[bookIndex];
		}
		
		return null;
	}
	
}
