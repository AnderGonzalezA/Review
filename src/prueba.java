import java.util.Scanner;
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = 0;
		int pstv = sc.nextInt();
		r = pstv & 10;
		System.out.println(r);
    	sc.close();
	}

}
