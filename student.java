public class Student {
	private String name;
	private String course;
	private int engMarks;
	private int hindiMarks;
	private int mathsMarks;
    private int CalculateMarks=0;
	private int CalculateAverage=0;
	//private String CalculateGrade;
	

	// constructor;
	

	
	Student(String name,String course){
		this.name=name;
		this.course=course;
		//*/if(marks<=0)
		//{
		//	System.out.println("Invalid Marks !!!!!");
		//}
		//this.marks=marks;
		
	}
	
	
	// getter and setter rule 
	
	public int getEngMarks() {
		return engMarks;
	}


	public void setEngMarks(int engMarks) {
		if(engMarks<=0){
			System.out.println("Invalid English Marks ");
			System.out.println("????????");
		}
		this.engMarks = engMarks;
	}


	public int getHindiMarks() {
		return hindiMarks;
	}


	public void setHindiMarks(int hindiMarks) {
		if(hindiMarks<=0){
			System.out.println("Invalid Hindi Marks ");
			System.out.println("????????");
		}
		this.hindiMarks = hindiMarks;
	}


	public int getMathsMarks() {
		return mathsMarks;
	}


	public void setMathsMarks(int mathsMarks) {
		if(mathsMarks<=0){
			System.out.println("Invalid Mathematics Marks ");
			System.out.println("????????");
		}
		this.mathsMarks = mathsMarks;
	}
	
	
	//create Separate function for total Marks
	void calculateMarks(){
		
		CalculateMarks=this.getEngMarks()+this.getHindiMarks()+this.getMathsMarks();
		
	}
	//create Separate Function for average
	void calculateAverage(){
		
		CalculateAverage=(((CalculateMarks/3)*100)/100);
	}

	
	//Create Function for Grade 
	
	void CalculateGrade(){
	//	CalculateGrade = CalculateGrade;
		if (CalculateAverage>=90&&CalculateAverage<=100){
			System.out.println("A+");
			
		}
		else if(CalculateAverage>=70&&CalculateAverage<=89){
			System.out.println("A");
			
		}	
		else if(CalculateAverage>=60&&CalculateAverage<=69){
			System.out.println("B+");
			
		}	
		else if(CalculateAverage>=50&&CalculateAverage<=59){
			System.out.println("B");
			
		}	
		else if(CalculateAverage>=40&&CalculateAverage<=49){
			System.out.println("C+");
			
		}	
		else if(CalculateAverage>=35&&CalculateAverage<=39){
			System.out.println("D");
		}	
		else{
			System.out.println("Fail");
		}	
	
	
	}	
		

	

	


	public void print(){
		
		System.out.println("StudentName " +this.name);
		System.out.println("courseName " +this.course);
		System.out.println("EnglishMarks " +this.engMarks);
		System.out.println("HindiMarks "+this.hindiMarks);
		System.out.println("MathematicsMarks "+ this.mathsMarks);
		System.out.println("Calculate Marks "+CalculateMarks);
		System.out.println("Calculate Average "+CalculateAverage);
		System.out.println("!_!_!_!_!_!_!_!_!_!_!");
		
		
		
		
	}

	
	
}
