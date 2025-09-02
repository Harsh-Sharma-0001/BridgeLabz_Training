package Solutions;

public class Demo2 {
	static int count;

    
    static {
        System.out.println("Static block executed!");
        count = 10;
    }



    public static void main(String[] args) {
 
        System.out.println("Value of count: " + Demo2.count);
    	}
	
	}


