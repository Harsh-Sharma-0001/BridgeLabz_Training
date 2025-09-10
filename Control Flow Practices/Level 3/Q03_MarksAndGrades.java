import java.util.Scanner;

class Q03_MarksAndGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();
        double percentage = (physics + chemistry + maths) / 3.0;
        String grade;
        if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else if (percentage >= 40)
            grade = "E";
        else
            grade = "R";
        System.out.println("Average: " + percentage + ", Grade: " + grade);
        input.close();
    }
}
