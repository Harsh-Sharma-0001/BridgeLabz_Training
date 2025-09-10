import java.util.Scanner;

class question_triangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; // 1 inch^2 = 6.4516 cm^2

        System.out.println("The area of triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");
    }
}