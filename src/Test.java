
public class Test {
	String firstName, lastName, finalGrade;
	int [] testScores = new int[5];
	double avg;
	
	Test() {
		this.firstName = "Bob";
		this.lastName = "Jackson";
		avg = 0;
	}
	
	Test (String firstName, String lastName, int [] arr){
		this.firstName = firstName;
		this.lastName = lastName;
		this.testScores = arr;
	}
	
	public double averageScore(int [] scores) {
		for(int i = 0; i < scores.length; i++) {
			avg += scores[i];
		}
		avg = avg / scores.length;
		return Math.round(avg * 100) / 100;
	}
	
	public String finalGrade (double avg) {
		if (avg >= 90) {
			return finalGrade = "A";
		}
		else if (avg >= 80) {
			return finalGrade = "B";
		}
		else if (avg >= 70) {
			return finalGrade = "C";
		}
		else if (avg >= 60) {
			return finalGrade = "D";
		}
		else {
			return finalGrade = "F";
		}
	}
	
	public void setTestScore(int testToChange, int newScore) {
		this.testScores[testToChange] = newScore;
	}
	
	public int[] getTestScores() {
		return this.testScores;
	}
	
	public String toString() {
		return firstName + "    " + lastName + "    " + testScores[0] + "    " + testScores[1] + "    "  + testScores[2] + 
				"    " + testScores[3] + "    " + testScores[4] + "    " + averageScore(testScores) + "    " + finalGrade(avg);
	}
}
