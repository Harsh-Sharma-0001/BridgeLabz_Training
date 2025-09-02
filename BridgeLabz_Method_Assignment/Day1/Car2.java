public class Car2 {
    String brand;
    int speed;
    static int wheels = 4;
    
    Car2(String brand , int speed){
        this.brand = brand;
        this.speed = speed;
        
    }
    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h, Wheels: " + wheels);
    }
    public static void main(String[] args) {
        
        Car2 car1 = new Car2("Toyota",120);
        Car2 car2 = new Car2("Maruti",125);
        System.out.println("=== Car Details ===");
        car1.display();
        car2.display();
        System.out.print("number of wheel :" + wheels);
    }
}
