public class Car {
    String brand;
    int speed;
    static int wheelCount = 4;
    
    public Car(String brand , int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public static void main(String[] args) {
        

        System.out.print("number of wheel :" + wheelCount);
    }
}
