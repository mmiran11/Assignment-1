import java.util.Scanner;
public class TestMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] studentScores = new int [5];
		for(int i = 0; i < studentScores.length; i++) {
			System.out.print ("Please enter your score for test " + (i + 1) + ": ");
			studentScores[i] = scan.nextInt();
		}
		Test Student1 = new Test("Sara", "Williams", studentScores);
		System.out.println (Student1.testScores[4]);
	}

}