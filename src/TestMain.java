import java.util.Scanner;
public class TestMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String first, last;
		Test [] students = new Test[10];
		for (int i = 0; i < students.length; i++) {
			int [] testScores = new int [5];
			System.out.print ("Enter student " + (i + 1) + "'s first name: ");
			first = scan.next();
			System.out.print ("Enter student " + (i + 1) + "'s last name: ");
			last = scan.next();
			for(int k = 0; k < testScores.length; k++) {
				System.out.print("Enter " + first + "'s test " + (k + 1) + " score: ");
				testScores[k] = scan.nextInt();
			}
			students[i] = new Test(first, last, testScores);
		}
	}

}