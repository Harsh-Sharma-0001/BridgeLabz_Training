package String.Level1;
public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // throws NullPointerException
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        //generateException(); // Uncomment to see crash
        handleException();
    }
}
