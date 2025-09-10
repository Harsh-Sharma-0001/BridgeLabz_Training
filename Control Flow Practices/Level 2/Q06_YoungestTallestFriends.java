import java.util.Scanner;

class Q06_YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age1 = input.nextInt();
        int height1 = input.nextInt();
        int age2 = input.nextInt();
        int height2 = input.nextInt();
        int age3 = input.nextInt();
        int height3 = input.nextInt();
        int youngestAge = Math.min(age1, Math.min(age2, age3));
        int tallestHeight = Math.max(height1, Math.max(height2, height3));
        System.out.println("Youngest Age: " + youngestAge);
        System.out.println("Tallest Height: " + tallestHeight);
        input.close();
    }
}
