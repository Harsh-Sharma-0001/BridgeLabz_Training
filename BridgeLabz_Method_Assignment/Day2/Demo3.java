package Solutions;

public class Demo3 {
		// instance variable 
	 int instanceVar = 100;

	    // Static variable 
	    static int staticVar = 200;

	    void display() {
	        // Local variable
	        int localVar = 300;

	        System.out.println("Instance Variable: " + instanceVar);
	        System.out.println("Static Variable: " + staticVar);
	        System.out.println("Local Variable: " + localVar);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 obj = new Demo3();   
        obj.display();

	}

}
