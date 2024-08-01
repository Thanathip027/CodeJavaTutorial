public class Result1To100 {
    public static void main(String[] args) {
        int sum = 0,number = 1;
        while (number <= 100) {
            sum += number;  
            number++;  
        }
        System.out.println("Sum 1 to 100 = " + sum);
    }
}