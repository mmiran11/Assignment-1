
public class Test {
	String firstName, lastName, finalGrade;
	int [] testScores = new int[5];
	int avg;
	
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
	
	public int averageScore(int [] scores) {
		for(int i = 0; i < scores.length; i++) {
			this.avg += scores[i];
		}
		this.avg = avg / scores.length;
		return this.avg;
	}
	
	public String finalGrade (int avg) {
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
	
	public void getFinalGrade() {
		System.out.print("Final grade: " + this.finalGrade);
	}
}
