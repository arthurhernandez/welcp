
public class StudentTester {

	public static void main(String[] args) {
		
		Student s1 = new Student("Matthew");
		
		s1.addQuiz(98);
		s1.addQuiz(98);
		s1.addQuiz(84);
		s1.addQuiz(89);
		
		System.out.println("The total score is: " + s1.getTotalScore());
		System.out.println("The average score is: " + s1.getAverageScore());
		
	}
	
	
}
