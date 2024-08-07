public class monthday {
    public static void main(String[] args) {
        String[] months = {"January","February","March","April",
        "May","June","July","August","September","Ortober","Noveber","December"};
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int index = 0; index < months.length; index++){
            System.out.println(months[index] + " has " + days[index] + " days.");
        }
    }
}
