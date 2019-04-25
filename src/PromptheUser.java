import java.util.Scanner;

public class PromptheUser {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Integer");
		String Name = scan.nextLine();



		for (int i = 1; i <= 10; i++) {
			System.out.printf("%4d %4d %4d", i, i * i, i * i * i);

		}

		String cont = "yes";
		// while

		while (cont.equalsIgnoreCase("yes")) {
			// your code should start here
			System.out.println("Play!");

			// this is where your code should end
			System.out.println("Do you want to cntinue? (yes/no)");
			cont = scan.nextLine();
		}
		// this is to let out user know that the program has ended
		System.out.println("Goodbye!");
		scan.close();

	}

	public static int squared(int number) {
		return number * number;
	}

	public static int cubed(int number) {
		return number * number * number;
	}

}