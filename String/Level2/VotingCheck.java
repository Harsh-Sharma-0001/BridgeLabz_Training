package String.Level2;
import java.util.*;

class VotingCheck {
    // Generate random ages
    static int[] generateAges(int n) {
        Random r=new Random();
        int[] ages=new int[n];
        for(int i=0;i<n;i++) {
            ages[i]=10 + r.nextInt(90); // random 2-digit
        }
        return ages;
    }

    // Check voting eligibility
    static String[][] checkEligibility(int[] ages) {
        String[][] result=new String[ages.length][2];
        for(int i=0;i<ages.length;i++) {
            result[i][0]=String.valueOf(ages[i]);
            if(ages[i]<0) result[i][1]="false";
            else if(ages[i]>=18) result[i][1]="true";
            else result[i][1]="false";
        }
        return result;
    }

    // Display table
    static void display(String[][] arr) {
        System.out.printf("%-10s%-15s\n","Age","Can Vote?");
        System.out.println("----------------------");
        for(String[] row:arr) {
            System.out.printf("%-10s%-15s\n",row[0],row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[] ages=generateAges(n);
        String[][] result=checkEligibility(ages);
        display(result);
    }
}
