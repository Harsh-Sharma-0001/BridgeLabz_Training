package String.Level2;
import java.util.*;

class StudentGrades {
    // Generate random PCM scores
    static int[][] generateScores(int n) {
        Random r=new Random();
        int[][] scores=new int[n][3];
        for(int i=0;i<n;i++) {
            for(int j=0;j<3;j++) {
                scores[i][j]=50+r.nextInt(51); // scores between 50-100
            }
        }
        return scores;
    }

    // Calculate totals
    static double[][] calculateTotals(int[][] scores) {
        int n=scores.length;
        double[][] result=new double[n][4]; // total, avg, percent
        for(int i=0;i<n;i++) {
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double avg=total/3.0;
            double percent=total/3.0;
            result[i][0]=total;
            result[i][1]=avg;
            result[i][2]=Math.round(percent*100.0)/100.0;
        }
        return result;
    }

    // Calculate grades
    static String[] calculateGrades(double[][] totals) {
        String[] grades=new String[totals.length];
        for(int i=0;i<totals.length;i++) {
            double p=totals[i][2];
            if(p>=90) grades[i]="A";
            else if(p>=75) grades[i]="B";
            else if(p>=60) grades[i]="C";
            else if(p>=50) grades[i]="D";
            else grades[i]="F";
        }
        return grades;
    }

    // Display scorecard
    static void display(int[][] scores, double[][] totals, String[] grades) {
        System.out.printf("%-5s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n",
            "ID","Physics","Chem","Maths","Total","Avg","Percent","Grade");
        System.out.println("-----------------------------------------------------------------");
        for(int i=0;i<scores.length;i++) {
            System.out.printf("%-5d%-10d%-10d%-10d%-10.0f%-10.2f%-10.2f%-10s\n",
                (i+1),scores[i][0],scores[i][1],scores[i][2],
                totals[i][0],totals[i][1],totals[i][2],grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[][] scores=generateScores(n);
        double[][] totals=calculateTotals(scores);
        String[] grades=calculateGrades(totals);
        display(scores,totals,grades);
    }
}
