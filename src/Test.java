
public class Test {
	String firstName, lastName, finalGrade;
	int [] testScores = new int[5];
	int avg;
	
	Test() {
		this.firstName = "Bob";
		this.lastName = "Jackson";
		this.finalGrade = "F";
	}
	
	Test (String firstName, String lastName, int [] arr){
		this.firstName = firstName;
		this.lastName = lastName;
		this.testScores = arr;
	}
	
	public static int averageScore(int [] scores) {
		int avg = 0;
		for(int i = 0; i < scores.length; i++) {
			avg += scores[i];
		}
		avg = avg / scores.length;
		return avg;
	}
}
