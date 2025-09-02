package Solutions;

class A {
 static int x = 10;  
	}


class B {
 void modifyAndPrint() {
     System.out.println("Initial value of A.x: " + A.x);

    
     A.x = 50;

     System.out.println("Modified value of A.x: " + A.x);
 		}
	}

public class Demo5 {
 public static void main(String[] args) {
     B obj = new B();
     obj.modifyAndPrint();

    
     System.out.println("Accessing A.x from main: " + A.x);
 }
}

