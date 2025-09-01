package Solutions;

public class demo {

	 int number = 100;  // Instance variable

	    void showNumber() {
	        int number = 50;  // Local variable with same name
	        System.out.println("Local variable: " + number);
	        System.out.println("Instance variable (using this): " + this.number);
	    }
	    
	public static void main(String[] args) {
			
		demo obj = new demo();
        obj.showNumber();

	}

}
