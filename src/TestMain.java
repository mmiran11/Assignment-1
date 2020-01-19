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
		double classAverage = 0;
		System.out.print ("First name:    ");
		System.out.print ("Last name:    ");
		System.out.print ("Test 1:    ");
		System.out.print ("Test 2:    ");
		System.out.print ("Test 3:    ");
		System.out.print ("Test 4:    ");
		System.out.print ("Test 5:    ");
		System.out.print ("Average:    ");
		System.out.print ("Letter Grade:    ");
		System.out.println();
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
			classAverage += students[i].avg;
		}
		classAverage = classAverage / 10;
		System.out.println("Class Average: " + Math.round(classAverage * 100.0) / 100.0);
	}

}