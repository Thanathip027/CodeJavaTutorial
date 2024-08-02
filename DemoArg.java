public class DemoArg {
    public static void main(String[] args) {
        System.out.println("star in main");
        int testnum = 10;
        int total;
        displayMessage(5);
        displayMessage(testnum);
        displayMessage(testnum * 5);
        total = showSum(3, 4);
        System.out.println("total have value : " + total);
    }
    public static void displayMessage(int num){
        System.out.println("value is " + num);
    }
    public static int showSum(int x,int y){
        int sum;
        sum = x + y;
        return sum;
    }
}
