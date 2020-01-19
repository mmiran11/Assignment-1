
public class Test {
	String firstName, lastName, finalGrade;
	int [] testScores = new int[5];
	double avg;
	
	Test() {
		this.firstName = "Bob";
		this.lastName = "Jackson";
		this.avg = 0;
	}
	
	Test (String firstName, String lastName, int [] arr){
		this.firstName = firstName;
		this.lastName = lastName;
		this.testScores = arr;
	}
	
	public double averageScore(int [] scores) {
		for(int i = 0; i < scores.length; i++) {
			this.avg += scores[i];
		}
		this.avg = avg / scores.length;
		return Math.round(this.avg);
	}
	
	public String finalGrade (double avg) {
		if (avg >= 90) {
			return this.finalGrade = "A";
		}
		else if (avg >= 80) {
			return this.finalGrade = "B";
		}
		else if (avg >= 70) {
			return this.finalGrade = "C";
		}
		else if (avg >= 60) {
			return this.finalGrade = "D";
		}
		else {
			return this.finalGrade = "F";
		}
	}
	
//	public String getFinalGrade() {
//		return this.finalGrade;
//	}
	
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
