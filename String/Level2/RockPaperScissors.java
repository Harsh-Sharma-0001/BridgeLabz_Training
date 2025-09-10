package String.Level2;
import java.util.*;

class RockPaperScissors {
    static String getComputerChoice() {
        String[] choices={"Rock","Paper","Scissors"};
        return choices[(int)(Math.random()*3)];
    }

    static String findWinner(String user, String comp) {
        if(user.equals(comp)) return "Draw";
        if(user.equals("Rock") && comp.equals("Scissors")) return "User";
        if(user.equals("Scissors") && comp.equals("Paper")) return "User";
        if(user.equals("Paper") && comp.equals("Rock")) return "User";
        return "Computer";
    }

    static void displayResults(String[][] games, int userWins, int compWins) {
        System.out.printf("%-10s%-10s%-10s\n","User","Computer","Winner");
        System.out.println("----------------------------------");
        for(String[] row:games) {
            System.out.printf("%-10s%-10s%-10s\n",row[0],row[1],row[2]);
        }
        int total=games.length;
        System.out.println("\nStats:");
        System.out.println("User Wins: "+userWins+" ("+(userWins*100/total)+"%)");
        System.out.println("Computer Wins: "+compWins+" ("+(compWins*100/total)+"%)");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n=sc.nextInt();
        sc.nextLine();
        String[][] games=new String[n][3];
        int userWins=0, compWins=0;
        for(int i=0;i<n;i++) {
            System.out.print("Enter Rock/Paper/Scissors: ");
            String user=sc.nextLine();
            String comp=getComputerChoice();
            String winner=findWinner(user,comp);
            if(winner.equals("User")) userWins++;
            else if(winner.equals("Computer")) compWins++;
            games[i][0]=user; games[i][1]=comp; games[i][2]=winner;
        }
        displayResults(games,userWins,compWins);
    }
}
