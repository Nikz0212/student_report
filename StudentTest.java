public class StudentTest {

	public static void main(String[] args) {
		
	// Detail of Student1
		Student S1 = new Student("RahulSingh","EngMedium");
		//S1.getEngMarks();
		S1.setEngMarks(30);
		
		//S1.getHindiMarks();
		S1.setHindiMarks(50);
		
		//S1.getMathsMarks();
		S1.setMathsMarks(40);
		S1.calculateMarks();
		S1.calculateAverage();
		
		S1.CalculateGrade();
		S1.print();
	}	
	
