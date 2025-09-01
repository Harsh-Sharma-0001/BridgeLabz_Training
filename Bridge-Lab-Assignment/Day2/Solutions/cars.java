package Solutions;

public class cars {

	 String model;
	    int year;
	    static int numberOfCars = 0; 
	    
	    cars(String model, int year) {
	        this.model = model;
	        this.year = year;
	        numberOfCars++;
	    }
	    
	    void displayDetails() {
	        System.out.println("Car Model: " + model + ", Year: " + year);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cars Car1 = new cars("toyota" , 2020);
		Car1.numberOfCars = 10;
		cars Car2 = new cars("Honda" , 2024);
		
		
		Car1.displayDetails();
		Car2.displayDetails();
		
		
		 System.out.println("Total number of cars: " + cars.numberOfCars);

	}

}
