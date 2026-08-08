public class staticmethod {
    
    static void displayMessage() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
       
        displayMessage();

       
        staticmethod.displayMessage();
    }
}
