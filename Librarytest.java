import java.util.Scanner;
public class Librarytest {

	public static void main(String[] args) {
		
		// Library lib1 = new library(scan.nextLine(), Scan.nextInt(), Scan.nextInt(), Scan.nextDouble());
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter location?");
		 String ptwo = scan.nextLine();
		
		 System.out.println("Please enter total number of books?");
		 int books = scan.nextInt();
		 
		 System.out.println("Please enter how many staff memebers ?");
		 int staff =scan.nextInt();
		 System.out.println("Please enter Yearly Expense ?");
		 double expense =scan.nextDouble();
		 
		 System.out.print("The location is "+ptwo+ "The number of books"+books+"The number of staff memebers is "+staff+"Total yearly expese is"+expense);
		
		

	}

}
