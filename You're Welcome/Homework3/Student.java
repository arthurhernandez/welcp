public class Student {
	
	
	private String name;
	private int numQuizzes = 0;
	public double totalScore = 0;
	
	
	public Student(String studentName) {
		
		name = studentName;
		
	}
	
	public void addQuiz(int score) {
		
		totalScore += score;
		numQuizzes++;
		
	}
	
	public double getTotalScore() {
		
		return totalScore;
		
	}
	
	public double getAverageScore() {
		
		return totalScore/numQuizzes;
		
	}

}
