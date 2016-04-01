import java.util.Scanner;

public class squaresAndCubes {
	
	public static void main (String [] args) {
		
		System.out.println("Learn your language squares and cubes!");
		Scanner sc = new Scanner(System.in);
		String input = "y";
		
		while (input.equalsIgnoreCase("Y"))
		{
			System.out.println("Enter an integer: ");
			int x = sc.nextInt();
			
			System.out.println("Number \t" + "Squared " + "Cubed \t");
			System.out.println("====== \t" + "======= " + "===== \t");
			System.out.println();
			
			for (int i = 1; i <= x; i++) {
			System.out.println(i + "\t" + (int) Math.pow(i,2) + "\t" + (int) Math.pow(i, 3));	
			}
				System.out.print("\nContinue? (y/n): ");
				input = sc.next();
		}
			System.out.println("Goodbye!");
			sc.close();
	}
}