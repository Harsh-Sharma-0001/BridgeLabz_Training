package Solutions;

class Demo4 {
   
    static int num;   


    public static void main(String[] args) {
     
        System.out.println("Default value of static variable: " + Demo4.num);

       
        Demo4.num = 50;

        
        System.out.println("Updated value of static variable: " + Demo4.num);
    }
}
