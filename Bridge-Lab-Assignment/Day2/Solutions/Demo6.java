package Solutions;

public class Demo6 {
	
	int value ;
	
	void setValue(int value) {
		this.value  = value;
	}
	void display(){
		System.out.println("vaue : " + value);

	public static void main(String[] args) {
		Demo6 obj = new Demo6();
		obj.setValue(100);

		obj.display();

	}

}
