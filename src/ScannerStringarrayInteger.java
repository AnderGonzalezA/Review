import java.util.Scanner;
public class ScannerStringarrayInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    int cntr = 0;
	    while (cntr == 0) {
			System.out.print("Please, select an option:\n1\n2\n3\n4\n5\n6\n7\n");
			int ptn = sc.nextInt();
		    switch ( ptn ) {
		        case 1:
		        	int cntr3=0;
		        	System.out.println("Please, enter a positive number");
		        	while (cntr3==0) {
		        		if (sc.hasNextInt()) {
		        			String pstv = sc.next();
				        	int chk = Integer.parseInt(pstv);
				        	if (chk>0) {
					        	int lngth = pstv.length();
					        	char[] dgt = pstv.toCharArray();
					        	int cntr2 = 0;
					        	for(int i=0;i<lngth;i++) {
					        		if (dgt[i] % 2 == 0) {
										cntr2++;
									}
					        	}
					        	System.out.println("This number has " + cntr2 + " even digits.");
					        	cntr3++;
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
					        		String dgt2 = sc.next();
					        		int chk2 = Integer.parseInt(dgt2);
						        	if (chk2>0) {
							        	int lngth2 = dgt2.length();
							        	if (lngth2==1) {
							        		int lngth3 = pstv2.length();
								        	char[] dgt3 = pstv2.toCharArray();
								        	int cntr6 = 0;
								        	for (int i=0;i<lngth3;i++) {
								        		if (dgt3[i]==chk2) {
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
				        		int index=lngth3--;
				        		for (int i=index;i>=0;i--) {
				        			System.out.print(pstv.charAt(i));
				        		}
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
		            
		            break;
		        case 5:
		            
		            break;
		        case 6:
		            
		            break;
		        case 7:
		            
		            break;
		        default:
		        	System.out.println("You didn't select a possible value");
		            break;
		   	}
		    int cntr4 = 0;
		    System.out.println("Would you like to see the menu again?(y/n)");
		    while (cntr4 == 0) {
			   	String bck = sc.next();
			   	switch ( bck ) {
			   	case "y":
			   		cntr4++;
			   		break;
			   	case "n":
			   		cntr4++;
			   		cntr++;
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
