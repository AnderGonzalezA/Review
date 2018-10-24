import java.util.Scanner;
public class ScannerStringarrayInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    boolean finished = false;
	    while (finished == false) {
			System.out.print("Please, select an option:\n"
					+ "1 Given a positive number tells how many even digits has the number.\n"
					+ "2 Given a positive number and a digit tells whether the digit appears in the number or not and in case yes, how many times it does.\n"
					+ "3 Given a positive number it gives us the inverted number.\n"
					+ "4 Given a binary number it gives us its decimal value.\n"
					+ "5 Given a sentence and a letter it gives the number of words of the sentence that begin with that letter.\n"
					+ "6 Given a sentence and a letter it gives the number of words of the sentence that end with that letter.\n"
					+ "7 Given a word it tells the user whether the word is a palindrome or it is not.\n");
			// Check that the user enters a number
			if (sc.hasNextInt()) {
				int option = sc.nextInt();
			    switch ( option ) {
			        case 1:
			        	System.out.println("Please, enter a positive number");
	        			// Open a loop
			        	boolean finished1 = false;
			        	while (finished1 == false) {
			        		// Check that the user enters a number
			        		if (sc.hasNextInt()) {
			        			// Create a string object with the number's value
			        			String usernumber = sc.next();
			        			// Pass the value to an int variable
					        	int check = Integer.parseInt(usernumber);
					        	// Check that the number is positive
					        	if (check>0) {
					        		// Create an array with the number's digits
						        	char[] digits = usernumber.toCharArray();
						        	// Count the even digits of the number
						        	int counter = 0;
						        	for(int i=0;i<usernumber.length();i++) {
						        		int digit = Character.getNumericValue(digits[i]);
						        		if (digit % 2 == 0) {
											counter++;
										}
						        	}
					        		System.out.println("This number has " + counter + " even digits.");
					        		// Get out of the loop
						        	finished1 = true;
					        	}
					        	else {
					        		System.out.println("That is not a positive number, try it again");
					        	}
			        		}
			        		else {
			        			System.out.println("That is not a positive number, try it again");
			        			// Jump the token '/n'
								String tokenjump= sc.next();
			        		}
			        	}
			            break;
			        case 2:
			        	System.out.println("Please, enter a positive number");
	        			// Open a loop
			        	boolean finished2=false;
			        	while (finished2==false) {
			        		// Check that the user enters a number
			        		if (sc.hasNextInt()) {
			        			// Create a string object with the number's value
			        			String usernumber = sc.next();
			        			// Pass the value to an int variable
					        	int chek = Integer.parseInt(usernumber);
					        	// Check that the number is positive
					        	if (chek>0) {
					        		System.out.println("Please, enter a digit");
					        		// Check that the user enters a number
						        	if (sc.hasNextInt()) {
										// Create a string object with the number's value
						        		String digit = sc.next();
						        		// Pass the value to an int variable
						        		int check2 = Integer.parseInt(digit);
						        		// Check that the number is positive
							        	if (check2>0) {
							        		// Check that the number is a digit
								        	if (digit.length()==1) {
								        		// Create an array with the digit's value
								        		char charDigit = digit.charAt(0);
								        		// Create an array with the previous number's digits
									        	char[] numberDigits = usernumber.toCharArray();
									        	// Count how many times the digit appears in the number
									        	int counter = 0;
									        	for (int i=0;i<numberDigits.length;i++) {
									        		//int digit2 = Character.getNumericValue(digits[i]);
									        		//if (digit2==check2) {
								        				//counter++;
								        			//}
									        		if (charDigit==numberDigits[i]){
									        			counter++;
									        		}
									        	}
									        	System.out.println("This digit appears "+ counter + " times in that number.");
									        	// Get out of the loop
								        		finished2=true;
								        	}
								        	else {
								        		System.out.println("That is not a digit, enter the previous number again");
								        	}
							        	}
							        	else {
							        		System.out.println("That is not a digit, enter the previous number again");
							        	}
						        	}
						        	else {
						        		System.out.println("That is not a digit, enter the previous number again");
						        		// Jump the token '/n'
										String tokenjump= sc.next();
						        	}
					        	}
					        	else {
					        		System.out.println("That is not a positive number, try it again");
					        	}
			        		}
			        		else {
			        			System.out.println("That is not a positive number, try it again");
			        			// Jump the token '/n'
								String tokenjump= sc.next();
			        		}
			        	}
			            break;
			        case 3:
			        	System.out.println("Please, enter a positive number");
	        			// Open a loop
			        	boolean finished3=false;
			        	while (finished3==false) {
			        		// Check that the user enters a number
			        		if (sc.hasNextInt()) {
			        			// Create a string object with the number's value
			        			String usernumber = sc.next();
			        			// Pass the value to an int variable
					        	int chk = Integer.parseInt(usernumber);
					        	// Check that the number is positive
					        	if (chk>0) {
					        		// Print the inverted number
					        		for (int index=usernumber.length()-1;index>=0;index--) {
					        			System.out.print(usernumber.charAt(index));
					        		}
					        		System.out.print("\n");
					        		// Get out of the loop
					        		finished3 = true;
					        	}
					        	else {
					        		System.out.println("That is not a positive number, try it again");
					        	}
			        		}
			        		else {
			        			System.out.println("That is not a positive number, try it again");
			        			// Jump the token '/n'
								String tokenjump= sc.next();
			        			
			        		}
			        	}
			            break;
			        case 4:
			        	System.out.println("Please, enter a binary number");
	        			// Open a loop
			        	boolean finished4 = false;
			        	while (finished4==false) {
			        		// Check that the user enters a number
			        		if (sc.hasNextInt()) {
			        			// Create a string object with the number's value
			        			String usernumber = sc.next();
			        			// Create an array with the number's digits
			        			char[] digits = usernumber.toCharArray();
			        			// Check that all the digits are 1 or 0
			        			int index = 0;
			        			boolean encountered = false;
			        			while ((index < digits.length) && (!encountered)) {
			        				if (digits[index]!='0' && digits[index]!='1') {
			        					encountered = true;
			        				}
			        			index++;
			        		    }
			        		    if (!encountered) {
			        		    	// Make the conversion from binary to decimal
			        				double decimal=0;
			        				int index2=0;
			        				for (int index3=usernumber.length()-1;index3>=0;index3--) {
			        					int digit = Character.getNumericValue(usernumber.charAt(index3));
			        					decimal=decimal+ digit*Math.pow(2,index2);
					        			index2++;
					        		}
			        				System.out.println("The binary number given's decimal value is: " + decimal);
			        				// Get out of the loop
			        				finished4 = true;
			        			}
			        			else {
			        				System.out.println("That is not a binary number, try it again");
			        			}
			        		}
			        		else {
			        			System.out.println("That is not a binary number, try it again");
			        			// Jump the token '/n'
								String tokenjump= sc.next();
			        		}
			        	}
			            break;
			        case 5:
			        	System.out.println("Please, enter a sentence.");
			        	// Jump the token '/n' and go to the next line
			        	String linejump = sc.nextLine();
			        	// Create a string object with the user's sentence
	        			String sentence = sc.nextLine();
	        			// Open a loop
			        	boolean finished5=false;
			        	while (finished5==false) {
			        		System.out.println("Please, enter a letter.");
			        		// Create a string object with the user's letter
			        		String letter = sc.next();
			        		// Check that the user entered just a character
							if(letter.length()<2) {
								// Create an array with the character
								char letter2[]= letter.toCharArray();
								// Create an array with the sentence's words
								String[] words =sentence.split(" ");
								// Count how many words of the sentence start with the letter of the user
								int counter=0;
								for (String word: words) {
								    char letters[]= word.toCharArray();
								    if (letter2[0]==letters[0]) {
								        counter++;
								    }
								}
								System.out.println(counter + " words of the sentence given start with the letter " + letter + ".");
								// Get out of the loop
								finished5 = true;
							}
							else {
								System.out.println("Please, enter just a letter.");
							}
			        	}
			            break;
			        case 6:
			        	System.out.println("Please, enter a sentence.");
			        	// Jump the token '/n' and go to the next line
	        			String linejump2 = sc.nextLine();
			        	// Create a string object with the user's sentence
	        			String sentence2 = sc.nextLine();
	        			// Open a loop
			        	boolean finished6=false;
			        	while (finished6==false) {
			        		System.out.println("Please, enter a letter.");
			        		// Create a string object with the user's letter
			        		String letter = sc.next();
			        		// Check that the user entered just a character
							if(letter.length()<2) {
								// Create an array with the character
								char letter2[]= letter.toCharArray();
								// Create an array with the sentence's words
								String[] words =sentence2.split(" ");
								// Count how many words of the sentence end with the letter of the user
								int counter=0;
								for (String word: words) {
								    char letters[]= word.toCharArray();
								    if (letter2[0]==letters[letters.length-1]) {
								        counter++;
								    }
								}
								System.out.println(counter + " word(s) of the sentence given end with the letter " + letter + ".");
								// Get out of the loop
								finished6 = true;	
							}
							else {
								System.out.println("Please, enter just a letter.");
							}
			        	}
			            break;
			        case 7:
			        	System.out.println("Please, enter a word.");
			        	// Create a string object with the user's token
			        	String word = sc.next();
			        	// Create an array with the word's characters
			        	char[] characters = word.toCharArray();
			        	// Define a variable with the value of the word's last index number
			        	int index2 = word.length()-1;
			        	int index=0;
			        	// Control if the word's inverted characters are equal
			        	boolean encountered= false;
			        	while (!encountered && index2>=0) {
			        		if (characters[index]!=characters[index2]) {
			        			encountered=true;
			        		}
			        		index++;
			        		index2--;
			        	}
	        			if (encountered) {
	        	        	System.out.println("The word given isn't palindrome");
	        			}
	        			else {
	        	        	System.out.println("The word given is palindrome");
	        			}
			            break;
			        default:
			        	System.out.println("You didn't select a possible option");
			            break;
			   	}
			}
			else {
				System.out.println("You didn't select a possible option");
				// Jump the token '/n'
		    	String tokenjump = sc.next();
			}
			// Ask if the user wants to see the menu again or not
		    System.out.println("Would you like to see the menu again?(y/n)");
		    // Open a loop
		    boolean goback = false;
		    while (goback == false) {
		    	// Create a string object with the user's token
			   	String back = sc.next();
			   	switch ( back ) {
			   	case "y":
			   		// Get out of the loop and print the menu again
			   		goback = true;
			   		break;
			   	case "n":
			   		// Get out of the loop and terminate the program
			   		goback = true;
			   		finished = true;
			   		break;
			   	default:
			   		// Ask for a possible value again
			   		System.out.println("Please, select a possible value(y/n)");
			   		break;
			   	}
		    }
	    }
        sc.close();
	}

}
