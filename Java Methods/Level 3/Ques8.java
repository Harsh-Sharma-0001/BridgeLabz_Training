import java.util.Scanner;

public class Ques8 {
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0], idx = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                idx = i;
            }
        }
        return names[idx];
    }

    public static String findTallest(String[] names, int[] heights) {
        int maxHeight = heights[0], idx = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                idx = i;
            }
        }
        return names[idx];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        System.out.println("Youngest: " + findYoungest(names, ages));
        System.out.println("Tallest: " + findTallest(names, heights));
    }
}
