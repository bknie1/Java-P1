/*
	Author Documentation
    module      :   Smile.java
    Description :   Smile - Random Computer Science Haiku Program
    Author      :   Brandon Knieriem
    Rev History :

    Date        Comment
    ----        -------
	1/20/16     Pre-Alpha
				-	Program Creation
    1/21/16		Alpha
    			-	Menu Loop
    1/23/16		Beta
    			-	Feature complete.
				-	Multiple Additions:
	    			-	Scanner and Random Java Util added.
	    			-	Switch Case added.
	    			- 	Public 'About' Section added.
	    			-	Modularized the program so it isn't one big hot mess.
	    			-	Another Switch Case added.
	    			-	HaikuDB String array.

    Notes:
    ------
    - 30+ Haiku:
    	- Author (Brandon Knieriem)
    	- Ubuntu Forums
    	- Quora Forums
    	- Authorware
	- Closed the scanner. Unnecessary? But the program is clean.
	- Didn't bother using a package.

*/

import java.util.Scanner;		// Input Scanner
import java.util.Random;		// Random Number

public class Smile {
	
	//---------------------------------------------------------------------
	public static void main(String[] args) {
		Smile haiku = new Smile();		// Instantiate.
		haiku.menu();					// Execute.
	}
	
	//---------------------------------------------------------------------
	/* Scanner: Menu Selection (iUsel) and # of Poems (iHaikuNum) */
	Scanner sc = new Scanner (System.in);
	
	//---------------------------------------------------------------------
	/* Main Menu */
	private void menu() {
		int iUSel = 0;
		
		System.out.println("\t\tSMILE PROGRAM\n"
						+ "\t\t-------------\n"
						+ "\t     By Brandon Knieriem");
		
		do{
			System.out.print("\n\t\t  Main Menu\n"
							+ "1.) Random Haiku\n2.) About\n3.) Quit\n"
							+ "Selection: ");
		
			iUSel = sc.nextInt();
			
			switch (iUSel) {
			
				case 1: 	System.out.println("\n\t\tRandom Haiku\n");
							random_haiku();
							break;
				
				case 2: 	System.out.println("\n\t\t    About\n");
							about();
							break;
				
				case 3:		break;			// Terminate Program				
						
				default: 	System.out.println("\nInvalid selection.\n");
				
			}
		}while(iUSel != 3);
		
		sc.close();
	}

	//---------------------------------------------------------------------
	/* Random Haiku */
	private void random_haiku() {
		
		int iHaikuNum = 0;
		int iCnt = 0;
		
		System.out.print("Number of poems (1 - 31): ");
		iHaikuNum = sc.nextInt();
		System.out.println("");
		
		if (iHaikuNum > 0 && iHaikuNum < 32)
		{
			for (iCnt = 0; iCnt < iHaikuNum; ++iCnt)
			{
				String sPrintHaiku = HaikuDB();
				System.out.println("\n" + sPrintHaiku + "");
			}
		}
		else
		{
			System.out.println("Invalid input.\n");
		}
	}
	
	//---------------------------------------------------------------------
	/* About */
	private void about() {
		System.out.println(	"Author: Brandon Knieriem\n"
						+	"Instructor: Professor Alice Fischer\n"
						+	"Class: Java Programming\n"
						+ 	"\n------------------------\n"
						+ 	"\nHaiku Credit:\n"
						+ 	" -Ubuntu Forums\n -Quora Forums\n"
						+ 	" -Authorware\n -Brandon Knieriem\n");
		

	}
	
