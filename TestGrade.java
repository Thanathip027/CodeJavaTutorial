import java.util.Scanner;
public class TestGrade {
    public static void main(String[] args) {
        int score;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your score : ");
        score = in.nextInt();
        if (score < 50){
            System.out.println("Your grade is F");
            //Statemeat1
        }else if(score < 60){
            System.out.println("Your grade is D");
            //Statemeat2
        }else if(score < 70){
            System.out.println("Your grade is C");
            //Statemeat3
        }else if(score < 80){
            System.out.println("Your grade is B");
            //Statemeat4
        }else if(score <= 100){
            System.out.println("Your grade is A");
            //Statemeat5
        }else{
            System.out.println("Invalid score. ");
            //false
        }
    }
}
