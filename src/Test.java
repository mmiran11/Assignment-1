
public class Test {
	public String firstName, lastName, finalGrade;
	public int [] testScores = new int[5];
	public double avg;
	
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
	
	public void finalGrade (double avg) {
		if (avg >= 90) {
			this.finalGrade = "A";
		}
		else if (avg >= 80) {
			this.finalGrade = "B";
		}
		else if (avg >= 70) {
			this.finalGrade = "C";
		}
		else if (avg >= 60) {
			this.finalGrade = "D";
		}
		else {
			this.finalGrade = "F";
		}
	}
	
	public String getFinalGrade() {
		return this.finalGrade;
	}
	
	public void setTestScore(int testToChange, int newScore) {
		this.testScores[testToChange] = newScore;
	}
	
	public int[] getTestScores() {
		return this.testScores;
	}
	
	public String toString() {
		return firstName + " " + lastName + "'s test scores are: \n" + testScores + 
				"\n Their average grade is " + avg + ", so their final grade is " + finalGrade;
	}
}