	//---------------------------------------------------------------------
	/* Haiku String Array */
	private static String HaikuDB() {
		String sHaikuDB[] = 	
				// 0
			{	"Java Programming\n"
			+ 	"3 AM it compiles\n"
			+ 	"I cheer and pass out",
			
				// 1
				"Little semicolon\n"
			+ 	"that makes me not compile this\n"
			+ 	"where are you missing?\n",
			
				// 2
				"Compile time long\n"
			+ 	"Goof off until it is done\n"
			+ 	"I should have used Perl\n",
			
				// 3
				"01011\n"
			+ 	"1011010\n"
			+ 	"0010111\n",
			
				// 4
				"Programming is fun\n"
			+ 	"If you want to have more fun\n"
			+	"Program in Java\n",
			
				// 5
				"Oh Mister Segfault\n"
			+ 	"Error checking does not find\n"
			+ 	"Printf's everywhere\n",
				
				// 6
				"PHP how I hate thee\n"
			+	"Your objects and libs are messy\n"
			+	"Now where is CGI Perl?\n",
			
				// 7
				"Delete I must do\n"
			+	"rm -R/* I write\n"
			+ 	"Crap what have I done\n",
				
				// 8
				"They tell me use VIM\n"
			+	"I hate modal editors\n"
			+ 	"Thus starts the flame war\n",
				
				// 9
				"Is my server safe?\n"
			+ 	"I enter ){:}: to test it\n"
			+	"Bash consumes all\n",
			
				// 10
				"Working code at last\n"
			+	"Tidying up leads to fail\n"
			+	"What the **** happened?\n",
				
				// 11
				"The ugly code will\n"
			+	"Sometimes work better than the\n"
			+	"Clean, elegant stuff\n",
				
				// 12
				"The website you seek\n"
			+	"Cannot be located but\n"
			+	"Countless more exist\n",
				
				// 13
				"Java very smart\n"
			+	"Designed by the best but would\n"
			+	"Sell soul for printf\n",
			
				// 14
				"One Two Seven Dot\n"
			+	"Zero Dot Zero Dot One\n"
			+	"There's no place like home\n",
				
				// 15
				"Ring, Hello IT\n"
			+	"Sigh, have you tried turning it\n"
			+	"Off and on again?\n",
				
				// 16
				"Error in Syntax\n"
			+	"Haiku dot c line two\n"
			+	"Too few syllables\n",
				
				// 17
				"Three things are certain\n"
			+	"Death, taxes, and lost data\n"
			+	"Guess which has occurred?\n",
				
				// 18
				"Chaos reigns within\n"
			+	"Reflect, repent, and reboot\n"
			+	"Order shall return\n",
				
				// 19
				"Program aborting:\n"
			+	"Close all that you have worked on\n"
			+	"You ask far too much\n",
				
				// 20
				"Windows OS crashed\n"
			+	"I am the Blue Screen of Death\n"
			+	"No one hears your screams\n",
				
				// 21
				"Yesterday it worked\n"
			+ 	"Today it is not working\n"
			+ 	"Windows is like that\n",
				
				// 22
				"Your file was so big\n"
			+ 	"It might be very useful\n"
			+ 	"But now it is gone\n",
				
				// 23
				"Stay the patient course\n"
			+ 	"Of little worth is your ire\n"
			+ 	"The network is down\n",
				
				// 24
				"A crash reduces\n"
			+ 	"Your expensive computer\n"
			+ 	"To a simple stone\n",
				
				// 25
				"You step in the stream\n"
			+ 	"But the water has moved on\n"
			+ 	"The page is not here\n",
				
				// 26
				"Out of memory\n"
			+ 	"We wish to hold the whole sky\n"
			+ 	"But we never will\n",
				
				// 27
				"Having been erased\n"
			+ 	"The document you're seeking\n"
			+ 	"Must now be retyped\n",
				
				// 28
				"Serious error\n"
			+ 	"Shortcuts have disappeared\n"
			+ 	"Screen, mind, both are blank\n",
				
				// 29
				"A Haiku Program\n"
			+ 	"Great for my portfolio\n"
			+ 	"Still don't have a job\n",
				
				// 30
				"To C or not to\n"
			+ 	"C? Collect my garbage? Then\n"
			+ 	"Java is ideal\n",
			};
		
		Random rndHaiku = new Random();
		int iRandom = rndHaiku.nextInt(30);	// returns >= 0 && <= 30		
		String sRndHaiku = sHaikuDB[iRandom];
		
		return sRndHaiku;
		
	}
}