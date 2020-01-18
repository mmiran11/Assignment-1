
public class Test {
	String firstName, lastName;
	int [] testScores = new int[5];
	float avg;
	
	Test() {
		this.firstName = "Bob";
		this.lastName = "Jackson";
	}
	
	Test (String firstName, String lastName, int [] arr){
		this.firstName = firstName;
		this.lastName = lastName;
		this.testScores = arr;
	}
}
