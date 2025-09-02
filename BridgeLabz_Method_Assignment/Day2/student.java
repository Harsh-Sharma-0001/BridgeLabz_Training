package Solutions;

public class student {
	
	int marks;
	String name;
	
	student(String name , int marks){
		this.name = name;
		this.marks = marks;
	}
	
	void detailOfStudent() {
		System.out.println("Student Name : " + name + " Marks : " + marks);
	}

	public static void main(String[] args) {
		student student1 = new student("Raaj" , 73);
		student student2 = new student("Harsh" , 80);
		
		student1.detailOfStudent();
		student2.detailOfStudent();

	}

}
