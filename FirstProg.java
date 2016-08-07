/**
* Karishma Patel
* Date: 29th Feb-2016
* Java programming Lab-01
* A Java Program to print initials (letters) in the output
*/

// import java.util.Scanner; -- To import the Class Scanner form predefined packages

public class FirstProg  // Defines a public class named 'FirstProg'
{
	public static void main(String[] args) // Main method with no return datatype and String array as an input datatype
	{
		System.out.println(""); // Command to print a blank line in the output
		System.out.println("Karishma Harshal Patel @ NPower"); // Command to print a string in the output in a new line
		System.out.println("");
		System.out.println("  K     K     H     H     P PPP");
		System.out.println("  K    K      H     H     P     P");
		System.out.println("  K   K       H     H     P      P");
		System.out.println("  K  K        H     H     P     P");
		System.out.println("  KKK         H HHH H     P PPP");
		System.out.println("  K  K        H     H     P");
		System.out.println("  K   K       H     H     P");
		System.out.println("  K    K      H     H     P");
		System.out.println("  K     K     H     H     P");
		
		System.out.println("");
		
		System.out.println("  N     N  PPPPP");
		System.out.println("  NN    N  P    P");
		System.out.println("  N N   N  P    P   ooo    w     w    eee    r  rr");
		System.out.println("  N  N  N  PPPPP   o   o   w  w  w   e   e   r r");
		System.out.println("  N   N N  P      o     o  w w w w  eeeeeee  rr");
		System.out.println("  N    NN  P       o   o   ww   ww   e       r");
		System.out.println("  N     N  P        ooo    w     w    eeee   r");
		
		System.out.println("");
		
		// The following portion of the code was used to try to link and read the external text file but it does not work properly
		
		/*  java.io.File file = new java.io.File("text.txt");
	
			try
			{
				Scanner input= new Scanner(file);
				while (input.hasNext())
				{
					String num=input.nextLine();
					System.out.println(num);
				}
				
			}
			catch (FileNotFoundException e)
			{
				System.err.format("File does not exist\n");
			}
		*/
	} // End of the main method
} // End of the class FirstProg