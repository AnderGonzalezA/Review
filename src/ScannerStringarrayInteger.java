import java.util.Scanner;
public class ScannerStringarrayInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    int flag = 0;
	    while (flag == 0) {
			System.out.print("Please, select an option:\n"
					+ "1 Given a positive number tells how many even digits has the number.\n"
					+ "2 Given a positive number and a digit tells whether the digit appears in the number or not and in case yes, how many times it does.\n"
					+ "3 Given a positive number it gives us the inverted number.\n"
					+ "4 Given a binary number it gives us its decimal value.\n"
					+ "5 Given a sentence and a letter it gives the number of words of the sentence that begin with that letter.\n"
					+ "6 Given a sentence and a letter it gives the number of words of the sentence that end with that letter.\n"
					+ "7 Given a word it tells the user whether the word is a palindrome or it is not.\n");
			if (sc.hasNextInt()) {
				int ptn = sc.nextInt();
			    switch ( ptn ) {
			        case 1:
			        	int flag3=0;
			        	System.out.println("Please, enter a positive number");
			        	while (flag3==0) {
			        		if (sc.hasNextInt()) {
			        			String pstv = sc.next();
					        	int chk = Integer.parseInt(pstv);
					        	if (chk>0) {
						        	int lngth = pstv.length();
						        	char[] dgt = pstv.toCharArray();
						        	int cntr = 0;
						        	for(int i=0;i<lngth;i++) {
						        		int dgt2 = Character.getNumericValue(dgt[i]);
						        		if (dgt2 % 2 == 0) {
											cntr++;
										}
						        	}
					        		System.out.println("This number has " + cntr + " even digits.");
						        	flag3++;
					        	}
					        	else {
					        		System.out.println("That is not a positive number, try it again");
					        	}
			        		}
			        		else {
			        			System.out.println("That is not a positive number, try it again");
			        		}
			        	}
			            break;
			        case 2:
			        	int cntr5=0;
			        	System.out.println("Please, enter a positive number");
			        	while (cntr5==0) {
			        		if (sc.hasNextInt()) {
			        			String pstv2 = sc.next();
					        	int chk = Integer.parseInt(pstv2);
					        	if (chk>0) {
					        		System.out.println("Please, enter a digit");
						        	if (sc.hasNextInt()) {
										String saltodelinea= sc.nextLine();
						        		String dgt2 = sc.next();
						        		int chk2 = Integer.parseInt(dgt2);
							        	if (chk2>0) {
								        	int lngth2 = dgt2.length();
								        	if (lngth2==1) {
								        		int lngth3 = pstv2.length();
									        	char[] dgt3 = pstv2.toCharArray();
									        	int cntr6 = 0;
									        	for (int i=0;i<lngth3;i++) {
									        		int dgt4 = dgt3[i] - '0';
									        		if (dgt4==chk2) {
									        			cntr6++;
									        		}
									        	}
									        	if (cntr6==0) {
									        		System.out.println("This digit doesn't appear in that number.");
									        	}
									        	else {
									        		System.out.println("This digit appears "+ cntr6 + " times in that number.");
									        	}
								        		cntr5++;
								        	}
								        	else {
								        		System.out.println("That is not a digit, try it again");
								        	}
							        	}
							        	else {
							        		System.out.println("That is not a digit, try it again");
							        	}
						        	}
						        	else {
						        		System.out.println("That is not a digit, try it again");
						        	}
					        	}
					        	else {
					        		System.out.println("That is not a positive number, try it again");
					        	}
			        		}
			        		else {
			        			System.out.println("That is not a positive number, try it again");
			        		}
			        	}
			            break;
			        case 3:
			        	int cntr2=0;
			        	System.out.println("Please, enter a positive number");
			        	while (cntr2==0) {
			        		if (sc.hasNextInt()) {
			        			String pstv = sc.next();
					        	int chk = Integer.parseInt(pstv);
					        	if (chk>0) {
					        		int lngth3 = pstv.length();
					        		for (int index=lngth3-1;index>=0;index--) {
					        			System.out.print(pstv.charAt(index));
					        		}
					        		System.out.print("\n");
					        		cntr2++;
					        	}
					        	else {
					        		System.out.println("That is not a positive number, try it again");
					        	}
			        		}
			        		else {
			        			System.out.println("That is not a positive number, try it again");
			        		}
			        	}
			            break;
			        case 4:
			        	int cntr4=0;
			        	System.out.println("Please, enter a binary number");
			        	while (cntr4==0) {
			        		if (sc.hasNextInt()) {
			        			String bnry = sc.next();
			        			char[] dgt = bnry.toCharArray();
			        			// Check that all the digits are 1 or 0
			        			int ind = 0;
			        			boolean encountered = false;
			        			while ((ind < dgt.length) && (!encountered)) {
			        				if (dgt[ind]!='0' && dgt[ind]!='1') {
			        					encountered = true;
			        				}
			        			ind++;
			        		    }
			        		    if (!encountered) {
			        		    	// Make the conversion from binary to decimal
			        				double dcml=0;
			        				int index2=0;
			        				int lngth=bnry.length();
			        				for (int index=lngth-1;index>=0;index--) {
			        					int dgt2 = bnry.charAt(index)-'0';
			        					dcml=dcml+ dgt2*Math.pow(2,index2);
					        			index2++;
					        		}
			        				System.out.println("The binary number given's decimal value is: " + dcml);
			        				cntr4++;
			        			}
			        			else {
			        				System.out.println("That is not a binary number, try it again");
			        			}
			        		}
			        		else {
			        			System.out.println("That is not a binary number, try it again");
			        		}
			        	}
			            break;
			        case 5:
			        	int cntr6=0;
			        	System.out.println("Please, enter a letter and a sentence.");
	        			String lnjmp = sc.nextLine();
	        			String sntnc = sc.nextLine();
			        	while (cntr6==0) {
			        			String lttr = sc.next();
								int lngth = lttr.length();
								if(lngth<2) {
									char lttr2[]= lttr.toCharArray();
									String[] words =sntnc.split(" ");
									int cntr7=0;
									for (String word: words) {
									    char chr[]= word.toCharArray();
									    if (lttr2[0]==chr[0]) {
									        cntr7++;
									    }
									}
									System.out.println(cntr7 + " words of the sentence given start with the letter " + lttr + ".");
									cntr6++;	
								}
								else {
									System.out.println("Please, enter just a letter.");
								}
			        		
			        	}
			            break;
			        case 6:
			        	int cntr7=0;
			        	System.out.println("Please, enter a letter and a sentence.");
	        			String lnjmp2 = sc.nextLine();
	        			String sntnc2 = sc.nextLine();
			        	while (cntr7==0) {
			        			String lttr = sc.next();
								int lngth = lttr.length();
								if(lngth<2) {
									char lttr2[]= lttr.toCharArray();
									String[] words =sntnc2.split(" ");
									int cntr8=0;
									for (String word: words) {
									    char chr[]= word.toCharArray();
									    System.out.println(chr[chr.length-1]);
									    if (lttr2[0]==chr[chr.length-1]) {
									        cntr8++;
									    }
									}
									System.out.println(cntr8 + " word(s) of the sentence given end with the letter " + lttr + ".");
									cntr7++;	
								}
								else {
									System.out.println("Please, enter just a letter.");
								}
			        		
			        	}
			            break;
			        case 7:
			        	System.out.println("Please, enter a word.");
			        	String word = sc.next();
			        	char[] chr = word.toCharArray();
			        	int index2 = word.length()-1;
			        	int index=0;
			        	boolean encountered= false;
			        	while (!encountered && index2>=0) {
			        		if (chr[index]!=chr[index2]) {
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
			        	System.out.println("You didn't select a possible value");
			            break;
			   	}
			}
			else {
				System.out.println("You didn't select a possible option");
			}
		    int cntr4 = 0;
		    System.out.println("Would you like to see the menu again?(y/n)");
		    while (cntr4 == 0) {
		    	String lnjmp2 = sc.nextLine();
			   	String bck = sc.next();
			   	switch ( bck ) {
			   	case "y":
			   		cntr4++;
			   		break;
			   	case "n":
			   		cntr4++;
			   		flag++;
			   		break;
			   	default:
			   		System.out.println("Please, select a possible value(y/n)");
			   		break;
			   	}
		    }
	    }
        sc.close();
	}

}
