public class Studen {
    private String id;
    private String name;
    private double gpa;
    public void setDetails(String ID,String n ,double GPA){
        id = ID;
        name = n;
        gpa = GPA;
    }
    public void showDetails(){
        System.out.println("ID : " + id);
        System.out.println("NAME : " + name);
        System.out.println("GPA : " + gpa);
    }
    public static void main(String[] args) {
        Studen sc1 = new Studen();
        sc1.setDetails("12123", "Thanathip", 4.00);
        sc1.showDetails();
        Studen sc2 = new Studen();
        sc2.setDetails("34123","Thanathip55",3.99);
        sc2.showDetails();
    }
}