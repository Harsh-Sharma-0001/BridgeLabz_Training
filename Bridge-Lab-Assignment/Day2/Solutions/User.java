package Solutions;

class User {
    // final instance variable
    final int userId;

    
    User(int id) {
        this.userId = id;
    }

    void displayUser() {
        System.out.println("User ID: " + userId);
    }


    public static void main(String[] args) {
        User u1 = new User(101);
        User u2 = new User(202);

        u1.displayUser();
        u2.displayUser();
    }
}

