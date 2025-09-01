package Solutions;

public class car {

	 String model;
	    int year;
	    static int numberOfCars = 0; 
	    
	    car(String model, int year) {
	        this.model = model;
	        this.year = year;
	        numberOfCars++;
	    }
	    
	    void displayDetails() {
	        System.out.println("Car Model: " + model + ", Year: " + year);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car Car1 = new car("toyota" , 2020);
		car Car2 = new car("Honda" , 2024);
		
		Car1.displayDetails();
		Car2.displayDetails();
		
		 System.out.println("Total number of cars: " + car.numberOfCars);

	}

}
