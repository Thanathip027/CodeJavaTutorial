public class SimpleMethod {
    public static void main(String[] args) {
        System.out.println("Hello from main method.");
        displayMessage();
        System.out.println("back in the main method.");

    }
    public static void displayMessage(){
        System.out.println("Hello from displayMessage method.");
    }
}