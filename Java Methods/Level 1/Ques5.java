public class Ques5 {
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) ||
            (month == 4) || (month == 5)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        if (isSpringSeason(month, day))
            System.out.println("It's a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
